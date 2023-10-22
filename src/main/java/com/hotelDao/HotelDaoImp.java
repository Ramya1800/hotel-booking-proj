package com.hotelDao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hotelbean.HotelBean;

public class HotelDaoImp implements HotelDao {
	private Connection con;

	public HotelDaoImp() {
		initializeConnection();
	}

	private void initializeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system", "root", "abcd");
		} catch (Exception exception) {
			exception.printStackTrace();

		}
	}

	public void addBookingDetails(HotelBean bean) throws Exception {
		PreparedStatement ps = null;
		try {

			ps = con.prepareStatement("insert into hotel values(?,?,?,?,?,?)");
			ps.setString(1, bean.getBookingId());
			ps.setString(2, bean.getGuestname());
			ps.setString(3, bean.getRoomtype());
			ps.setDate(4, bean.getCheckIn());
			ps.setDate(5, bean.getCheckOut());
			ps.setInt(6, bean.getTotalguest());
			ps.executeUpdate();
			System.out.println("Booking details added successfully ");

		} catch (Exception exception) {
			exception.printStackTrace();
			throw exception;
		} finally {
			if (ps != null)
				ps.close();
			if (con != null)
				con.close();
		}
	}

	public HotelBean display(String bookingId) throws Exception {
		HotelBean bean = null;
		PreparedStatement ps = null;
		try {

			ps = con.prepareStatement("select * from hotel where bookingId=?");
			ps.setString(1, bookingId);
			ResultSet rs = ps.executeQuery();

			boolean isDataFound = false;
			while (rs.next()) {
				System.out.println("Booking Id " + rs.getString(1));
				System.out.println("Guest name " + rs.getString(2));
				System.out.println("Checkin date " + rs.getDate(4));
				System.out.println("Checkout date " + rs.getDate(5));
				isDataFound = true;
			}
			if (!isDataFound) {
				System.out.println("Booking Details not available for the boooking id: " + bookingId);
			}

		} catch (Exception exception) {
			throw exception;
		} finally {
			if (ps != null)
				ps.close();
			if (con != null)
				con.close();
		}
		return bean;
	}

	public HotelBean edit(String bookingId, String roomType) throws Exception {
		HotelBean hotelbean = null;
		PreparedStatement ps = null;
		try {

			ps = con.prepareStatement("update hotel set roomtype=? where bookingId=?");

			ps.setString(1, roomType);
			ps.setString(2, bookingId);
			int updatedRowsCount = ps.executeUpdate();
			if (updatedRowsCount == 0) {
				System.out.println("Booking Details not available for the boooking id: " + bookingId);
			} else {
				System.out.println("Booking details successfully updated ");
			}

		}

		catch (Exception exception) {

			throw exception;
		} finally {
			if (ps != null)
				ps.close();
			if (con != null)
				con.close();
		}

		return hotelbean;

	}

	public void remove(String bookingId) throws Exception {
		PreparedStatement ps = null;
		try {

			ps = con.prepareStatement("delete from hotel where bookingid=?");
			ps.setString(1, bookingId);
			int updatedRowsCount = ps.executeUpdate();
			if (updatedRowsCount == 0) {
				System.out.println("Booking Details not available for the boooking id: " + bookingId);
			} else {
				System.out.println("Your Booking details hs been successfully cancelled  ");
			}

		} catch (Exception exception) {

			exception.printStackTrace();

		} finally {
			if (ps != null)
				ps.close();
			if (con != null)
				con.close();
		}

	}

}

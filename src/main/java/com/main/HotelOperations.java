package com.main;

import java.util.Calendar;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.hotelbean.HotelBean;
import com.hotelservice.HotelService;
import com.hotelservice.HotelServiceImpl;

public class HotelOperations {
	Scanner sc = new Scanner(System.in);

	public void addBookingDetails() {
		try {
			System.out.println("Enter the booking id");
			String bookingId = sc.next();
			System.out.println("Enter the guest name");
			String guestName = sc.next();
			System.out.println("Enter the room type like single,double or suite");
			String roomType = sc.next();
			System.out.println("Enter the total number of guests");
			int totalGuest = sc.nextInt();
			HotelBean bean = new HotelBean();
			bean.setGuestname(guestName);
			bean.setBookingId(bookingId);
			System.out.println("Mention how many days you have to say in hotel ");
			int days = sc.nextInt();
			Date currentDate = new Date();
			java.sql.Date checkinDate = new java.sql.Date(currentDate.getTime());
			java.util.Date futureDay = addDays(currentDate, days);
			java.sql.Date checkoutDate = new java.sql.Date(futureDay.getTime());
			bean.setCheckIn(checkinDate);
			bean.setCheckOut(checkoutDate);
			bean.setRoomtype(roomType);
			bean.setTotalguest(totalGuest);
			HotelService hotelservice = new HotelServiceImpl();

			hotelservice.addBookingDetails(bean);
		} catch (InputMismatchException inputMismatchException) {
			System.out.println("Enter the valid booking details for totalguest or days ");
		} catch (Exception e) {
			System.out.println("Exception in adding booking details: " + e.getMessage());
		}
	}

	public Date addDays(Date date, int days) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE, days);
		return new Date(c.getTimeInMillis());
	}

	public void displayBookingDetails() {
		try {

			HotelService hotelService = new HotelServiceImpl();

			System.out.println("Enter the bookingId");
			String bookingId = sc.next();
			hotelService.display(bookingId);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public void editBookingDetails() {
		try {

			HotelService hotelService = new HotelServiceImpl();
			System.out.println("Enter the bookingId");
			String bookingId = sc.next();
			System.out.println("Mention the room type that you want to change");
			String roomType = sc.next();
			hotelService.edit(bookingId, roomType);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	public void cancelBookingDetails() {
		try {
			HotelService hotelService = new HotelServiceImpl();

			System.out.println("Enter bookingid to cancel your booking");
			String bookingId = sc.next();
			hotelService.remove(bookingId);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

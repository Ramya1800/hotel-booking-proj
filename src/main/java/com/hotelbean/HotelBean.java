package com.hotelbean;

import java.sql.Date;

public class HotelBean {
	private String guestname;

	private String bookingId;
	private Date checkIn;
	private Date checkOut;
	private String roomtype;
	private int totalguest;

	public String getGuestname() {
		return guestname;
	}

	public void setGuestname(String guestname) {
		this.guestname = guestname;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public int getTotalguest() {
		return totalguest;
	}

	public void setTotalguest(int totalguest) {
		this.totalguest = totalguest;
	}

}

package com.hotelservice;

import com.hotelbean.HotelBean;

public interface HotelService {
	void addBookingDetails(HotelBean bean) throws Exception;
 
	HotelBean display(String bookingId) throws Exception;

	HotelBean edit(String bookingId, String roomType) throws Exception;

	void remove(String bookingId) throws Exception;
}

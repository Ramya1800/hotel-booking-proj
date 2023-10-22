package com.hotelservice;

import com.hotelDao.HotelDao;
import com.hotelDao.HotelDaoImp;
import com.hotelbean.HotelBean;

public class HotelServiceImpl implements HotelService {
	public void addBookingDetails(HotelBean bean) throws Exception {
		try {
			HotelDao hoteldao = new HotelDaoImp();
			hoteldao.addBookingDetails(bean);
		} catch (Exception exception) {
			throw exception;
		}

	}

	public HotelBean display(String bookingId) throws Exception {
		HotelBean hotelbean = null;
		try {
			HotelDao hoteldao = new HotelDaoImp();
			hotelbean = hoteldao.display(bookingId);
		} catch (Exception exception) {
			throw exception;
		}
		return hotelbean;
	}

	public HotelBean edit(String bookingId, String roomType) throws Exception {
		HotelBean hotelbean = null;
		try {
			HotelDao hoteldao = new HotelDaoImp();
			hotelbean = hoteldao.edit(bookingId, roomType);
		} catch (Exception exception) {
			throw exception;
		}
		return hotelbean;
	}

	public void remove(String bookingId) throws Exception {

		try {
			HotelDao hoteldao = new HotelDaoImp();
			hoteldao.remove(bookingId);
		} catch (Exception exception) {
			throw exception;
		}
	}

}

package com.main;

import java.util.Scanner;

public class MainDriver {

	// MainDriver->Operations->HotelServiceImpl->HotelDaoImp
	public static void main(String[] args) {
		System.out.println("------------Welcome to Taj Hotel--------------");
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		HotelOperations hotelOperations = new HotelOperations();

		while (flag) {
			System.out.println("Enter 1 to book room" + "\nEnter 2 to Display the booked rooms"
					+ "\nEnter 3 to edit the booking details" + "\nEnter 4 to cancel the booking"
					+ "\nEnter 5 to exit");
			int choice = 0;
			try {
				if (sc == null)
					sc = new Scanner(System.in);
				choice = sc.nextInt();

			} catch (Exception exception) {
				System.out.println("Enter valid input choice number: " + exception.getMessage());
				sc = null;
			}

			switch (choice) {
			case 1:

				hotelOperations.addBookingDetails();

				break;
			case 2:

				hotelOperations.displayBookingDetails();

				break;
			case 3:

				hotelOperations.editBookingDetails();

				break;

			case 4:

				hotelOperations.cancelBookingDetails();

				break;
			case 5:
				System.out.println("Thank you and visit again");
				flag = false;
				break;
			default:
				System.out.println("default");
				break;

			}
		}
		sc.close();
	}

}

package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class TesteException {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date CheckIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(CheckIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}

		else {
			Reservation reservation = new Reservation(number, CheckIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			CheckIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy):");
			checkOut = sdf.parse(sc.next());

			String error = reservation.updateDates(CheckIn, checkOut);
			if (error != null) {
				System.out.println("Reservation in reservation : " + error);
			} else {
				System.out.println("Reservation :" + reservation);
			}
		}

		sc.close();
	}

}

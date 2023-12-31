package com.greatlearning.assignment;

import java.util.Scanner;

import com.greatlearning.service.FloorConstruction;

public class Main {
	public static void main(String[] args) {

		int floorArray[];
		int floorSize;
		// Get the input value for total number of floors to be constructed
		System.out.println("Enter the total no of floors in the building ");

		Scanner scanner = new Scanner(System.in);
		floorSize = scanner.nextInt();
		// Initialize array with received floor size value
		floorArray = new int[floorSize];
		// Get the user input of different floor number different factory every day

		for (int i = 0; i < floorSize; i++) {
			System.out.println("Enter the floor size given on day " + (i + 1));
			floorArray[i] = scanner.nextInt();
		}
		// Call the method to arrange the floors according to the size
		FloorConstruction ls = new FloorConstruction();
		ls.sortList(floorSize, floorArray);
		scanner.close();
	}
}

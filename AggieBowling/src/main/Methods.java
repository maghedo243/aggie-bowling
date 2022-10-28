package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods {
	public static int Menu(String[] options) {
		int selection = 0;
		Scanner scnr = new Scanner(System.in);
		for(int i = 0; i < options.length; i++) {
			System.out.println((i+1) + ") " + options[i]);
		}
		while(true) {
			try {
				System.out.print("> ");
				selection = scnr.nextInt();
				if(selection < 1 || selection > options.length) {
					System.out.println("Out of range selection");
				} else {
					break;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Must be a number");
				scnr.nextLine();
			}
		}
		return selection;		
	}
}

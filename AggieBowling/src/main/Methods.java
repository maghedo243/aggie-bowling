package main;

import java.util.ArrayList;
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
	
	public static int Menu(ArrayList<String> options) {
		int selection = 0;
		Scanner scnr = new Scanner(System.in);
		for(int i = 0; i < options.size(); i++) {
			System.out.println((i+1) + ") " + options.get(i));
		}
		while(true) {
			try {
				System.out.print("> ");
				selection = scnr.nextInt();
				if(selection < 1 || selection > options.size()) {
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
	
	public static String intArrayToString(int[] array) {
		String out = "{";
		for(int x: array) {
			out += x + ",";
		}
		out = out.substring(0,out.length()-1);
		out += "}";
		return out;
	}
}

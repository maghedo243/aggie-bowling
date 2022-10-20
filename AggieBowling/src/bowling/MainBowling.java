package bowling;

import java.util.Scanner;


public class MainBowling {
	
	//Roll Ball function
	public static int rollBall(char[] pins, int rollingline) {
		
		int count = 0;
		//Roll Calculations
		if(rollingline == 1) {
			count = PinEngine.pin7(7,pins,1);
		} else if (rollingline == 2) {
			count = PinEngine.pin4(4, pins, 1);
		} else if (rollingline == 3) {
			count = PinEngine.pin2(2, pins, 1);
		} else if (rollingline == 4) {
			count = PinEngine.pin1(1, pins, 1);
		} else if (rollingline == 5) {
			count = PinEngine.pin3(3, pins, 1);
		} else if (rollingline == 6) {
			count = PinEngine.pin6(6, pins, 1);
		} else if (rollingline == 7) {
			count = PinEngine.pin10(10, pins, 1);
		}
		
		return count;
		
	}
	
	
	//Method to choose the line you roll the ball in
	public static int selectLine(char[] pins) {
		Scanner scnr = new Scanner(System.in);
		boolean done = false;
		boolean done2 = true;
		int rollnum = 4;
		char h = ' ';
		
		//Select movement type
		while(!done) {
			done2 = true;
			printLane(pins, rollnum);
			System.out.println("U: Move arrow up\n"
							 + "D: Move arrow down\n"
							 + "R: Roll ball");
			//Input Validation
			while(done2) {
				System.out.print("> ");
				h = scnr.next().toUpperCase().charAt(0);
				switch(h) {
					case 'U':
					case 'D':
					case 'R':
						done2 = false;
						break;
					default:
						System.out.println("Invalid");
						break;
				}
			}
		
			switch(h) {
				case 'U':
					if(rollnum != 1) {	
						rollnum -= 1;
					}
					break;
				case 'D':
					if(rollnum != 7) {	
						rollnum += 1;
					}
					break;
				case 'R':
					done = true;
					break;
			}
		}
		
		return rollnum;
	}
	
	
	//Prints bowling lane
	public static void printLane(char[] pins, int lanearrow) {
		System.out.println("    __________________________________________________________________________________________________");
		System.out.println("   ▕                                                                                                 ▕");
		if(lanearrow == 1) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("                                 ➤                                                          "+(lanearrow == 1 ? "> " : "  ")+pins[6]+"  ▕");
		if(lanearrow == 2) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                            ➤                                                       "+(lanearrow == 2 ? "> " : "  ")+pins[3]+"    ▕");
		if(lanearrow == 3) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                             ➤                                                    "+(lanearrow == 3 ? "> " : "  ")+pins[1]+"   "+pins[7]+"  ▕");
		if(lanearrow == 4) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                              ➤                                                 "+(lanearrow == 4 ? "> " : "  ")+pins[0]+"   "+pins[4]+"    ▕");
		if(lanearrow == 5) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                             ➤                                                    "+(lanearrow == 5 ? "> " : "  ")+pins[2]+"   "+pins[8]+"  ▕");
		if(lanearrow == 6) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                            ➤                                                       "+(lanearrow == 6 ? "> " : "  ")+pins[5]+"    ▕");
		if(lanearrow == 7 ) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("                                 ➤                                                          "+(lanearrow == 7 ? "> " : "  ")+pins[9]+"  ▕");
		System.out.println("   ▕                                                                                                 ▕");
		System.out.println("    ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
	}

	
}

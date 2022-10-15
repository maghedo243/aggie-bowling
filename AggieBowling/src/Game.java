import java.util.Random;
import java.util.Scanner;


public class Game {
	
	static Random rndm = new Random();
	
	//Fills pin array
	public static void resetPins(char[] pins) {
		for(int i = 0; i < pins.length; i++) {
			pins[i] = '●';
		}
	}

	
	public static int takeTurn(char[] pins) {
		int line = selectLine(pins);
		return rollBall(pins,line);
		
	}
	
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

	
	//Prints frames for one player
	public static void printFrames(int[] frames) {
		System.out.println(" ____________________________________________________________\n"
				+ "|__1__|__2__|__3__|__4__|__5__|__6__|__7__|__8__|__9__|__10__|\n"
				
				+ "|  "+(frameOneCalc(frames[0],frames[1]))+"|"+(frameTwoCalc(frames[0],frames[1]))+"|  "+(frameOneCalc(frames[2],frames[3]))+"|"+(frameTwoCalc(frames[2],frames[3]))+"|  "+(frameOneCalc(frames[4],frames[5]))+"|"+(frameTwoCalc(frames[4],frames[5]))+"|  "+(frameOneCalc(frames[6],frames[7]))+"|"+(frameTwoCalc(frames[6],frames[7]))+"|  "+(frameOneCalc(frames[8],frames[9]))+"|"+(frameTwoCalc(frames[8],frames[9]))+"|  "+(frameOneCalc(frames[10],frames[11]))+"|"+(frameTwoCalc(frames[10],frames[11]))+"|  "+(frameOneCalc(frames[12],frames[13]))+"|"+(frameTwoCalc(frames[12],frames[13]))+"|  "+(frameOneCalc(frames[14],frames[15]))+"|"+(frameTwoCalc(frames[14],frames[15]))+"|  "+(frameOneCalc(frames[16],frames[17]))+"|"+(frameTwoCalc(frames[16],frames[17]))+"| "+lastFrameOneCalc(frames[18],frames[19],frames[20])+"|"+lastFrameTwoCalc(frames[18],frames[19],frames[20])+"|"+lastFrameThreeCalc(frames[18],frames[19],frames[20])+"|\n"
				
				+ "|     |     |     |     |     |     |     |     |     |      |\n"
				+ "|_____|_____|_____|_____|_____|_____|_____|_____|_____|______|\n"
				+ "");
	}
	
	public static String frameOneCalc(int a, int b) {
		if(a == 0) {
			return "-";
		} else if (a == 10 ||  a == -1){
			return " ";
		} else if(a + b < 10) {
			return a + "";
		} else if (a != 10) {
			return a + "";
		} else {
			return "-";
		}
	}
	
	public static String frameTwoCalc(int a, int b) {
		if(a == 0 && b == 0) {
			return "-";
		} else if (b == -1) {
			return "_";
		} else if(a + b < 10) {
			return b + "";
		} else if (a != 10 || a == 0 && b == 10) {
			return "/";
		} else {
			return "X";
		}
	}
	
	public static String lastFrameOneCalc(int a, int b, int c) {
		if(a == 10) {
			return "X";
		} else if (a == -1) {
			return " ";
		} else if(a == 0){
			return "-";
		} else {
			return a + "";
		}
	}
	
	public static String lastFrameTwoCalc(int a, int b, int c) {
		if(b == -1) {
			return "_";
		} else if(b == 10 && a != 0) {
			return "X";
		} else if (b == 10 && a == 0) {
			return "/";
		} else if (b == 0) {
			return "-";
		} else if (a + b == 10) {
			return "/";
		} else {
			return b+"";
		}
	}
	
	public static String lastFrameThreeCalc(int a, int b, int c) {
		if(c == -1) {
			return "_";
		} else if(c == 10 && b != 0) {
			return "X";
		} else if (c == 10 && b == 0) {
			return "/";
		} else if (c == 0) {
			return "-";
		} else if (b + c == 10) {
			return "/";
		} else {
			return c+"";
		}
	}
}

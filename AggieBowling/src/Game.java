import java.util.Scanner;

public class Game {
	
	public static void resetPins(char[] pins) {
		for(int i = 0; i < pins.length; i++) {
			pins[i] = '●';
		}
	}
	
	public static void rollBall(char[] pins) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("FIXME: Roll ball");
		boolean done = false;
		boolean done2 = true;
		int rollnum = 0;
		char h = ' ';
		
		while(!done) {
			done2 = true;
			printLane(pins, rollnum);
			System.out.println("U: Move arrow up\n"
							 + "D: Move arrow down\n"
							 + "R: Roll ball");
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
					if(rollnum != 0) {	
						rollnum -= 1;
					}
					break;
				case 'D':
					if(rollnum != 6) {	
						rollnum += 1;
					}
					break;
				case 'R':
					done = true;
					break;
			}
		}
		
	}
	
	public static void printLane(char[] pins, int lanearrow) {
		System.out.println("    __________________________________________________________________________________________________");
		System.out.println("   ▕                                                                                                 ▕");
		if(lanearrow == 0) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("                                 ➤                                                            "+pins[6]+"  ▕");
		if(lanearrow == 1) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                            ➤                                                         "+pins[3]+"    ▕");
		if(lanearrow == 2) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                             ➤                                                      "+pins[1]+"   "+pins[7]+"  ▕");
		if(lanearrow == 3) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                              ➤                                                   "+pins[0]+"   "+pins[4]+"    ▕");
		if(lanearrow == 4) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                             ➤                                                      "+pins[2]+"   "+pins[8]+"  ▕");
		if(lanearrow == 5) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                            ➤                                                         "+pins[5]+"    ▕");
		if(lanearrow == 6) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("                                 ➤                                                            "+pins[9]+"  ▕");
		System.out.println("   ▕                                                                                                 ▕");
		System.out.println("    ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
	}
}

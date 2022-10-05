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

	
	public static void takeTurn(char[] pins) {
		int line = selectLine(pins);
		rollBall(pins,line);
		
	}
	
	//Roll Ball function
	public static void rollBall(char[] pins,int rollingline) {
		int count = 0;
		//Roll Calculations
		if(rollingline == 1) {
			if(rndm.nextInt(2) == 0) {
				pins[6] = '·';
				++count;
				if(rndm.nextInt(50) == 42) {
					pins[7] = '·';
					++count;
				}
			}
			
		} else if(rollingline == 2) {
			if(rndm.nextInt(2) == 0) {
				pins[3] = '·';
				++count;
				if(rndm.nextInt(50) == 42) {
					pins[4] = '·';
					++count;
					if(rndm.nextInt(100) == 42) {
						pins[8] = '·';
						++count;
					}
				}
				
				if(rndm.nextInt(4) == 2) {
					pins[7] = '·';
					++count;
					if(rndm.nextInt(100) == 42) {
						if(pins[8] != '·') {
							pins[8] = '·';
							++count;
						}
					}
				}
				
				if(rndm.nextInt(4) == 2) {
					pins[6] = '·';
					++count;
				}
				
				return;	
			}
			
			//else case - if the top pin is misses
			if(rndm.nextInt(2) == 0) {
				if(pins[6] != '·') {
					pins[6] = '·';
					++count;
				}
			}
			
		} else if(rollingline == 3){
			if(rndm.nextInt(2) == 0) {
				pins[1] = '·';
				++count;
				if(rndm.nextInt(3) == 2) {
					pins[2] = '·';
					++count;
					if(rndm.nextInt(4) == 2) {
						pins[5] = '·';
						++count;
						if(rndm.nextInt(10) == 2) {
							pins[8] = '·';
							++count;
						}
						if(rndm.nextInt(3) == 2) {
							pins[9] = '·';
							++count;
						}
					}// end if
				}
				
				if(rndm.nextInt(3) == 2) {
					pins[3] = '·';
					++count;
					if(rndm.nextInt(4) == 2) {
						pins[6] = '·';
						++count;
						
					}
					if(rndm.nextInt(10) == 2) {
						pins[7] = '·';
						++count;
					}
				}
					
					
			}
			
			//else case
			if(rndm.nextInt(2) == 0) {
				pins[3] = '·';
				++count;
				if(rndm.nextInt(50) == 42) {
					pins[4] = '·';
					++count;
					if(rndm.nextInt(100) == 42) {
						pins[8] = '·';
						++count;
					}
				}
				
				if(rndm.nextInt(4) == 2) {
					pins[7] = '·';
					++count;
					if(rndm.nextInt(100) == 42) {
						if(pins[8] != '·') {
							pins[8] = '·';
							++count;
						}
					}
				}
				
				//else else case
				if(rndm.nextInt(4) == 2) {
					pins[6] = '·';
					++count;
				}
			
			}
			
		} // end if
		
		System.out.println(count);
		
	}
	
	
	//Method to choose the line you roll the ball in
	public static int selectLine(char[] pins) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("FIXME: Roll ball");
		boolean done = false;
		boolean done2 = true;
		int rollnum = 1;
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
		System.out.println("                                 ➤                                                            "+pins[6]+"  ▕");
		if(lanearrow == 2) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                            ➤                                                         "+pins[3]+"    ▕");
		if(lanearrow == 3) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                             ➤                                                      "+pins[1]+"   "+pins[7]+"  ▕");
		if(lanearrow == 4) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                              ➤                                                   "+pins[0]+"   "+pins[4]+"    ▕");
		if(lanearrow == 5) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                             ➤                                                      "+pins[2]+"   "+pins[8]+"  ▕");
		if(lanearrow == 6) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("   · ·                            ➤                                                         "+pins[5]+"    ▕");
		if(lanearrow == 7 ) {
			System.out.print("-->▕");
		} else {
			System.out.print("   ▕");
		}
		System.out.println("                                 ➤                                                            "+pins[9]+"  ▕");
		System.out.println("   ▕                                                                                                 ▕");
		System.out.println("    ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
	}
}

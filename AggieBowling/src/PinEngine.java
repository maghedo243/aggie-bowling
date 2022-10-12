import java.util.Random;

public class PinEngine {
	
	static Random rndm = new Random();
	
	public static int pin1(int origin, char[] pins, double rate) {
		int count = 0;
		if(rndm.nextInt((int) (2*rate)) == 1) {
			if(pins[0] != '·') {
				count++;
			}
			pins[0] = '·';
			
			count += pin2(1,pins,1);
			count += pin3(1,pins,1);
		} else {
			count += pin2(1,pins,1);
			count += pin3(1,pins,1);
		}
		
		return count;
	}
	
	public static int pin2(int origin, char[] pins, double rate) {
		int count = 0;
		if(origin == 2) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[1] != '·') {
					count++;
				}
				pins[1] = '·';
				
				count += pin3(2,pins,4);
				count += pin4(2,pins,1);
				count += pin5(2,pins,1);
			} else {
				count += pin4(2,pins,3);
			}
			
		} else if (origin == 3) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[1] != '·') {
					count++;
				}
				pins[1] = '·';
				
				count += pin4(2,pins,2);
				count += pin5(2,pins,2);
			}
		} else if (origin == 1) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[1] != '·') {
					count++;
				}
				pins[1] = '·';
				count += pin3(2,pins,4);
				count += pin4(2,pins,1);
				count += pin5(2,pins,1);
			}
		}
		
		return count;
	}
	
	public static int pin3(int origin, char[] pins, double rate) {
		int count = 0;
		if(origin == 3) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[2] != '·') {
					count++;
				}
				pins[2] = '·';
				
				count += pin2(3,pins,4);
				count += pin5(3,pins,1);
				count += pin6(3,pins,1);
			} else {
				count += pin6(3,pins,3);
			}
			
		} else if (origin == 2) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[2] != '·') {
					count++;
				}
				pins[2] = '·';
				
				count += pin5(3,pins,2);
				count += pin6(3,pins,2);
			}
		} else if (origin == 1) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[2] != '·') {
					count++;
				}
				pins[2] = '·';
				
				count += pin2(3,pins,4);
				count += pin5(3,pins,1);
				count += pin6(3,pins,1);
			}
		}
		
		return count;
	}
	
	public static int pin4(int origin, char[] pins, double rate) {
		int count = 0;
		if(origin == 4) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[3] != '·') {
					count++;
					
				}
				pins[3] = '·';
				count += pin5(4,pins,4);
				count += pin7(4,pins,1);
				count += pin8(4,pins,1);
				
			} else {
				count += pin7(4,pins,2);
			}
			
			if(pins[3] == '·' && pins[7] != '·') {
				count += pin8(4,pins,1);
			}
			
			
		} else if(origin == 2) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[3] != '·') {
					count++;
				}
				pins[3] = '·';
				count += pin5(4,pins,7);
				count += pin7(4,pins,2);
				count += pin8(4,pins,2);
			}
		} else if(origin == 5) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[3] != '·') {
					count++;
				}
				pins[3] = '·';
				count += pin7(4,pins,4);
				count += pin8(4,pins,4);
			}
		}
		
		return count;
	}
	
	public static int pin5(int origin, char[] pins, double rate) {
		int count = 0;
		if(origin == 4) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[4] != '·') {
					count++;
				}
				pins[4] = '·';
				count += pin6(5,pins,3);
				count += pin9(5,pins,3);
			}
		} else if (origin == 2) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[4] != '·') {
					count++;
				}
				pins[4] = '·';
				count += pin6(5,pins,3);
				count += pin8(5,pins,2);
				count += pin9(5,pins,2);
			}
		} else if (origin == 3) {
			if(pins[4] != '·') {
				count++;
			}
			pins[4] = '·';
			count += pin4(5,pins,3);
			count += pin8(5,pins,2);
			count += pin9(5,pins,2);
		}
		
		
		
		return count;
	}
	
	public static int pin6(int origin, char[] pins, double rate) {
		int count = 0;
		if(origin == 6) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[5] != '·') {
					count++;
				}
				pins[5] = '·';
				count += pin5(6,pins,4);
				count += pin9(6,pins,1);
				count += pin10(6,pins,1);
			} else {
				count += pin10(6,pins,2);
			}
			
		} else if (origin == 5) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[5] != '·') {
					count++;
				}
				pins[5] = '·';
				count += pin9(6,pins,1);
				count += pin10(6,pins,1);
			}
			
			if(pins[5] == '·' && pins[8] != '·') {
				count += pin9(6,pins,1);
			}
			
		} else if(origin == 3) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[5] != '·') {
					count++;
				}	
				pins[5] = '·';
				
				count += pin5(6,pins,4);
				count += pin9(6,pins,1);
				count += pin10(6,pins,1);
			}
		}
		
		return count;
	}
	
	public static int pin7(int origin, char[] pins, double rate) {
		int count = 0;
		if(origin == 7) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[6] != '·') {
					count++;
					count += pin8(7,pins,2);
				}
				pins[6] = '·';
				
			}
		} else if (origin == 4) {
			if(rndm.nextInt((int) (2*rate)) == 2) {
				if(pins[6] != '·') {
					count++;
				}
				pins[6] = '·';
				if(pins[7] != '·') {
					count += pin8(7,pins,2);
				}
			}
		} else if (origin == 8) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[6] != '·') {
					count++;
				}
				pins[6] = '·';
			}
		}
		
		return count;
	}
	
	public static int pin8(int origin, char[] pins, double rate) {
		int count = 0;
		if(origin == 7) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[7] != '·') {
					count++;
				}
				pins[7] = '·';
				if(pins[8] != '·') {
					count += pin9(8,pins,4);
				}
			}
		} else if (origin == 4 || origin == 5) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[7] != '·') {
					count++;
				}
				pins[7] = '·';
				if(pins[6] != '·') {
					count += pin7(8,pins,2);
				}
				if(pins[8] != '·') {
					count += pin9(8,pins,2);
				}
			}
		} else if (origin == 9) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[7] != '·') {
					count++;
				}
				pins[7] = '·';
				if(pins[6] != '·') {
					count += pin7(8,pins,4);
				}
			}
		}
		
		return count;
	}
	
	public static int pin9(int origin, char[] pins, double rate) {
		int count = 0;
		if(origin == 8) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[8] != '·') {
					count++;
				}
				pins[8] = '·';
				if(pins[9] != '·') {
					count += pin10(9,pins,4);
				}
				
			}
		} else if (origin == 5 || origin == 6) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[8] != '·') {
					count++;
				}
				pins[8] = '·';
				if(pins[7] != '·') {
					count += pin8(9,pins,3);
				}
				if(pins[9] != '·') {
					count += pin10(9,pins,3);
				}
			}
		} else if (origin == 10) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[8] != '·') {
					count++;
				}
				pins[8] = '·';
				if(pins[7] != '·') {
					count += pin8(9,pins,4);
				}
				
			}
		}
		
		return count;
	}
	
	public static int pin10(int origin, char[] pins, double rate) {
		int count = 0;
		if(origin == 10) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[9] != '·') {
					count++;
					count += pin9(10,pins,3);
				}
				pins[9] = '·';
				
			}
		} else if (origin == 9) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[9] != '·') {
					count++;
				}
				pins[9] = '·';
			}
		} else if(origin == 6) {
			if(rndm.nextInt((int) (2*rate)) == 1) {
				if(pins[9] != '·') {
					count++;
				}
				pins[9] = '·';
				if(pins[8] != '·') {
					count += pin9(10,pins,2);
				}
			}
		}
		
		
		return count;
	}
}

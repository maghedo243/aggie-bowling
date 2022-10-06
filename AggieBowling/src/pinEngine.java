import java.util.Random;

public class pinEngine {
	
	static Random rndm = new Random();
	
	public static void pin1(int origin, char[] pins, double rate) {
		
	}
	
	public static void pin2(int origin, char[] pins, double rate) {
		
	}
	
	public static void pin3(int origin, char[] pins, double rate) {
		
	}
	
	public static void pin4(int origin, char[] pins, double rate) {
		
	}
	
	public static void pin5(int origin, char[] pins, double rate) {
		
	}
	
	public static void pin6(int origin, char[] pins, double rate) {
		
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
			if(rndm.nextInt((int) (3*rate)) == 2) {
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
					count += pin9(8,pins,5);
				}
			}
		} else if (origin == 4 || origin == 5) {
			if(rndm.nextInt((int) (3*rate)) == 1) {
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
					count += pin7(8,pins,5);
				}
			}
		}
		
		return count;
	}
	
	public static int pin9(int origin, char[] pins, double rate) {
		int count = 0;
		
		
		pins[8] = '·';
		return 1;
	}
	
	public static void pin10(int origin, char[] pins, double rate) {
		
	}
}

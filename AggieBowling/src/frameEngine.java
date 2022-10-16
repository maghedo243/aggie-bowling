
public class frameEngine {
	
	//Prints frames for 1 player
	public static void printFrames(int[] frames) {
		System.out.println(" ____________________________________________________________");
		System.out.println("|__1__|__2__|__3__|__4__|__5__|__6__|__7__|__8__|__9__|__10__|");
		
		//Box Line
		System.out.print("|  ");
		System.out.print(boxOneCalc(frames[0],frames[1])); //box 1
		System.out.print("|");
		System.out.print(boxTwoCalc(frames[0],frames[1])); //box 2
		System.out.print("|  ");
		System.out.print(boxOneCalc(frames[2],frames[3])); //box 3
		System.out.print("|");
		System.out.print(boxTwoCalc(frames[2],frames[3])); //box 4
		System.out.print("|  ");
		System.out.print(boxOneCalc(frames[4],frames[5])); //box 5
		System.out.print("|");
		System.out.print(boxTwoCalc(frames[4],frames[5])); //box 6
		System.out.print("|  ");
		System.out.print(boxOneCalc(frames[6],frames[6])); //box 7
		System.out.print("|");
		System.out.print(boxTwoCalc(frames[6],frames[7])); //box 8
		System.out.print("|  ");
		System.out.print(boxOneCalc(frames[8],frames[9])); //box 9
		System.out.print("|");
		System.out.print(boxTwoCalc(frames[8],frames[9])); //box 10
		System.out.print("|  ");
		System.out.print(boxOneCalc(frames[10],frames[11])); //box 11
		System.out.print("|");
		System.out.print(boxTwoCalc(frames[10],frames[11])); //box 12
		System.out.print("|  ");
		System.out.print(boxOneCalc(frames[12],frames[13])); //box 12
		System.out.print("|");
		System.out.print(boxTwoCalc(frames[12],frames[13])); //box 14
		System.out.print("|  ");
		System.out.print(boxOneCalc(frames[14],frames[1])); //box 15
		System.out.print("|");
		System.out.print(boxTwoCalc(frames[14],frames[15])); //box 16
		System.out.print("|  ");
		System.out.print(boxOneCalc(frames[16],frames[17])); //box 17
		System.out.print("|");
		System.out.print(boxTwoCalc(frames[16],frames[17])); //box 18
		System.out.print("| ");
		System.out.print(lastBoxOneCalc(frames[18],frames[19],frames[20])); //box 19
		System.out.print("|");
		System.out.print(lastBoxTwoCalc(frames[18],frames[19],frames[20])); //box 20
		System.out.print("|");
		System.out.print(lastBoxThreeCalc(frames[18],frames[19],frames[20])); //box 21
		System.out.println("|");
		//end box line
		
		System.out.println("|     |     |     |     |     |     |     |     |     |      |");
		System.out.println("|_____|_____|_____|_____|_____|_____|_____|_____|_____|______|");
	}
	
	//Calculates 1st framebox
	public static String boxOneCalc(int a, int b) {
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
	
	//Calculates 2nd framebox
	public static String boxTwoCalc(int a, int b) {
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
	
	//Calculates 1st final framebox
	public static String lastBoxOneCalc(int a, int b, int c) {
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
	
	//Calculates 2nd final framebox
	public static String lastBoxTwoCalc(int a, int b, int c) {
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
	
	//Calculates 3rd final framebox
	public static String lastBoxThreeCalc(int a, int b, int c) {
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

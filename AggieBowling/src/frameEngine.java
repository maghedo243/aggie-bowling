
public class frameEngine {
	
	public static void printFrames(int[] frames) {
		System.out.println(" ____________________________________________________________");
		System.out.println("|__1__|__2__|__3__|__4__|__5__|__6__|__7__|__8__|__9__|__10__|");
		
		//Box Line
		System.out.print("|  ");
		System.out.print(frameOneCalc(frames[0],frames[1])); //box 1
		System.out.print("|");
		System.out.print(frameTwoCalc(frames[0],frames[1])); //box 2
		System.out.print("|  ");
		System.out.print(frameOneCalc(frames[2],frames[3])); //box 3
		System.out.print("|");
		System.out.print(frameTwoCalc(frames[2],frames[3])); //box 4
		System.out.print("|  ");
		System.out.print(frameOneCalc(frames[4],frames[5])); //box 5
		System.out.print("|");
		System.out.print(frameTwoCalc(frames[4],frames[5])); //box 6
		System.out.print("|  ");
		System.out.print(frameOneCalc(frames[6],frames[6])); //box 7
		System.out.print("|");
		System.out.print(frameTwoCalc(frames[6],frames[7])); //box 8
		System.out.print("|  ");
		System.out.print(frameOneCalc(frames[8],frames[9])); //box 9
		System.out.print("|");
		System.out.print(frameTwoCalc(frames[8],frames[9])); //box 10
		System.out.print("|  ");
		System.out.print(frameOneCalc(frames[10],frames[11])); //box 11
		System.out.print("|");
		System.out.print(frameTwoCalc(frames[10],frames[11])); //box 12
		System.out.print("|  ");
		System.out.print(frameOneCalc(frames[12],frames[13])); //box 12
		System.out.print("|");
		System.out.print(frameTwoCalc(frames[12],frames[13])); //box 14
		System.out.print("|  ");
		System.out.print(frameOneCalc(frames[14],frames[1])); //box 15
		System.out.print("|");
		System.out.print(frameTwoCalc(frames[14],frames[15])); //box 16
		System.out.print("|  ");
		System.out.print(frameOneCalc(frames[16],frames[17])); //box 17
		System.out.print("|");
		System.out.print(frameTwoCalc(frames[16],frames[17])); //box 18
		System.out.print("| ");
		System.out.print(lastFrameOneCalc(frames[18],frames[19],frames[20])); //box 19
		System.out.print("|");
		System.out.print(lastFrameTwoCalc(frames[18],frames[19],frames[20])); //box 20
		System.out.print("|");
		System.out.print(lastFrameThreeCalc(frames[18],frames[19],frames[20])); //box 21
		System.out.println("|");
		//end box line
		
		System.out.println("|     |     |     |     |     |     |     |     |     |      |");
		System.out.println("|_____|_____|_____|_____|_____|_____|_____|_____|_____|______|");
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

package bowling;

public class FrameEngine {
	
	//Prints frames for 1 player
	public static void printFrames(int[] boxes,int[]frames) {
		System.out.println(" ____________________________________________________________");
		System.out.println("|__1__|__2__|__3__|__4__|__5__|__6__|__7__|__8__|__9__|__10__|");
		
		//Box Line
		System.out.print("|  ");
		System.out.print(boxOneCalc(boxes[0],boxes[1])); //box 1
		System.out.print("|");
		System.out.print(boxTwoCalc(boxes[0],boxes[1])); //box 2
		System.out.print("|  ");
		System.out.print(boxOneCalc(boxes[2],boxes[3])); //box 3
		System.out.print("|");
		System.out.print(boxTwoCalc(boxes[2],boxes[3])); //box 4
		System.out.print("|  ");
		System.out.print(boxOneCalc(boxes[4],boxes[5])); //box 5
		System.out.print("|");
		System.out.print(boxTwoCalc(boxes[4],boxes[5])); //box 6
		System.out.print("|  ");
		System.out.print(boxOneCalc(boxes[6],boxes[6])); //box 7
		System.out.print("|");
		System.out.print(boxTwoCalc(boxes[6],boxes[7])); //box 8
		System.out.print("|  ");
		System.out.print(boxOneCalc(boxes[8],boxes[9])); //box 9
		System.out.print("|");
		System.out.print(boxTwoCalc(boxes[8],boxes[9])); //box 10
		System.out.print("|  ");
		System.out.print(boxOneCalc(boxes[10],boxes[11])); //box 11
		System.out.print("|");
		System.out.print(boxTwoCalc(boxes[10],boxes[11])); //box 12
		System.out.print("|  ");
		System.out.print(boxOneCalc(boxes[12],boxes[13])); //box 12
		System.out.print("|");
		System.out.print(boxTwoCalc(boxes[12],boxes[13])); //box 14
		System.out.print("|  ");
		System.out.print(boxOneCalc(boxes[14],boxes[1])); //box 15
		System.out.print("|");
		System.out.print(boxTwoCalc(boxes[14],boxes[15])); //box 16
		System.out.print("|  ");
		System.out.print(boxOneCalc(boxes[16],boxes[17])); //box 17
		System.out.print("|");
		System.out.print(boxTwoCalc(boxes[16],boxes[17])); //box 18
		System.out.print("| ");
		System.out.print(lastBoxOneCalc(boxes[18],boxes[19],boxes[20])); //box 19
		System.out.print("|");
		System.out.print(lastBoxTwoCalc(boxes[18],boxes[19],boxes[20])); //box 20
		System.out.print("|");
		System.out.print(lastBoxThreeCalc(boxes[18],boxes[19],boxes[20])); //box 21
		System.out.println("|");
		//end box line
		
		//Frame Score Line
		System.out.print("| ");
		System.out.print(frames[0] < 0 ? "   " : (frames[0] < 10 ? " "+frames[0]+" ": (frames[0] < 100 ? " "+frames[0] : frames[0])));
		System.out.print(" | ");
		System.out.print(frames[1] < 0 ? "   " : (frames[1] < 10 ? " "+frames[1]+" ": (frames[1] < 100 ? " "+frames[1] : frames[1])));
		System.out.print(" | ");
		System.out.print(frames[2] < 0 ? "   " : (frames[2] < 10 ? " "+frames[2]+" ": (frames[2] < 100 ? " "+frames[2] : frames[2])));
		System.out.print(" | ");
		System.out.print(frames[3] < 0 ? "   " : (frames[3] < 10 ? " "+frames[3]+" ": (frames[3] < 100 ? " "+frames[3] : frames[3])));		
		System.out.print(" | ");
		System.out.print(frames[4] < 0 ? "   " : (frames[4] < 10 ? " "+frames[4]+" ": (frames[4] < 100 ? " "+frames[4] : frames[4])));
		System.out.print(" | ");
		System.out.print(frames[5] < 0 ? "   " : (frames[5] < 10 ? " "+frames[5]+" ": (frames[5] < 100 ? " "+frames[5] : frames[5])));
		System.out.print(" | ");
		System.out.print(frames[6] < 0 ? "   " : (frames[6] < 10 ? " "+frames[6]+" ": (frames[6] < 100 ? " "+frames[6] : frames[6])));
		System.out.print(" | ");
		System.out.print(frames[7] < 0 ? "   " : (frames[7] < 10 ? " "+frames[7]+" ": (frames[7] < 100 ? " "+frames[7] : frames[7])));
		System.out.print(" | ");
		System.out.print(frames[8] < 0 ? "   " : (frames[8] < 10 ? " "+frames[8]+" ": (frames[8] < 100 ? " "+frames[8] : frames[8])));
		System.out.print(" | ");
		
		System.out.print(frames[9] < 0 ? "    " : (frames[9] < 10 ? "  "+frames[9] + " " : (frames[9] < 100 ? " " + frames[9] + " " : " " +frames[9])));
		
		System.out.println(" |");
		//end frame score line
		
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
		if(a == 0 && b == 0 || a != 10 && b == 0 && a != 0) {
			return "-";
		} else if(a == 10) {
			return "X";
		} else if (b == -1) {
			return "_";
		} else if(a + b < 10) {
			return b + "";
		} else if (a != 10 || a == 0 && b == 10) {
			return "/";
		} else {
			return "_";
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


public class Game {
	
	public static void resetPins(char[] pins) {
		for(int i = 0; i < pins.length; i++) {
			pins[i] = '●';
		}
	}
	
	public static void rollBall() {
		System.out.println("FIXME: Roll ball");
	}
	
	public static void printLane(char[] pins) {
		System.out.println("__________________________________________________________________________________________________");
		System.out.println("");
		System.out.println("                                 ➤                                                            "+pins[6]+"    ");
		System.out.println("   · ·                            ➤                                                         "+pins[3]+"      ");
		System.out.println("   · ·                             ➤                                                      "+pins[1]+"   "+pins[7]+"    ");
		System.out.println("   · ·                              ➤                                                   "+pins[0]+"   "+pins[4]+"      ");
		System.out.println("   · ·                             ➤                                                      "+pins[2]+"   "+pins[8]+"    ");
		System.out.println("   · ·                            ➤                                                         "+pins[5]+"      ");
		System.out.println("                                 ➤                                                            "+pins[9]+"    ");
		System.out.println("");
		System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
	}
}

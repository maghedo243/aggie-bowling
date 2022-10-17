package main;

public class Central {

	public static void main(String[] args) {
		int num;
		char[] pingroup = {'●','·','●','●','·','·','●','●','·','●'};
		System.out.println("\n"
				+ " █████╗  ██████╗  ██████╗ ██╗███████╗    ██████╗  ██████╗ ██╗    ██╗██╗     ██╗███╗   ██╗ ██████╗ \n"
				+ "██╔══██╗██╔════╝ ██╔════╝ ██║██╔════╝    ██╔══██╗██╔═══██╗██║    ██║██║     ██║████╗  ██║██╔════╝ \n"
				+ "███████║██║  ███╗██║  ███╗██║█████╗      ██████╔╝██║   ██║██║ █╗ ██║██║     ██║██╔██╗ ██║██║  ███╗\n"
				+ "██╔══██║██║   ██║██║   ██║██║██╔══╝      ██╔══██╗██║   ██║██║███╗██║██║     ██║██║╚██╗██║██║   ██║\n"
				+ "██║  ██║╚██████╔╝╚██████╔╝██║███████╗    ██████╔╝╚██████╔╝╚███╔███╔╝███████╗██║██║ ╚████║╚██████╔╝\n"
				+ "╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝╚══════╝    ╚═════╝  ╚═════╝  ╚══╝╚══╝ ╚══════╝╚═╝╚═╝  ╚═══╝ ╚═════╝ \n"
				+ "");
		
		
		bowling.MainBowling.resetPins(pingroup);
		Player poggers = new Player();
		
		int[] testy = poggers.getPinsKnocked();
		
		testy[0] = 0;
		testy[1] = 5;
		
		poggers.setPinsKnocked(testy);
		
		bowling.FrameEngine.printFrames(poggers.getPinsKnocked());
		System.out.println(poggers.getPinScoreArray());
		System.out.println(poggers.getName());
	}

}
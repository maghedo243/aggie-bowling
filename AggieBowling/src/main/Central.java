package main;

public class Central {

	public static void main(String[] args) {
		int num = 0;
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
		
		Player poggers = new Player("Kyle");
		
		int[] testy = poggers.getPinsKnocked();
		
		for(int i = 0; i < 22;i++) {
			testy[i] = bowling.MainBowling.takeTurn(pingroup);
			
			poggers.setPinsKnocked(testy);
			bowling.FrameEngine.printFrames(poggers.getPinsKnocked());
			testy = poggers.getPinsKnocked();
			
			
			i++;
			
			
			testy[i] = bowling.MainBowling.takeTurn(pingroup);
			
			
			poggers.setPinsKnocked(testy);
			bowling.FrameEngine.printFrames(poggers.getPinsKnocked());
			testy = poggers.getPinsKnocked();
			
			
			bowling.MainBowling.resetPins(pingroup);
			
			if(i == 19) {
				if(testy[18] + testy[19] <= 10) {
					break;
				}
			}
		}
		
		System.out.println();
		System.out.println(poggers.toString());
	}

}

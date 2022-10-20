package main;

public class Central {

	public static void main(String[] args) {
		char[] pingroup = {'●','·','●','●','·','·','●','●','·','●'};
		System.out.println("\n"
				+ " █████╗  ██████╗  ██████╗ ██╗███████╗    ██████╗  ██████╗ ██╗    ██╗██╗     ██╗███╗   ██╗ ██████╗ \n"
				+ "██╔══██╗██╔════╝ ██╔════╝ ██║██╔════╝    ██╔══██╗██╔═══██╗██║    ██║██║     ██║████╗  ██║██╔════╝ \n"
				+ "███████║██║  ███╗██║  ███╗██║█████╗      ██████╔╝██║   ██║██║ █╗ ██║██║     ██║██╔██╗ ██║██║  ███╗\n"
				+ "██╔══██║██║   ██║██║   ██║██║██╔══╝      ██╔══██╗██║   ██║██║███╗██║██║     ██║██║╚██╗██║██║   ██║\n"
				+ "██║  ██║╚██████╔╝╚██████╔╝██║███████╗    ██████╔╝╚██████╔╝╚███╔███╔╝███████╗██║██║ ╚████║╚██████╔╝\n"
				+ "╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝╚══════╝    ╚═════╝  ╚═════╝  ╚══╝╚══╝ ╚══════╝╚═╝╚═╝  ╚═══╝ ╚═════╝ \n"
				+ "");
		
		
		bowling.PinEngine.resetPins(pingroup);
		
		Player poggers = new Player("Kyle");
		
		poggers.takeTurn(pingroup);
		
		bowling.PinEngine.resetPins(pingroup);
		
		poggers.takeTurn(pingroup);
		
		bowling.PinEngine.resetPins(pingroup);
		
		poggers.takeTurn(pingroup);

		bowling.PinEngine.resetPins(pingroup);
		
		poggers.takeTurn(pingroup);

		bowling.PinEngine.resetPins(pingroup);
		
		poggers.takeTurn(pingroup);

		bowling.PinEngine.resetPins(pingroup);
		
		poggers.takeTurn(pingroup);

		bowling.PinEngine.resetPins(pingroup);
		
		poggers.takeTurn(pingroup);

		bowling.PinEngine.resetPins(pingroup);
		
		poggers.takeTurn(pingroup);
		
		bowling.PinEngine.resetPins(pingroup);
		
		poggers.takeTurn(pingroup);
		
		bowling.PinEngine.resetPins(pingroup);
		
		poggers.takeTurn(pingroup);
		
		System.out.println();
		System.out.println(poggers.toString());
	}

}

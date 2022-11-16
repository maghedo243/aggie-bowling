package main;

import java.io.IOException;

public class Central {

	public static void main(String[] args) {
		String[] menuoptions = {"New Game", "Load Game", "Quit"};
		int choice;
		boolean gameon = true;
		
		while(gameon) {
			System.out.println("\n"
					+ " █████╗  ██████╗  ██████╗ ██╗███████╗    ██████╗  ██████╗ ██╗    ██╗██╗     ██╗███╗   ██╗ ██████╗ \n"
					+ "██╔══██╗██╔════╝ ██╔════╝ ██║██╔════╝    ██╔══██╗██╔═══██╗██║    ██║██║     ██║████╗  ██║██╔════╝ \n"
					+ "███████║██║  ███╗██║  ███╗██║█████╗      ██████╔╝██║   ██║██║ █╗ ██║██║     ██║██╔██╗ ██║██║  ███╗\n"
					+ "██╔══██║██║   ██║██║   ██║██║██╔══╝      ██╔══██╗██║   ██║██║███╗██║██║     ██║██║╚██╗██║██║   ██║\n"
					+ "██║  ██║╚██████╔╝╚██████╔╝██║███████╗    ██████╔╝╚██████╔╝╚███╔███╔╝███████╗██║██║ ╚████║╚██████╔╝\n"
					+ "╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝╚══════╝    ╚═════╝  ╚═════╝  ╚══╝╚══╝ ╚══════╝╚═╝╚═╝  ╚═══╝ ╚═════╝ \n"
					+ "");
			
			
			System.out.println("Welcome! Please select a menu option.");
			
			choice = Methods.Menu(menuoptions);
			
			switch(choice) {
				case 1: 
					Game.gameSetup();
					break;
				case 2:
					try {
						Game.gameLoad();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 3:
					gameon = false;
					break;
			}
			
		
		}
		/*
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
		
		bowling.FrameEngine.printFrames(poggers.getPinsKnocked(), poggers.get_frameScores());
		
		
		System.out.println();
		System.out.println(poggers.toString());
		
		*/
	}

}

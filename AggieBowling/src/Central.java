
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
		
		
		Game.resetPins(pingroup);
		Game.takeTurn(pingroup);
		Game.printLane(pingroup, 0);
	}

}

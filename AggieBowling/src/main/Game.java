package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	public static void gameSetup() {
		ArrayList<Player> entries = new ArrayList<Player>();
		Scanner in = new Scanner(System.in);
		
		int playernum;
		String name;
		
		System.out.print("How many players?\n--> ");
		playernum = in.nextInt();
		
		for(int i = 0; i < playernum;i++) {
			System.out.print("What is Player "+(i+1)+"'s name?\n--> ");
			name = in.next();
			entries.add(new Player(name));
		}
		
		play(entries);
		
	}
	
	public static void play(ArrayList<Player> players) {
		String[] menu1 = {"Bowl","Display Scores","Save","Save & Quit"};
		int choice;
		char[] pingroup = {'●','●','●','●','●','●','●','●','●','●'};
		int length = players.size();
		int i = 0;
		while(true) {
			System.out.println("It's "+players.get(i).getName()+"'s turn!");
			choice = Methods.Menu(menu1);
			
			if(choice == 1) {
				players.get(i).takeTurn(pingroup);
				bowling.PinEngine.resetPins(pingroup);
				i++;
			} else if (choice == 2) {
				for(Player x:players) {
					System.out.println(x.getName()+"'s Scorecard");
					x.printScorecard();
					System.out.println();
				}
			} else if (choice == 3) {
				try {
					save(players);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					// FIXME
					e.printStackTrace();
				}
			}
			
			
			
			
			
			if(i == length) {
				i = 0;
			}
		}
	}
	
	public static void save (ArrayList<Player> playerdata) throws IOException {
		Scanner inin = new Scanner(System.in);
		FileOutputStream outstream = null;
		PrintWriter fout = null;
		String savename;
		
		
		System.out.print("\nEnter a name for your save file:\n> ");
		savename = inin.nextLine();
		
		//Creates save file
		File outfile = new File("src/saves/"+savename.replace(' ', '_')+".abowling");
		outfile.createNewFile();
		fout = new PrintWriter(outfile);
		
		//Prints to file number of players
		fout.println(playerdata.size());
		
		//Prints player data to file
		for(Player x:playerdata) {
			fout.println(x.getName());
			fout.println(x.getPinScoreString());
			fout.println(x.getCurrentFrame());
		}
		
		fout.close();
		
		
	}
}

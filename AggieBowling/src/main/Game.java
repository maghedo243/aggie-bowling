package main;

import java.io.*;
import java.nio.file.*;
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
		
		play(entries,0);
		
	}
	
	public static void play(ArrayList<Player> players, int starting) {
		String[] menu1 = {"Bowl","Display Scores","Save","Save & Quit"};
		int choice;
		char[] pingroup = {'●','●','●','●','●','●','●','●','●','●'};
		int length = players.size();
		int i = starting;
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
					e.printStackTrace();
				}
			} else {
				try {
					save(players);
					break;
				} catch (IOException e) {
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

	public static void gameLoad() throws IOException{
		Path savepath = Paths.get("src/saves/");
		String temp;
		Scanner inin = new Scanner(System.in);
		FileInputStream fileStream;
		Scanner inFile = null; 
		int fChoice;
		
		
		//List of files in the saves folder
		DirectoryStream<Path> dir_stream = Files.newDirectoryStream(savepath);
	
		//List of 'abowling' filenames
		ArrayList<String> savenames = new ArrayList<String>();
		
		//List of players that will be made
		ArrayList<Player> playerdata = new ArrayList<Player>();
		
		//Populating ^
		for(Path x:dir_stream) {
			temp = x.getFileName().toString();
			if(temp.indexOf(".abowling") > -1) {
				savenames.add(temp.substring(0,temp.indexOf(".")));
			}
		}
		
		//Save file choice and confirmation
		while(true) {
			System.out.println("\nWhich save file would you like to load?");
			
			fChoice = Methods.Menu(savenames);
			
			System.out.print("\n" + savenames.get(fChoice-1)+" has been chosen. Is this correct? (Y/n)\n> ");
			
			temp = inin.next();
			
			if(temp.charAt(0) == 'y' ||  temp.charAt(0) == 'Y') {
				break;
			}
			
			System.out.println();
		}
		
		//Input from Save File
		fileStream = new FileInputStream("src/saves/"+ savenames.get(fChoice-1) + ".abowling");
		inFile = new Scanner(fileStream);
		
		int playerAmount = inFile.nextInt();
		inFile.nextLine();
		
		String pinKnockDataStr;
		String tempName;
		int lastIndex = 0;
		int j;
		Player tempplayer;
		
		//Populating playerdata with save data
		for(int i = 0; i < playerAmount; i++) {
			tempName = inFile.nextLine();
			pinKnockDataStr = inFile.nextLine();
			
			pinKnockDataStr = pinKnockDataStr.substring(1,pinKnockDataStr.length()-1);
			
			int[] pinKnockData = new int[21];
			//Parsing Knock Data array
			j = 0;
			for(String x:pinKnockDataStr.split(",")) {
				pinKnockData[j] = Integer.parseInt(x);
				j++;
			}

			//Adds new player to player ArrayList
			playerdata.add(new Player(tempName,pinKnockData,inFile.nextInt()));
			inFile.nextLine();
			playerdata.get(playerdata.size()-1).loadInit();
			System.out.println();
		}
		
		inFile.close();
		
		System.out.println();
		
		
		int startPlayer = 0;
		
		for(int i = 0; i < playerdata.size() - 1; i++) {
			Player x = playerdata.get(i);
			Player y = playerdata.get(i+1);
			if(x.getCurrentFrame() > y.getCurrentFrame()) {
				startPlayer = i+1;
			}
		}
		
		play(playerdata,startPlayer);
	}
}

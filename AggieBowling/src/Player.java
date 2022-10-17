
public class Player {
	private String name;
	private int totalscore = 0;
	public int[] pinsKnocked = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	
	public Player() {
		name = "NPC";
	}
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return totalscore;
	}


	public void setScore(int score) {
		this.totalscore = score;
	}
	
	public String getPinScoreArray() {
		String out = "{";
		for(int x: this.pinsKnocked) {
			out += x + ",";
		}
		out = out.substring(0,out.length()-1);
		out += "}";
		return out;
	}
	
	
}

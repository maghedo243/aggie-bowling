
public class Player {
	private String _name;
	private int _totalscore = 0;
	private int[] _pinsKnocked = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	
	public Player() {
		this._name = "NPC";
	}
	
	public Player(String name) {
		this._name = name;
	}
	
	public String getName() {
		return _name;
	}

	
	public void setName(String name) {
		this._name = name;
	}


	public int getScore() {
		return _totalscore;
	}


	public void setScore(int score) {
		this._totalscore = score;
	}
	
	public int[] getPinsKnocked() {
		return _pinsKnocked;
	}

	public void setPinsKnocked(int[] pinsKnocked) {
		this._pinsKnocked = pinsKnocked;
	}

	public String getPinScoreArray() {
		String out = "{";
		for(int x: this._pinsKnocked) {
			out += x + ",";
		}
		out = out.substring(0,out.length()-1);
		out += "}";
		return out;
	}
	
	
}

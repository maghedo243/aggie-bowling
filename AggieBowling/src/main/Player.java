package main;

public class Player {
	private String _name;
	private int _totalscore = 0;
	private int _currentframe = 0;
	private int[] _pinsKnocked = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	private int[] _frameScores = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	
	public Player() {
		this._name = "NPC";
	}
	
	public Player(String name) {
		this._name = name;
	}
	
	@Override
	public String toString() {
		String out = "";
		out += "Player Name: \"" + this._name + "\", Total Score: " + this._totalscore;
		return out;
	}
	
	public int takeTurn(char[] pins) {
		int line = 0;
		int pinsy = 0;
		line = bowling.MainBowling.selectLine(pins);
		pinsy = bowling.MainBowling.rollBall(pins,line);
		this._pinsKnocked[determineFrame(1)] = pinsy;
		
		bowling.FrameEngine.printFrames(this._pinsKnocked,this._frameScores);
		
		line = bowling.MainBowling.selectLine(pins);
		pinsy = bowling.MainBowling.rollBall(pins,line);
		this._pinsKnocked[determineFrame(2)] = pinsy;
		
		this._currentframe++;
		
		bowling.FrameEngine.printFrames(this._pinsKnocked,this._frameScores);
		
		return pinsy;
	}
	
	private int determineFrame(int box) {
		if(this._currentframe == 0) {
			return box == 1 ? 0 : 1;
		} else if(this._currentframe == 1) {
			return box == 1 ? 2 : 3;
		} else if(this._currentframe == 2) {
			return box == 1 ? 4 : 5;
		} else if(this._currentframe == 3) {
			return box == 1 ? 6 : 7;
		} else if(this._currentframe == 4) {
			return box == 1 ? 8 : 9;
		} else if(this._currentframe == 5) {
			return box == 1 ? 10 : 11;
		} else if(this._currentframe == 6) {
			return box == 1 ? 12 : 13;
		} else if(this._currentframe == 7) {
			return box == 1 ? 14 : 15;
		} else if(this._currentframe == 8) {
			return box == 1 ? 16 : 17;
		} else if(this._currentframe == 9) {
			if(box == 1) {
				return 18;
			} else if (box == 2) {
				return 19;
			} else {
				return 20;
			}
		}
		
		return -1;
		
	}
	
	//Getters and Setters
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

	public int[] get_frameScores() {
		return _frameScores;
	}

	public void set_frameScores(int[] _frameScores) {
		this._frameScores = _frameScores;
	}

	public String getPinScoreString() {
		String out = "{";
		for(int x: this._pinsKnocked) {
			out += x + ",";
		}
		out = out.substring(0,out.length()-1);
		out += "}";
		return out;
	}
	
	//end getters and setters
	
	
}

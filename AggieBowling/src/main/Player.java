package main;

public class Player {
	private String _name;
	private int _totalscore = 0;
	private int _currentFrame = 0;
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
		int pinsy;
		pinsy = bowling.MainBowling.bowl(pins);
		this._pinsKnocked[determineFrame(1)] = pinsy;
		
		bowling.FrameEngine.printFrames(this._pinsKnocked,this._frameScores);
		
		if(_currentFrame == 9 && _pinsKnocked[18] == 10) {
			bowling.PinEngine.resetPins(pins);
		}
		
		if(this._pinsKnocked[determineFrame(1)] != 10 && this._currentFrame != 9) {
			pinsy = bowling.MainBowling.bowl(pins);
			this._pinsKnocked[determineFrame(2)] = pinsy;
			
			bowling.FrameEngine.printFrames(this._pinsKnocked,this._frameScores);
			
		}
		
		if(_currentFrame == 9) {
			pinsy = bowling.MainBowling.bowl(pins);
			this._pinsKnocked[determineFrame(2)] = pinsy;
			
			bowling.FrameEngine.printFrames(this._pinsKnocked,this._frameScores);
			
			if(this._pinsKnocked[18] + this._pinsKnocked[19] >= 10) {
				
				if(_pinsKnocked[18] != 10) {
					bowling.PinEngine.resetPins(pins);
				}
				pinsy = bowling.MainBowling.bowl(pins);
				this._pinsKnocked[determineFrame(3)] = pinsy;
				
				bowling.FrameEngine.printFrames(this._pinsKnocked,this._frameScores);
			}
		}
			
		fScoreCalc();
		
		this._currentFrame++;
		
		return pinsy;
	}
	
	
	private void fScoreCalc() {
		int j = 0;
		for(int i = 0; i < 9; i++) {
			//Strike Calculator
			if(this._pinsKnocked[j] + this._pinsKnocked[j+1] == 9 && this._pinsKnocked[j+1] == -1) {
				if(this._pinsKnocked[j+3] != -1) {
					this._frameScores[i] = this._pinsKnocked[j+2] + this._pinsKnocked[j+3] + 10 + (i != 0 ? this._frameScores[i-1] : 0);
				} else if (this._pinsKnocked[j+2] == -1) {
					this._frameScores[i] = -1;
				} else if (this._pinsKnocked[4] == -1) {
					this._frameScores[i] = -1;
				} else {
					this._frameScores[i] = this._pinsKnocked[j+2] + this._pinsKnocked[j+4] + 10 + (i != 0 ? this._frameScores[i-1] : 0);
				}
			} //Spare Calculator
			else if(this._pinsKnocked[j] + this._pinsKnocked[j+1] == 10) {
				if(this._pinsKnocked[j+2] != -1) {
					this._frameScores[i] = this._pinsKnocked[j+2] + 10 + (i != 0 ? this._frameScores[i-1] : 0);
				} else {
					this._frameScores[i] = -1;
				}
			} //Open Frame Calculator
			else if(this._pinsKnocked[j] != -1 && this._pinsKnocked[j+1] != -1){
				this._frameScores[i] = this._pinsKnocked[j] + this._pinsKnocked[j+1] + (i != 0 ? this._frameScores[i-1] : 0);
			}
			
			j += 2;
		}
		
		if(this._pinsKnocked[18] == 10 && this._pinsKnocked[19] != -1 && this._pinsKnocked[20] != -1) {
			this._frameScores[9] = this._pinsKnocked[19] + this._pinsKnocked[20] + this._frameScores[8] + 10;
		} else if(this._pinsKnocked[18] + this._pinsKnocked[19] == 10 && this._pinsKnocked[20] != -1) {
			this._frameScores[9] = this._pinsKnocked[20] + this._frameScores[8] + 10;
		} else if(this._pinsKnocked[18] + this._pinsKnocked[19] != 10 && this._pinsKnocked[18] != -1 && this._pinsKnocked[19] != -1) {
			this._frameScores[9] = this._pinsKnocked[18] + this._pinsKnocked[19] + this._frameScores[8];
		} else {
			this._frameScores[9] = -1;
		}
		
	
	}
	
	
	private int determineFrame(int box) {
		if(this._currentFrame == 0) {
			return box == 1 ? 0 : 1;
		} else if(this._currentFrame == 1) {
			return box == 1 ? 2 : 3;
		} else if(this._currentFrame == 2) {
			return box == 1 ? 4 : 5;
		} else if(this._currentFrame == 3) {
			return box == 1 ? 6 : 7;
		} else if(this._currentFrame == 4) {
			return box == 1 ? 8 : 9;
		} else if(this._currentFrame == 5) {
			return box == 1 ? 10 : 11;
		} else if(this._currentFrame == 6) {
			return box == 1 ? 12 : 13;
		} else if(this._currentFrame == 7) {
			return box == 1 ? 14 : 15;
		} else if(this._currentFrame == 8) {
			return box == 1 ? 16 : 17;
		} else if(this._currentFrame == 9) {
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
	
	
	public void printScorecard() {
		bowling.FrameEngine.printFrames(this._pinsKnocked, this._frameScores);
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

	public int[] getFrameScores() {
		return _frameScores;
	}

	public void setFrameScores(int[] _frameScores) {
		this._frameScores = _frameScores;
	}

	public int getCurrentFrame() {
		return _currentFrame;
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

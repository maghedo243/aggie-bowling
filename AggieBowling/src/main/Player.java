package main;

import java.util.Scanner;

public class Player {
	private String _name;
	private int _totalscore = 0;
	private int _currentframe = 0;
	private int[] _pinsKnocked = {9,1,10,-1,1,9,5,5,7,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
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
		
		fScoreCalc();
		bowling.FrameEngine.printFrames(this._pinsKnocked,this._frameScores);
		for(int x:_frameScores) {
			System.out.println(x);
		}
		
		int line = 0;
		int pinsy = 0;
		line = bowling.MainBowling.selectLine(pins);
		pinsy = bowling.MainBowling.rollBall(pins,line);
		this._pinsKnocked[determineFrame(1)] = pinsy;
		
		bowling.FrameEngine.printFrames(this._pinsKnocked,this._frameScores);
		
		if(_currentframe == 9 && _pinsKnocked[18] == 10) {
			bowling.PinEngine.resetPins(pins);
		}
		
		if(this._pinsKnocked[determineFrame(1)] != 10 && this._currentframe != 9) {
			line = bowling.MainBowling.selectLine(pins);
			pinsy = bowling.MainBowling.rollBall(pins,line);
			this._pinsKnocked[determineFrame(2)] = pinsy;
			
			bowling.FrameEngine.printFrames(this._pinsKnocked,this._frameScores);
			
		}
		
		if(_currentframe == 9) {
			line = bowling.MainBowling.selectLine(pins);
			pinsy = bowling.MainBowling.rollBall(pins,line);
			this._pinsKnocked[determineFrame(2)] = pinsy;
			
			bowling.FrameEngine.printFrames(this._pinsKnocked,this._frameScores);
			
			if(this._pinsKnocked[18] + this._pinsKnocked[19] >= 10) {
				
				if(_pinsKnocked[18] != 10) {
					bowling.PinEngine.resetPins(pins);
				}
				line = bowling.MainBowling.selectLine(pins);
				pinsy = bowling.MainBowling.rollBall(pins,line);
				this._pinsKnocked[determineFrame(3)] = pinsy;
				
				bowling.FrameEngine.printFrames(this._pinsKnocked,this._frameScores);
			}
		}
			
		
		this._currentframe++;
		
		return pinsy;
	}
	
	private void fScoreCalc() {
		Scanner snr = new Scanner(System.in);
		int scorenum = -1;
		
		//First Frame
		//Strike Calc
		if(this._pinsKnocked[0] + this._pinsKnocked[1] == 9 && this._pinsKnocked[1] == -1) {
			if(this._pinsKnocked[3] != -1) {
				this._frameScores[0] = this._pinsKnocked[2] + this._pinsKnocked[3] + 10;
			} else if (this._pinsKnocked[2] == -1) {
				this._frameScores[0] = -1;
			} else if (this._pinsKnocked[4] == -1) {
				this._frameScores[0] = -1;
			} else {
				this._frameScores[0] = this._pinsKnocked[2] + this._pinsKnocked[4] + 10;
			}
		} //Spare Calc
		else if(this._pinsKnocked[0] + this._pinsKnocked[1] == 10) {
			if(this._pinsKnocked[2] != -1) {
				this._frameScores[0] = this._pinsKnocked[2] + 10;
			} else {
				this._frameScores[0] = -1;
			}
		} //Open Frame Calc
		else if(this._pinsKnocked[0] != -1 && this._pinsKnocked[1] != -1){
			this._frameScores[0] = this._pinsKnocked[0] + this._pinsKnocked[1];
		}
		
		//Second Frame
		//Strike Calc
		if(this._pinsKnocked[2] + this._pinsKnocked[3] == 9 && this._pinsKnocked[3] == -1) {
			if(this._pinsKnocked[5] != -1) {
				this._frameScores[1] = this._pinsKnocked[4] + this._pinsKnocked[5] + this._frameScores[0] + 10;
			} else if (this._pinsKnocked[4] == -1) {
				this._frameScores[1] = -1;
			} else if (this._pinsKnocked[6] == -1) {
				this._frameScores[1] = -1;
			} else {
				this._frameScores[1] = this._pinsKnocked[4] + this._pinsKnocked[6] + this._frameScores[0] + 10;
			}
		} //Spare Calc
		else if(this._pinsKnocked[2] + this._pinsKnocked[3] == 10) {
			if(this._pinsKnocked[4] != -1) {
				this._frameScores[1] = this._pinsKnocked[4] + this._frameScores[0] + 10;
			} else {
				this._frameScores[1] = -1;
			}
		} //Open Frame Calc
		else if(this._pinsKnocked[2] != -1 && this._pinsKnocked[3] != -1){
			this._frameScores[1] = this._pinsKnocked[2] + this._pinsKnocked[3] + this._frameScores[0];
		}
		
		
		//Third Frame
		//Strike Calc
		if(this._pinsKnocked[4] + this._pinsKnocked[5] == 9 && this._pinsKnocked[5] == -1) {
			if(this._pinsKnocked[7] != -1) {
				this._frameScores[2] = this._pinsKnocked[6] + this._pinsKnocked[7] + this._frameScores[1] + 10;
			} else if (this._pinsKnocked[6] == -1) {
				this._frameScores[2] = -1;
			} else if (this._pinsKnocked[8] == -1) {
				this._frameScores[2] = -1;
			} else {
				this._frameScores[2] = this._pinsKnocked[6] + this._pinsKnocked[8] + this._frameScores[1] + 10;
			}
		} //Spare Calc
		else if(this._pinsKnocked[4] + this._pinsKnocked[5] == 10) {
			if(this._pinsKnocked[6] != -1) {
				this._frameScores[2] = this._pinsKnocked[6] + this._frameScores[1] + 10;
			} else {
				this._frameScores[2] = -1;
			}
		} //Open Frame Calc
		else if(this._pinsKnocked[4] != -1 && this._pinsKnocked[5] != -1){
			this._frameScores[2] = this._pinsKnocked[4] + this._pinsKnocked[5] + this._frameScores[1];
		}
		
		
		//Fourth Frame
		//Strike Calc
		if(this._pinsKnocked[6] + this._pinsKnocked[7] == 9 && this._pinsKnocked[7] == -1) {
			if(this._pinsKnocked[9] != -1) {
				this._frameScores[3] = this._pinsKnocked[8] + this._pinsKnocked[9] + this._frameScores[2] + 10;
			} else if (this._pinsKnocked[8] == -1) {
				this._frameScores[3] = -1;
			} else if (this._pinsKnocked[10] == -1) {
				this._frameScores[3] = -1;
			} else {
				this._frameScores[3] = this._pinsKnocked[8] + this._pinsKnocked[10] + this._frameScores[2] + 10;
			}
		} //Spare Calc
		else if(this._pinsKnocked[6] + this._pinsKnocked[7] == 10) {
			if(this._pinsKnocked[6] != -1) {
				this._frameScores[3] = this._pinsKnocked[8] + this._frameScores[2] + 10;
			} else {
				this._frameScores[3] = -1;
			}
		} //Open Frame Calc
		else if(this._pinsKnocked[6] != -1 && this._pinsKnocked[7] != -1){
			this._frameScores[3] = this._pinsKnocked[6] + this._pinsKnocked[7] + this._frameScores[2];
		}
		
		
		//Fifth Frame
		//Strike Calc
		if(this._pinsKnocked[8] + this._pinsKnocked[9] == 9 && this._pinsKnocked[9] == -1) {
			if(this._pinsKnocked[11] != -1) {
				this._frameScores[4] = this._pinsKnocked[10] + this._pinsKnocked[11] + this._frameScores[3] + 10;
			} else if (this._pinsKnocked[10] == -1) {
				this._frameScores[4] = -1;
			} else if (this._pinsKnocked[12] == -1) {
				this._frameScores[4] = -1;
			} else {
				this._frameScores[4] = this._pinsKnocked[10] + this._pinsKnocked[12] + this._frameScores[3] + 10;
			}
		} //Spare Calc
		else if(this._pinsKnocked[8] + this._pinsKnocked[9] == 10) {
			if(this._pinsKnocked[8] != -1) {
				this._frameScores[4] = this._pinsKnocked[10] + this._frameScores[3] + 10;
			} else {
				this._frameScores[4] = -1;
			}
		} //Open Frame Calc
		else if(this._pinsKnocked[8] != -1 && this._pinsKnocked[9] != -1){
			this._frameScores[4] = this._pinsKnocked[8] + this._pinsKnocked[9] + this._frameScores[3];
		}
	
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

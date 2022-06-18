
public class Player {
	private String name;
	private int gamesPlayed;
	private int totScore;
	
	public Player(String name) {
		this.name = name;
		gamesPlayed = 0;
		totScore = 0;
	}
	public Player(String name, Location place) {
		this.name = name;
		gamesPlayed = 0;
		totScore = 0;
		place.addMember(this);
	}
	public void addGameResult(int newScore) {
		gamesPlayed++;
		totScore+=newScore;
	}
	public boolean equals(Player other) {
		return name.equals(other.name);
	}
	public String toString() {
		if(gamesPlayed == 0) {
			return "Player: "+name+" has played no games";
		}
		else if (gamesPlayed == 1){
			return "Player: "+name+" has played 1 game with an average of "+totScore;
		}
		else {
			return "Player: "+name+" has played "+gamesPlayed+" games with an average of "+String.valueOf(totScore/gamesPlayed);
		}
	}
	public String getName() {
		return name;
	}
}

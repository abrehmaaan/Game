
public class Team {
	final private int maxSize = 5;
	private int noOfPlayers;
	private Player[] players;
	public Team() {
		noOfPlayers = 0;
		players = new Player[maxSize];
	}
	public boolean hasPlayer(Player other) {
		for(int i = 0;i<noOfPlayers;i++) {
			if(other.equals(players[i])) {
				return true;
			}
		}
		return false;
	}
	public boolean addMember(Player newone) {
		if(noOfPlayers<maxSize) {
			if(hasPlayer(newone)) {
				return false;
			}
			else {
				players[noOfPlayers] = newone;
				noOfPlayers++;
				return true;
			}
		}
		else {
			return false;
		}
	}
	public String toString() {
		String string = "Team Members:\n";
		for(int i = 0; i<noOfPlayers;i++) {
			string+=String.valueOf(i+1)+": "+players[i].getName()+"\n";
		}
		return string;
	}
	public boolean hasCommonPlayers(Team other) {
		for(int i = 0;i<noOfPlayers;i++) {
			if(other.hasPlayer(players[i])) {
				return true;
			}
		}
		return false;
	}
	public boolean teamFull() {
		return noOfPlayers == maxSize;
	}
	public boolean removePlayer(Player toRemove) {
		if(hasPlayer(toRemove)) {
			int index = -1;
			for(int i = 0; i<noOfPlayers;i++) {
				if(toRemove.equals(players[i])) {
					index = i;
					break;
				}
			}
			noOfPlayers--;
			for(int i = index;i<noOfPlayers;i++) {
				players[i] = players[i+1];
			}
			return true;
		}
		else {
			return false;
		}
	}
	public Player[] getRoster() {
		Player[] p = new Player[noOfPlayers];
		for(int i = 0;i<noOfPlayers;i++) {
			p[i] = players[i];
		}
		return p;
	}
	public void addPoints(int points) {
		int score = points/noOfPlayers;
		for(Player p:players) {
			p.addGameResult(score);
		}
	}
}

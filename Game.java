
public class Game {
	private Team teamOne, teamTwo;
	public Game(Team team1,Team team2) {
		teamOne = team1;
		teamTwo = team2;
	}
	public boolean validGame() {
		if(teamOne.teamFull()&&teamTwo.teamFull()&&!teamOne.hasCommonPlayers(teamTwo)) {
			return true;
		}
		else {
			return false;
		}
	}
	public void awardWinner(Team winner, int points) {
		winner.addPoints(points);
	}
	public String toString() {
		if(!validGame()) {
			return "Not a valid game";
		}
		else {
			String string = "Team rosters:\n";
			Player[] playersOne = teamOne.getRoster();
			Player[] playersTwo = teamTwo.getRoster();
			int max = 0;
			for(Player p : playersOne) {
				if(p.getName().length()>max) {
					max = p.getName().length();
				}
			}
			max+=5;
			for(int i = 0;i<playersOne.length;i++) {
				string+=playersOne[i].getName();
				for(int j = playersOne[i].getName().length();j<max;j++) {
					string+=" ";
				}
				string+=playersTwo[i].getName()+"\n";
			}
			return string;
		}
	}
}

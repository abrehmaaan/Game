
public class Location {
	final static int MAX_SIZE = 1000;
	private String name, address;
	private Player[] members;
	private int noOfMembers;
	private static Location[] locations = new Location[MAX_SIZE];
	private static int noOfLocations = 0;
	public Location(String name, String address) {
		this.name = name;
		this.address = address;
		members = new Player[MAX_SIZE];
		noOfMembers = 0;
		locations[noOfLocations] = this;
		noOfLocations++;
	}
	public boolean hasMember(Player other) {
		for(int i = 0;i<noOfMembers;i++) {
			if(other.equals(members[i])) {
				return true;
			}
		}
		return false;
	}
	public void addMember(Player newbie) {
		if(!hasMember(newbie)) {
			members[noOfMembers] = newbie;
			noOfMembers++;
		}
	}
	public String toString() {
		String string = "The membership list for "+name+", "+address+" location\n";
		for(int i = 0;i<noOfMembers;i++) {
			string+=members[i].toString()+"\n";
		}
		return string;
	}
	public static String allLocationNames() {
		String names = "";
		for(int i = 0;i<noOfLocations;i++) {
			names+=locations[i].name+"\n";
		}
		return names;
	}
	public static String whichLocations(Player who) {
		String string = who.getName()+" is a member at:\n";
		for(int i = 0;i<noOfLocations;i++) {
			if(locations[i].hasMember(who)) {
				string+=locations[i].name+"\n";
			}
		}
		return string;
	}
}

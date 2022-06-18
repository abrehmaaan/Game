
public class TestPhase2 {

	public static void main(String[] args) {
		
		Player pike = new Player("Ashley Johnson");
		Player vex = new Player("Laura Bailey");
		Player vax = new Player("Liam O'Brien");
		Player keyleth = new Player("Marisha Ray");
		Player scanlan = new Player("Sam Riegel");
		Player percy = new Player("Taliesin Jaffe");
		Player grog = new Player("Travis Willingham");

		
		Team voxMachina = new Team();
		
		voxMachina.addMember(pike);
		System.out.println(voxMachina);
		
		voxMachina.addMember(vex);
		System.out.println(voxMachina);
		
		voxMachina.addMember(vex);
		System.out.println(voxMachina);

		voxMachina.addMember(vax);
		voxMachina.addMember(keyleth);
				
		System.out.println(voxMachina);
		System.out.println(voxMachina.teamFull());
		voxMachina.addMember(scanlan);
		System.out.println(voxMachina);
		System.out.println(voxMachina.teamFull());
		
		voxMachina.addMember(percy);
		voxMachina.addMember(grog);
		voxMachina.removePlayer(percy);
		System.out.println(voxMachina.teamFull());
		voxMachina.addMember(grog);
		System.out.println(voxMachina);
		System.out.println(voxMachina.teamFull());


		Team badGuys = new Team();
		badGuys.addMember(percy);
		System.out.println("Is there common members?");
		System.out.println(voxMachina.hasCommonPlayers(badGuys));
		badGuys.addMember(pike);
		System.out.println("Is there common members now?");
		System.out.println(voxMachina.hasCommonPlayers(badGuys));
		System.out.println(badGuys.teamFull());
		
		
		
	}

}

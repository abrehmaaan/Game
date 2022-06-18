
public class TestPhase1 {

	public static void main(String[] args) {
		
		Player jim = new Player("Jim Beam");
		Player johnny = new Player("Johnny Walker");
		
		System.out.println("Should print \"Player: Jim Beam has played no games\"");
		System.out.println(jim);
		
		System.out.println("Should print \"Player: Johnny Walker has played no games\"");
		System.out.println(johnny);

		jim.addGameResult(50);
		System.out.println("Should print \"Player: Jim Beam has played 1 game with an average of 50\"");
		System.out.println(jim);
		jim.addGameResult(52);
		
		for (int i = 1; i <= 50; i++)
			johnny.addGameResult(i);
		System.out.println("Should print \"Player: Jim Beam has played 2 games with an average of 51\"");
		System.out.println(jim);
		
		System.out.println("Should print \"Player: Johnny Walker has played 50 games with an average of 25\"");
		System.out.println(johnny);
		
		
		Player jimTwo = new Player("Jim Beam");
		
		System.out.println(jim.equals(jimTwo));
		System.out.println(jim.equals(johnny));
		
		System.out.println("Hello, my name is " + jim.getName());
		
	}

}

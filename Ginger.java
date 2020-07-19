class Ginger {
	class Player {
/*		Player(int year) {
			// any player
			int age=2020-year;
		}*/
		void process(int year) {
			int age=2020-year;
		}
	}
	
	class Coach {
		Coach(int year) {
			// any player
			int age=2020-year;
		}
	}
		
	public static void main(String[] args) {
		int age;
		int year;

		// player 1
		//new Ginger().new Player(2000);
		Ginger g=new Ginger();
		Player p=g.new Player();
		// p.process(2020);
		
		// player 2
		//new Ginger().new Coach(1920);

		String name;
		name="Arnold";
		System.out.println("\tHello, World! " + name);
	}
}

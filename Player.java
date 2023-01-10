import java.util.Scanner;

class Super{
	Scanner sc = new Scanner(System.in);
	int players;
	String country;
	Super(int p, String c){
		country = c;
		players = p;
	}
}
class CricketPlayer extends Super{
	CricketPlayer(int p, String c){
		super(p,c);
	}
	public void display(){
		System.out.println("Hi, I am Virat Kohli.");
		System.out.println("Number of players: " +players);
		System.out.println("Residing country: " +country);
		System.out.println("\n");
	}
}
class FootballPlayer extends Super{
	FootballPlayer(int p, String c){
		super(p,c);
	}
	public void display(){
		System.out.println("Hi, I am Cristiano Ronaldo.");
		System.out.println("Number of players: " +players);
		System.out.println("Residing country: " +country);
		System.out.println("\n");
	}
}
class HockeyPlayer extends Super{
	HockeyPlayer(int p,String c){
		super(p,c);
	}
	public void display(){
		System.out.println("Hi, this is Manpreet Singh.");
		System.out.println("Number of players: " +players);
		System.out.println("Residing country: " +country);
		System.out.println("\n");
	}
}

class Player{
	public static void main(String[] args){
	CricketPlayer c = new CricketPlayer(11, "India");
	FootballPlayer f = new FootballPlayer(11, "Portugal");
	HockeyPlayer h = new HockeyPlayer(11, "India");
	c.display();
	f.display();
	h.display();
	}
}
package todaylearning;

public class Nonstaticmethod {
	public void move() {
		System.out.println("move start");
	}
	public static void main(String args[]) {
		Nonstaticmethod m1=new Nonstaticmethod();
		m1.move();
	}

}

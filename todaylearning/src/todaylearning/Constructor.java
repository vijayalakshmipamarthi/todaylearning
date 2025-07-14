package todaylearning;

//default constructor
public class Constructor {
	Constructor() {
		System.out.println("hai");
	
	}

	Constructor(String message) {
		System.out.println(message);
	}
	
	Constructor(int y) {
		System.out.println(y);
	}
	
	
	
	
	Constructor(String message,int x) {
		System.out.println(message + " "+x);
	}

	public static void main(String args[]) {
		Constructor s1 = new Constructor();
		Constructor s2 = new Constructor("hello");
		Constructor s3 = new Constructor("hello",89);

		
	}

}

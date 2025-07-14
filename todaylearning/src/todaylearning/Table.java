package todaylearning;

import java.util.Scanner;

public class Table {
	public static void main(String args[] ) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter number");
	int x=sc.nextInt();
	System.out.println("Table for " +x);
	for(int i=1;i<=10;i++) {
	int y=x*i;
	System.out.println(+ x +"*"+ i + "=" + y);
		
	}
	
	}
	

}

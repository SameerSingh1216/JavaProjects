import java.util.Scanner;

public class fourthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//String s= "";
		double d;
		int a;
		a= scan.nextInt();
		d= scan.nextDouble();
		scan.nextLine();
		String s= scan.nextLine();
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + a);
		scan.close();
		
		

	}

}

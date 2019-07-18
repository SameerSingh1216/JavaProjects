import java.util.Scanner;

public class thirdProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		String ans ="";
		
		if (a%2 == 1)
		{
			//System.out.print("Weird");
			ans= "Weird";
		}
		
		else {
			
			if(a>=6 && a <=20)
			{
				ans= "Weird";
			}
			
			else
			{
			ans= "Not Weird";
			}
			}
		
//		if ((a%2 == 0) && (a>=2 && a<= 5))
//		{
//			//System.out.print("Not Weird");
//			ans= "Not Weird";
//		}
//		
//		if ((a%2 == 0) && (a>=6 && a<= 20))
//		{
//			//System.out.print("Weird");
//			ans= "Weird";
//		}
//		if ((a%2 == 0) && (a>20))
//		{
//			//System.out.print("Not Weird");
//			ans= "Not Weird";
//		}
		System.out.print(ans);
		input.close();
	}

}

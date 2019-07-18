import java.util.Scanner;

public class TenthProgram {
	public static int B,H=0;
	public static boolean flag;
	static
	    {
	        Scanner scn = new Scanner(System.in);
	        B= scn.nextInt();
	        H= scn.nextInt();
	        if(B<=0 || H<=0)
	        {
	            flag= false;
	            System.out.print("java.lang.Exception: Breadth and height must be positive");
	        }
	        else
	        {
	            flag= true;
	        }
	        scn.close();
	    }
	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}//end of main
	
}

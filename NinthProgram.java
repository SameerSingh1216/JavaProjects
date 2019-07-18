import java.util.Scanner;

public class NinthProgram {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int i=1;
        while(scn.hasNext())
        {
            System.out.println(i+" "+ scn.nextLine());
            i++;
        }
        scn.close();
    }

}

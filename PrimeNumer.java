import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//import com.sun.tools.javac.code.Attribute.Array;

//import com.sun.tools.javac.util.List;

public class PrimeNumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=1,j=1;
//		int k=0;
//		int number=0;
//		Scanner num = new Scanner(System.in);
		int arr[]= {4,21,2,64,25,2};
		int temp1=0;
		
		System.out.println("Bubble Sorting");
		for(int p=0; p<arr.length-1; p++)
		{
			for(int q=0; q<arr.length-1-p; q++)
			{
				if(arr[q]>arr[q+1])
				temp1 =arr[q];
				arr[q]=arr[q+1];
				arr[q+1]=temp1;
			}
		}
		
		System.out.println("Sorted array using bubble sort:");
//		for(int r:arr)
//		{
			System.out.print(Arrays.toString(arr));
		//}
		
		System.out.println("Bubble Sorting End");
		//char cha[]= {'w','a','m','k'};
		String s1= "wamk";
		char cha[] = s1.toCharArray();
		Arrays.sort(cha);
		String s= cha.toString();
		System.out.println(s);
		int max=0;
		int secMax=0;
		int thirdMax=0;
		System.out.println("Sorted Array element 1" + cha[0]);
		
		for (int i:arr)
		{
			if (max<i)
			{
				thirdMax=secMax;
				secMax=max;
				max=i;
			}
			else if(secMax<i)
			{
				thirdMax=secMax;
				secMax=i;
			}
			else if (thirdMax<i)
			{
				thirdMax=i;
			}
			
		}
		
		System.out.println("Largest Numer"+ max);
		System.out.println("Second Largest Num:" +secMax);
		System.out.println("Third Largest Num:" + thirdMax);
		//System.out.println("Enetr the number:");
	    //number = num.nextInt();
		//String str = num.nextLine();
		//System.out.println("Enter the String2:");
		//String str2 = num.nextLine();
		//System.out.println("String in string " + str.contains(str2));
		//System.out.println("Factorial of a number:" + CalcuFact(number));
//		System.out.println("Enter array values");
//		ArrayList<Integer> lst = new ArrayList<Integer>();
//		while(num.hasNextInt())
//		{
//			//int x = num.nextInt();
//			lst.add(num.nextInt());
//		}
//		
//		System.out.println("numbers:"+ lst);
//		System.out.println("1st integer"+ lst.get(1));
		//String str = getPrimeNumerVerified(number);
		//System.out.println("Entered number is Prime or Not: "+ getPrimeNumerVerified(number));
		//System.out.println("String Palindrome or Not " + getValidationOfPalindrome(str));
//		System.out.print("Fibonnaci Series : "+ i +" "+j+" ");
//		for(int x=1 ; x<=number-2; x++)
//		{
//			k= i+j;
//			System.out.print(k+" ");
//			j=i;
//			i=k;		
//		}
		//num.close();	
	}
	
	public static int CalcuFact(int number)
	{
		if (number==0)
			return 1;
		return (number*CalcuFact(number-1));
	}
	
	public static String getPrimeNumerVerified(int no)
	{
		for(int y= 2; y<=no/2; y++)
		{
			if (no%y==0)
			{
				return "not a Prime Number";
			}
		}
		
		return "Prime Number";
	}
	
	public static String getValidationOfPalindrome(String str)
	{
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		str1 = str1.reverse();
		System.out.println("reverse string" + str1);
		String str2 = str1.toString();
		
		if (str.equals(str2))
		{
			System.out.println("String1 :" + str + "String 2" + str1);
			return "Palindrome";
		}
		
		return "Not Palindrome";
		
	}

}

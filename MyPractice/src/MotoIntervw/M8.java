package MotoIntervw;
import java.util.Scanner;
public class M8 {
	public static boolean isPalinderm(int a)
	{
		int temp=a;
		int rev=0;
		while(a>0)
		{
			int d=a%10;
			rev=(rev*10)+d;
			a=a/10;
		}
		return temp==rev;
			
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value n");
		int n=sc.nextInt();
		int temp=n;
		boolean b=isPalinderm(n);
		if(b==true)
			System.out.println(temp+" is a palinderm number");
		else
			System.out.println(temp+" is not a palinderm number");

	}

}

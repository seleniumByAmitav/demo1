package MotoIntervw;
import java.util.Scanner;
public class M9 {
	public static boolean isPrime(int a)
	{
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int temp=n;
		boolean b=isPrime(n);
		if(b==true)
			System.out.println(temp+" is a prime number");
		else
			System.out.println(temp+" is not a prime number");
		
	}

}

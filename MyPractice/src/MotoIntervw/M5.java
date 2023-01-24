package MotoIntervw;
import java.util.Scanner;
public class M5 {
	public static int isPow(int a,int b)
	{
		int fact=1;
		for(int i=1;i<=b;i++)
		{
			fact=fact*a;
		}
		return fact;
	}
	public static int isCount(int m)
	{
		int count=0;
		while(m>0)
		{
			int c=m%10;
			count++;
			m=m/10;
		}
		return count;
	}
	public static boolean isArm(int a)
	{
		int temp=a;
		int sum=0;
		int dc=isCount(a);
		while(a>0)
		{
			int d=a%10;
			int e=isPow(d,dc);
			 sum=sum+e;
			 a=a/10;
			
		}
		 if(temp==sum)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of n");
		int n=sc.nextInt();
		int temp=n;
		boolean b=isArm(n);
		if(b==true)
			System.out.println(temp+" is a Armstrong number");
		else
			System.out.println(temp+" is not a Armstrong number");
		
	}

}

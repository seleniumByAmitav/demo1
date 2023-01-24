package MotoIntervw;
import java.util.Scanner;
public class M1 {
	public static int isSt(int a)
	{
		int fac=1;
		for(int i=2;i<=a;i++)
		{
			fac=fac*i;
		}
		return fac;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value n");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			int fact=isSt(d);
			sum=sum+fact;
			n=n/10;
			
		}
		if(temp==sum)
			System.out.println("Strong number");
		else
			System.out.println("not a strong number");
		

	}

}

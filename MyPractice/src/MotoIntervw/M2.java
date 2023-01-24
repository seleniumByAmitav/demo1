package MotoIntervw;
import java.util.Scanner;
public class M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of n");
		int n=sc.nextInt();
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				int d=n%10;
				sum=sum+(d*d);
				n=n/10;
			}
			n=sum;
		}
		if(n==1||n==7)
			System.out.println("Happy number");
		else
			System.out.println("Not a happy number");

	}

}

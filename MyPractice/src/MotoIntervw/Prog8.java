package MotoIntervw;
import java.util.Scanner;
public class Prog8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int a=0;
		int b=n;
		int sum=0;
		    for(int i=1;i<n;i++)
			{
				if(n%i==0)
					sum=sum+i;
			}
		    if(sum==b)
		    	System.out.println("Perfect number");
		    else
		    	System.out.println("Not a perfect number");
	}
}

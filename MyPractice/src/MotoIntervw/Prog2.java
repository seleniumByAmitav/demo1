package MotoIntervw;
import java.util.Scanner;
public class Prog2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is the even number");
			}
			else
			{
				System.out.println(i+" is odd number");
			}
		}

	}

}

package MotoIntervw;
import java.util.Scanner;
public class RevNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int d=n%10;
			rev=(rev*10)+d;
			n=n/10;
		}
		System.out.println("Reverse of " +temp+" is "+rev);

	}

}

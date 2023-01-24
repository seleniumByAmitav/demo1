package MotoIntervw;
import java.util.Scanner;
public class DecToBin {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int  n=sc.nextInt();
		String s="";
		while(n>0)
		{
			int d=n%2;
			s=s+d;
			n=n/2;
		}
		System.out.println(s);
		

	}

}

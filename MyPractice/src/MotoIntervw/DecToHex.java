package MotoIntervw;
import java.util.Scanner;
public class DecToHex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int Hex=0;
		while(n>0)
		{
			int d=n%16;
			if(d<10)
			{
				Hex=d+Hex;
			}
			else
			{
				Hex=(char)(55+d)+Hex;
			}
			n=n/16;
		}
		System.out.println(Hex);

	}

}

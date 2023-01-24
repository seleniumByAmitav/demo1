package MotoIntervw;
import java.util.Scanner;
public class M10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		while(n>1) {
			System.out.print(a+" ");
			int sum=a+b;
			a=b;
			b=sum;
			n--;
		}
	}
}

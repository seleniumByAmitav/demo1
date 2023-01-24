package MotoIntervw;

import java.util.Scanner;
public class BinToDec {
	public static int isCount(int a)
	{
		int count=0;
		while(a>0)
		{
			int d=a%10;
			count++;
			a=a/10;
		}
		return count;
	}
	public static int is(int a,int b)
	{
		int mul=1;
		while(b>0)
		{
			mul=mul*a;
			b--;
		}
		return mul;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int  n=sc.nextInt();
		int Dec=1;
		int count=0;
		int dc=isCount(n);
		System.out.println("Digit count is : "+dc);
		while(n>0)
		{
			int d=n%10;
			Dec=Dec+d*is(16,count);
			count++;
			n=n/10;
			
			
		}
		System.out.println(Dec);
	}
}

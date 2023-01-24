package MotoIntervw;

import java.util.Scanner;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int a=3;
		int b=2;
		System.out.println(a-b);
		System.out.println(b);
        for(int i=1;i<=n;i++)
        {
        	if(i%2==1)
        	{
        		int e=i+a++;
        		System.out.println(e);
        	}
        	else
        	{
        		int f=i+b;
        		System.out.println(f);
        	}
        }

	}

}

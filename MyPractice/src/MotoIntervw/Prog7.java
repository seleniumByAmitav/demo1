package MotoIntervw;

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
        int a=10;
        int count=1;
        int b=0;
        while(count<10)
        {
        	 b=n+3;
           	n=b;
        	count++;
        }
       System.out.println(b);

	}

}

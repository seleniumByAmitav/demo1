package MotoIntervw;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int count=0;
		int a=20;
            while(!(count==a))
        	{
        	if(n%2==1)
        		System.out.println(n);
        	    count++;
        	    n++;
        	}
     

	}

}

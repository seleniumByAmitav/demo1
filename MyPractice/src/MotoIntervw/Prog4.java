package MotoIntervw;

import java.util.Scanner;

public class Prog4 {
	public static int isqube(int a)
	{
		int c = a*a*a;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
        int cube = isqube(n);
        System.out.println(cube);

	}

}

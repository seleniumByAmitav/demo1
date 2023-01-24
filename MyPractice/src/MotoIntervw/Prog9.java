package MotoIntervw;

import java.util.Scanner;

public class Prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of st");
		String n=sc.nextLine();
		String s="";
		for(int i=0;i<n.length();i++)
		{
			s=n.charAt(i)+s;
		}
		System.out.println(s);
		


	}

}

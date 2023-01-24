package MotoIntervw;
import java.util.Scanner;
public class Prog3 {
	public static int isArea(int a)
	{
		int squire = a*a;
		return squire;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int area=isArea(n);
		System.out.println(area+" is the area of squire");

	}

}

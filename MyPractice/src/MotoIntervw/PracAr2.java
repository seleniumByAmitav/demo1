package MotoIntervw;
import java.util.Scanner;
public class PracAr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter the value of array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int big=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>big)
				big=ar[i];
		}
		System.out.println(big+" is the biggest element of the array");

		

	}

}

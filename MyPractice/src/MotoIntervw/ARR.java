package MotoIntervw;
import java.util.Scanner;
public class ARR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[] ar=new int[size];
		System.out.println("Enter values to array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println(ar[1]);
		System.out.println(ar[ar.length+1]);

	}

}

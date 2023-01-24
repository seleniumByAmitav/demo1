package MotoIntervw;
import java.util.Scanner;
public class PracAr4 {
	public static void revAr(int[] a)
	{
		int i=0;
		int j=a.length-1;
		while(i<=j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter values of array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		revAr(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}

		

	}

}

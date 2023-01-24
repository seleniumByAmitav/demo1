package MotoIntervw;
import java.util.Scanner;
public class PracAr5 {
	public static boolean pri(int b)
	{
		for(int i=2;i<=b/2;i++)
		{
			if(b%i==0)
			{
			return false;	
			}
		}
		return true;
	}
	public static int prime(int[] a)
	{
		int prcount=0;
		for(int i=0;i<a.length;i++)
		{
			boolean e=pri(a[i]);
			if(e==true)
			{
				prcount++;
			}
		}
		return prcount;
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
        int pr=prime(ar);
        System.out.println(pr+" prime element present in the array");

	}

}

package MotoIntervw;
import java.util.Scanner;
public class PracAr3 {
	public static int[] read()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	int size = sc.nextInt();
	int ar[]=new int[size];
	System.out.println("Enter values of array");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
   return ar;
	}

	public static void main(String[] args) {
		int [] ar=read();
		int []ra=read();
		merg(ar,ra);
		
	}
	public static void merg(int[]a,int[] b)
	{
		int[] rs=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			rs[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			rs[a.length+i]=b[i];
		}
		for(int i=0;i<rs.length;i++)
		{
			System.out.print(rs[i]+" ");
		}

	}

}

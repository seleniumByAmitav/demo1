package MotoIntervw;
import java.util.Scanner;
public class PracArr1 {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of array");
   int size = sc.nextInt();
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

  for(int i=ar.length-1;i>=0;i--)
  {
	  System.out.print(ar[i]+" ");
  }

	}

}

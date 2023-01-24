package MotoIntervw;
import java.util.Scanner;
public class M7 {
	public static boolean isXy(int a)
	{
		int temp=a;
	    int os=0;
	    int is=0;
		while(a>0)
		{
			int d=a%10;
			
			if(temp==a||a<=9)
				os=os+d;
			else
				is=is+d;
			a=a/10;
		}
		return os==is;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	int temp=n;
	boolean b=isXy(n);
	if(b==true)
		System.out.println(temp+" is a xylem");
	else
		System.out.println(temp+" is a floem");

	}

}

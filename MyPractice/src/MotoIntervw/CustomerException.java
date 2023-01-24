package MotoIntervw;
import java.util.Scanner;
public class CustomerException {
	public static void votting()
	{
		System.out.println("Votting successfull");
	}

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>=18)
		{
			votting();
		}
		else
		{
			throw new InvalidAgeException("Sorry You cant vote because you are under 18");
		}
		

	}

}

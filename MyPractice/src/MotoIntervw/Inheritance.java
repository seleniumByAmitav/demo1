package MotoIntervw;

public class Inheritance {
	public static void main(String []args)
	{
		Testing obj=new Testing("Amitav",23);
		Development obj1=new Development("Lucky",23);
		isDisplay(obj);
		isDisplay(obj1);
	}
	public static void isDisplay(Qspider b)
	{
		System.out.println("Name : "+b.getName());
		System.out.println("Age  : "+b.getAge());
		if(b instanceof Testing)
		{
			((Testing)b).testing();
		}
		else
		{
			((Development)b).Devloping();
		}
		System.out.println(".............................");
			
	}

}

package MotoIntervw;

public class M4 {

	public static void main(String[] args) {
		M3 obj=new M3("Chida",24);
		M3 obj1=new M3("Sago",24);
		display(obj);
		display(obj1);

	}
	public static void display(M3 m)
	{
		System.out.println("Name : "+m.getName());
		System.out.println("Age  : "+m.getAge());
	}

}

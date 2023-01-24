package MotoIntervw;

public class Mock1 {
	int a;
	int b=10;
	public void test()
	{
		int a=20;
		System.out.println(a);
		System.out.println(this.b);
	}

	public static void main(String[] args) {
		Mock1 obj=new Mock1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.test();
	

	}

}

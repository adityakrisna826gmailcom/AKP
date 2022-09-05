package latihan.method;

public class StaticCounter {
	
	static int count = 0;
	int a = 0;
	StaticCounter()
	{
		count ++;
	}
	
	public void getCount()
	{
		System.out.println(count + ",");
	}

	public static void main(String[] args) {
		int k;
		StaticCounter c1 = new StaticCounter();
		c1.getCount();
		StaticCounter c2 = new StaticCounter();
		c2.getCount();
		StaticCounter c3 = new StaticCounter();
		c3.getCount();
		

	}

}

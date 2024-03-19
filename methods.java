// Types of methods


class Methods
{
	// No argument method
public static void add()
{
	int a = 10;
	int b = 20;
	System.out.println(a + b);
}
	// Parameterized method
public static void add(int a, int b)
{
	System.out.println(a + b);	
}
public static void main(String[]args)
{
	System.out.println("No argument method");
	add();
	System.out.println("Parameterized method");
	add(10,20);
}
}
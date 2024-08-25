package staticassignment;

public class Static1 {
static String name;
static int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Static1.add("Sulfath",23);
Static1.display();
	}
public static void add(String a, int b)
{
	name=a;
	age=b;
}
public static void display()
{
	System.out.println(name);
	System.out.println(age);
}
}


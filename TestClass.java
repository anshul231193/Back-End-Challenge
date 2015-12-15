import java.util.Random;

public class TestClass
{
	//private variable field name
	private String name;

	//method which generates random number between 6 to 15 alongwith name variable passed
	public void generateNameRand(String name_var)
	{
		name = name_var;
		Random rand = new Random();
		int randNo = rand.nextInt((15-6)+1)+6;

		System.out.println(name+" "+randNo);
	}
	//TestClass to test the code working.
	public static void main(String[] args)
	{
		TestClass ts = new TestClass();
		//passing "Anshul" as name variable
		ts.generateNameRand("Anshul");
	}
}
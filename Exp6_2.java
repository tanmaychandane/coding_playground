class Bird
{
	String category;
	Bird(String c)
	{
		category = c;
	}
	void show()
	{
		System.out.println("Category: " + category);
	}
}
class Parrot extends Bird
{
	int no_of_parrots;
	Parrot(String c, int n)
	{
		super(c);
		no_of_parrots = n;
	}
	void show()
	{
		super.show();
		System.out.println("No of Parrots: " + no_of_parrots);
	}
}
class Exp6_2
{
	public static void main(String[] args) 
	{
		Parrot ob = new Parrot("Pet", 20);
		ob.show();
	}
}

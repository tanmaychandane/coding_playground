class Cube
{
	int length, breadth, height;
	Cube()
	{
		length = breadth = height = 10;
	}
	Cube(int s)
	{
		length = breadth = height = s;
	}
	Cube(int l, int b, int h)
	{
		length = l;
		breadth = b;
		height = h;
	}
	void volume()
	{
		System.out.println("Volume = " + (length*breadth*height));
	}
}
class Exp3_2
{
	public static void main(String[] args) 
	{
		Cube c1, c2, c3;
		c1 = new Cube();
		c2 = new Cube(15);
		c3 = new Cube(10, 20, 30);
		c1.volume();
		c2.volume();
		c3.volume();
	}
}

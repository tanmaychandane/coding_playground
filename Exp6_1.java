class Book
{
	String author, title, publisher;
	Book(String a, String t, String p)
	{
		author = a;
		title = t;
		publisher = p;
	}
}
class BookInfo extends Book
{
	float price;
	int stock_position;
	BookInfo(String a, String t, String p, float amt, int s)
	{
		super(a, t, p);
		price = amt;
		stock_position = s;
	}
	void show()
	{
		System.out.println("Book Details:");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Publisher: " + publisher);
		System.out.println("Price: " + price);
		System.out.println("Stock Available: " + stock_position);
	}
}
class Exp6_1
{
	public static void main(String[] args) 
	{
		BookInfo ob1 = new BookInfo("Herbert Schildt", "Complete Reference", "ABC Publication", 2359.50F, 10);
		BookInfo ob2 = new BookInfo("Ulman", "system programming", "XYZ Publication", 359.50F, 20);
		BookInfo ob3 = new BookInfo("Pressman", "Software Engg", "Pearson Publication", 879.50F, 15);
		ob1.show();
		ob2.show();
		ob3.show();
	}
}
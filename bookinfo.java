class Book
{
String author;
String title;
String publisher;
Book(String a, String t, String p)
{
author=a;
title=t;
publisher=p;
}
}
class BookInfo extends Book
{
private int price;
int stockposition;
BookInfo(String a, String t, String p, int r, int s)

{
super(a,t,p);
price=r;
stockposition=s;
}
public void show()
{
System.out.println("Book author is:"+author);
System.out.println("Book title is" +title);
System.out.println("Book publisher name is"+publisher);
System.out.println("Book price is"+price);
System.out.println("Book stockposition is:"+stockposition);
}
}
class MainBook
{
public static void main(String args[])
{
BookInfo B1=new BookInfo("abc", "a", "b", 100,1);
BookInfo B2=new BookInfo("ppp", "s", "d",200,3);
BookInfo B3=new BookInfo("pqr", "p", "q", 300,5);
B1.show();
B2.show();
B3.show();
}
}

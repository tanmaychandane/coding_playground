/*wap to create class "Chocolate" having data 

members 'ChocoName' and 'ChocoQuantity'. 

Derive a class 'ChocoFlavor' having data 

member 'FlavorName'. Initilize the values for 

two objects of 'ChocoFlavor' class using 

constructor and display it.
*/

class Chocolate
{
String chocoName;
int chocoQuantity;
Chocolate(String s, int n)
{
chocoName = s;
chocoQuantity = n;
}
}
class ChocoFlavor extends Chocolate
{
private String flavorName;
ChocoFlavor(String s, int n, String f)
{
super(s,n);
flavorName = f;
}
public void show()
{
System.out.println("Chocolate name is:"+chocoName);
System.out.println("Number of chocolates are:"+chocoQuantity);
System.out.println("Flavor name is:"+flavorName);
}
}
class MainChoco
{
public static void main(String args[])
{
ChocoFlavor cf1=new ChocoFlavor("dairymilk", 10, "choco");
ChocoFlavor cf2=new ChocoFlavor("milkibar", 5, "milky");
cf1.show();
}
}

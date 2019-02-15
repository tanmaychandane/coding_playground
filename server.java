//use with client.java
import java.net.*;

class server
{
public static void main(String args[])throws Exception
{
byte receive_data[]=new byte[1000];
DatagramSocket dss=new DatagramSocket(3000);
while(true)
{
DatagramPacket dps=new DatagramPacket(receive_data,receive_data.length);
dss.receive(dps);
String s1=new String(    dps.getData()   );
System.out.println("Data is  "+s1);
		
}
}
}

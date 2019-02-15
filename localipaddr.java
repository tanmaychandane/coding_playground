// program to find ip address of local PC
import java.net.*;
class localipaddr
{
public static void main(String args[])throws UnknownHostException
{
InetAddress ip;
ip=InetAddress.getLocalHost();
System.out.println("Machine IP address is:	"+ip);
}
}

import java.net.*;
class getip
{
public static void main(String args[])throws UnknownHostException
{
InetAddress ip,ip1;
ip=InetAddress.getLocalHost();
System.out.println("Local machine IP is:	"+ip);
ip1=InetAddress.getByName("tanmaync.wordpress.com");
System.out.println("IP is:	"+ip1);
}
}

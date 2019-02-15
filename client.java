// use with server.java
import java.net.*;
import java.io.*;
class client
{
public static void main(String args[])throws Exception
{
byte send_data[]=new byte[1000];
InetAddress ip;
ip=InetAddress.getLocalHost();
DatagramSocket dss=new DatagramSocket();
DataInputStream d=new DataInputStream(System.in);
String s=d.readLine();

send_data=s.getBytes();

DatagramPacket dpc=new DatagramPacket(send_data,send_data.length,ip,3000);
dss.send(dpc);
}
}

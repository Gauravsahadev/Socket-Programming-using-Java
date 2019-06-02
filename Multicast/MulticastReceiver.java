import java.io.*;
import java.net.*;
import java.util.*;
class MulticastReceiver{
	public static void main(String[] args){
		try{
			InetAddress group=InetAddress.getByName("225.4.5.6");
			MulticastSocket multicastsock=new MulticastSocket(3456);
			multicastsock.joinGroup(group);
			byte[] buffer = new byte[100];
			DatagramPacket packet=new DatagramPacket(buffer,buffer.length);
			multicastsock.receive(packet);
			System.out.println( new String(buffer));
			multicastsock.close();
		}
		catch(Exception e){e.printStackTrace();}	
	}
}
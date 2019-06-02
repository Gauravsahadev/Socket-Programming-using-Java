import java.io.*;
import java.util.*;
import java.net.*;
class MulticastSender{
	public static void main(String[] args) {
		try{
			InetAddress group=InetAddress.getByName("225.4.5.6");
			MulticastSocket multicastsock=new MulticastSocket();
			String msg="hello how are you?";
			DatagramPacket packet=new DatagramPacket(msg.getBytes(),msg.length(),group,3456);
			multicastsock.send(packet);
			multicastsock.close();
		}
		catch(Exception e){e.printStackTrace();}
	}
}
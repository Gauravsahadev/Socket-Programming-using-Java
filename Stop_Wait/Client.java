import java.io.*;
import java.net.*;
import java.util.*;

public class Client{
	public static void main(String[] args) {
		try{
			InetAddress Host=InetAddress.getByName("127.0.0.1");
			Socket s=new Socket(Host,1234);
			BufferedReader i=new BufferedReader(new InputStreamReader(s.getInputStream()));
			Scanner sc=new Scanner(System.in);
			PrintStream out=new PrintStream(s.getOutputStream());
			while(true){
				System.out.println("Enter a frame or end to exit: ");
				String msg=sc.nextLine();
				out.println(msg);
				String str=i.readLine();
				if(str.equals("Acknowledgment not received")){
					break;
				}
				System.out.println(str);
			}
			System.out.println("Acknowledgment not received...Ending service!");
			s.close();
		}
		catch(Exception e){
			System.out.println("Error"+e);
		}
	}
}
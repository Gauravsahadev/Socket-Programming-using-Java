import java.io.*;
import java.net.*;
import java.util.*;

public class Server{
	public static void main(String[] args) {
		try{
			ServerSocket ss = new ServerSocket(1234);
			Socket s=ss.accept();
			BufferedReader i=new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintStream out=new PrintStream(s.getOutputStream());
			String msg="";
			while(true){
				String str=i.readLine();
				if(str.equals("end")){
					msg="Acknowledgment not received";
					break;
				}
				msg="Acknowledgment received";
				System.out.println("Received from "+str);
				out.println(msg);
			}
			out.println(msg);
			s.close();
			ss.close();
		}
		catch(Exception e){
			System.out.println("Error"+e);
		}
	}
}
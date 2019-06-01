import java.io.*;
import java.net.*;
import java.util.*;
class Server{
	public static void main(String[] args) {
		try{
			Date d =new Date();
			ServerSocket ss = new ServerSocket(1234);
			Socket s = ss.accept();
			BufferedReader i = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintStream out = new PrintStream(s.getOutputStream());
			String str=i.readLine();
			System.out.println("Server got this: "+str);
			out.println("Hello "+str+" Date:"+d);
			s.close();
			ss.close();
		}
	catch(Exception e){
		System.out.println("Error"+e);
	}
	}
}
import java.io.*;
import java.net.*;

class Client{
	public static void main(String[] args) {
		try{
			Socket s = new Socket("127.0.0.1",1234);
			BufferedReader i = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintStream out = new PrintStream(s.getOutputStream());
			System.out.println("Enter your name: ");
			String str = br.readLine();
			out.println(str);
			str=i.readLine();
			System.out.println("Client got this: "+str);
			s.close();
		}
		catch(Exception e){
			System.out.println("Error "+e);
		}
	}
}
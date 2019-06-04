import java.io.*;
import java.net.*;

class Client{
	public static void main(String[] args) {
		try{
			InetAddress Host = InetAddress.getByName("127.0.0.1");
			int port=1234;
			long starttime=System.currentTimeMillis();
			Socket s = new Socket(Host,port);
			BufferedReader i = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintStream out = new PrintStream(s.getOutputStream());
			System.out.println("Enter a number:");
			int count=Integer.parseInt(br.readLine());
			out.println(count);
			String str=i.readLine();
			long endtime=System.currentTimeMillis();
			System.out.println(str+" Time: "+(endtime - starttime)+"milliseconds");
			s.close();
		}
		catch(Exception e){
			System.out.println("Error "+e);
		}
	}
}
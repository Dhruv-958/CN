import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
	public static final int SOCKET_NO = 12040;
	
	public static void main(String args[]) {
		
		byte[] bytes = new byte[100000000];
		FileInputStream fStream = null;
		DatagramSocket dSocket = null;
		int i = 0;
		try {
			fStream = new FileInputStream("/home/kunal/Documents/SocketProg/abc.txt");
			dSocket = new DatagramSocket(SOCKET_NO);
			int b;
			while((b = fStream.read()) != -1) {
				bytes[i] = (byte)b;
				i++;
			}
			
			dSocket.send(new DatagramPacket(bytes, i,InetAddress.getLocalHost(),12041));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		if(fStream != null)
			try {
				fStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}

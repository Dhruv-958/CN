import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
	public static final int SOCKET_NO = 12041;
	
	public static void main(String args[]) {
		
		DatagramSocket dSocket = null;
		FileOutputStream fOutStream = null;
		
		byte[] bytes = new byte[10000000];
		byte[] c;
		File file = new File("/home/kunal/Documents/abc2.txt");
		
		try {
			fOutStream = new FileOutputStream(file);
			dSocket = new DatagramSocket(SOCKET_NO);
			while(true) {
				DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
				dSocket.receive(dp);
				fOutStream.write(bytes);import java.io.FileNotFoundException;

				fOutStream.flush();
                fOutStream.close();
                break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

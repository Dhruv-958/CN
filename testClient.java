import java.io.IOException;
import java.net.*;

public class testClient {
    public static void main(String[] args){
        try{
            InetAddress serverAddress = InetAddress.getByName("localhost");

            DatagramSocket clientSocket = new DatagramSocket();

            String message = "Hello, UDP Server";
            byte[] sendData = message.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,serverAddress ,12345);

            clientSocket.send(sendPacket);

            System.out.println("Message sent to server: "+ message);

            clientSocket.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}

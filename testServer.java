import java.io.*;
import java.net.*;

public class testServer{
    public static void main(String[] args){
        try{
            DatagramSocket serverSocket = new DatagramSocket(12345);
            System.out.println("UDP Server Running...");

            byte[] receiveData = new byte[1024];

            while(true){
                DatagramPacket receivePacket = new DatagramPacket(receiveData, 0,receiveData.length);

                serverSocket.receive(receivePacket);

                String message = new String(receivePacket.getData(),0,receivePacket.getLength());

                System.out.println(message);

                System.out.println("Client IP: " + receivePacket.getAddress()+ ", Port" + receivePacket.getPort());

                receiveData = new byte[1024];
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
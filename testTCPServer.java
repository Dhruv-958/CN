import java.io.*;
import java.net.*;

public class testServer{
    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is connected to port 12345....");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client is connected to: "+clientSocket.getInetAddress());

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);

            String msg = in.readLine();
            System.out.println("Message from client: "+msg);

            out.println("Message to server: "+ msg);

            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
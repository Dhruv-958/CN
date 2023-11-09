import java.io.*;
import java.net.*;

public class testClient {
    public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost", 12345);

            InputStream inputStream = socket.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream("receivedFile.txt");

            byte[] buffer = new byte[1024];
            int bytesRead;

            while((bytesRead = inputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            fileOutputStream.close();
            inputStream.close();
            socket.close();
            System.out.println("File trans Complete.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}

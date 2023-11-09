import java.io.*;
import java.net.*;

public class testClient {
    public static void main(String[] args){

        try{   
            Socket cs = new Socket("localhost", 12345);
            
            BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
            
            out.println("Hello, Server");
            
            String serverResponse = in.readLine();
            System.out.println("Server Response: "+ serverResponse);

            in.close();
            out.close();
            cs.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

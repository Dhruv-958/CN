package lab_2;
import java.util.Scanner;
import java.net.*;

class network
{

    public static void forwardLookUp()
    throws UnknownHostException
    {
        System.out.println("Enter Domain Name to find IP Address: ");
        Scanner in = new Scanner(System.in);
        String domain = in.nextLine();
        InetAddress address = InetAddress.getByName(domain);
        System.out.println("IP Address is: " + address);
        InetAddress conicalAdd[] = InetAddress.getAllByName(domain);
        for(int i = 0; i<conicalAdd.length; i++)
        {
            System.out.println(conicalAdd[i]);
            System.out.println("Conical Addresses: "+conicalAdd[i].getCanonicalHostName());
        }
        
    }

    public static void backwardLookUp()
    throws UnknownHostException
    {
        System.out.println("Enter IP to find Domain Name: ");
        Scanner in = new Scanner(System.in);
        String IP = in.nextLine();

        InetAddress addr = InetAddress.getByName(IP);
		System.out.println("Host name is: "+addr.getHostName());
		System.out.println("Ip address is: "+ addr.getHostAddress());
    }
    public static void main(String[] args)
    {
        System.out.println(
        "--------------------Menu-----------------------\n1. Enter 1 for Forward Look Up\n2. Enter 2 for Backward Look UP\n3. Enter 3 for Exit: "
        );

        
        boolean exit = true;
        while(exit)
        {
            System.out.println(
               "Enter Choice Again: "
                );
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
           
            switch (choice) {
                case 1:
                    try {
                        forwardLookUp();
                    } catch (UnknownHostException e) {
                        //TODO: handle exception
                        System.out.println(e);
                    }
                    
                    break;
                case 2:
                try {
                    backwardLookUp();
                } catch (UnknownHostException e) {
                    //TODO: handle exception
                    System.out.println(e);
                }
                    break;
                case 3:
                    exit = false;
                    break;
            
                default:
                    System.out.println("You Entered Wrong Choice!!!");
                    break;
            }
        }
       

    }
}
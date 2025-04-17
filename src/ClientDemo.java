import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {

    public static  void run() throws IOException {
        SetUpClient();
    }

    public static void  SetUpClient() throws IOException {
        String serverAddress = "192.168.2.39";
        int serverPort =9900;
        Socket client = new Socket(serverAddress,serverPort);

        PrintWriter output = new PrintWriter(client.getOutputStream(),true);
        BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));

        BufferedReader keyBoard = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Connected to the Server on ip:"+serverAddress+ " port:"+serverPort);


    }
}

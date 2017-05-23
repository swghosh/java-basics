import java.net.*;
import java.io.*;
import java.util.*;

class HTTPSocketTest {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080); 
            
            OutputStream ost = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(ost);
            pw.print("GET / HTTP/1.1\r\nHost: www.dpsnmunc.in\r\nUser-Agent: Mozilla/5.0\r\nConnection: keep-alive\r\n\r\n");
            pw.flush();

            InputStream ist = socket.getInputStream();
            Scanner sc = new Scanner(ist);

            String line = "";

            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
            socket.close();
        }
        catch(UnknownHostException uhe) {
            uhe.printStackTrace();
        }
        catch(IOException ie) {
            ie.printStackTrace();
        }

    }
}
import java.io.*;
import java.net.*;

class HTTPDownload {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost/");
        HttpURLConnection conn = (HttpURLConnection)(url.openConnection());

        conn.setRequestMethod("GET");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0");
        conn.setRequestProperty("Connection", "close");
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate");

        int responseCode = conn.getResponseCode();

		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line = "";
        String resData = "";
        while((line = br.readLine()) != null) {
            resData = resData + line;
        }
        
        System.out.println(resData);
        
        File f = new File("/Users/" + System.getenv("USER") + "/Desktop/downloaded.html");
        FileOutputStream fout = new FileOutputStream(f);
        fout.write(resData.getBytes());
        fout.close();
    }
}
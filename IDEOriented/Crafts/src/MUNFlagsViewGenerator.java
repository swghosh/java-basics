import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MUNFlagsViewGenerator {
	
	public static String getInnerHTML(String folderPath) {
		File folder = new File(folderPath);
		File files[] = folder.listFiles();
		String html = "<!doctype html>\n<html>\n<head>\n<title>Flags</title>\n</head>\n<body>\n<table>\n";
		for(File f : files) {
			if(f.toString().endsWith(".png") == false) continue;
			String fileName = f.getName();
			html = html + "<tr><td><p align=\"center\">" + fileName.substring(0, fileName.lastIndexOf('.')) + "</p></td><td><img src=\"file://" + folderPath + "/" + fileName + "\" width=\"30%\"></td></tr>\n";
		}
		html = html + "</table>\n</body>\n</html>";
		return html;
	}

	public static void main(String[] args) throws IOException {
		File f = new File("/Users/swg/Desktop/GA-DISEC.html");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		PrintWriter out = new PrintWriter(fw);
		out.println(getInnerHTML("/Users/swg/Desktop/GA-DISEC"));
		out.close();
		fw.close();
		System.out.print("Written to file.");
	}

}

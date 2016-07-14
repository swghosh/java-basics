import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
 
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

import java.util.Scanner;
 
public class ImageCompressor {
 
    public static void compressImage(File source, File destination, float quality) throws IOException {
    	// compress a JPG image based on the quality specified
 
        File imageFile = source;
        File compressedImageFile = destination;
 
        InputStream is = new FileInputStream(imageFile);
        OutputStream os = new FileOutputStream(compressedImageFile);
 
        //float quality = 0.5f;
 
        // create a BufferedImage as the result of decoding the supplied InputStream
        BufferedImage image = ImageIO.read(is);
 
        // get all image writers for JPG format
        Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
 
        if (!writers.hasNext()) throw new IllegalStateException("No writers found"); 
 
        ImageWriter writer = (ImageWriter) writers.next();
        ImageOutputStream ios = ImageIO.createImageOutputStream(os);
        writer.setOutput(ios);
 
        ImageWriteParam param = writer.getDefaultWriteParam();
 
        // compress to a given quality
        param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        param.setCompressionQuality(quality);
 
        // appends a complete image stream containing a single image and
        //associated stream and image metadata and thumbnails to the output
        writer.write(null, new IIOImage(image, null, null), param);
 
        // close all streams
        is.close();
        os.close();
        ios.close();
        writer.dispose();
 
    }
    
    
    public static void compressImages(File sourceFolder, File destinationFolder, float quality) throws IOException {
    	
    	// compress all JPG images from source folder and store it in destination folder
    	
        File[] files = sourceFolder.listFiles();
        for(int i = 0; i < files.length; i++) {
            if(files[i].toString().substring(files[i].toString().length() - 4).equalsIgnoreCase(".jpg") == false) continue;
            String filename = files[i].toString().substring(files[i].toString().lastIndexOf('/'));
            File dest = new File(destinationFolder, filename);
            compressImage(files[i], dest, quality);
            System.out.println(files[i].toString() + " compressed to " + dest.toString());
        }
    }
    
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Source folder path ->");
    	File s = new File(sc.next());
    	System.out.print("Destination folder path ->");
    	File d = new File(sc.next());
    	System.out.print("Percentage compression ->");
    	int quality = 100 - sc.nextInt();
    	compressImages(s, d, (float)((float)quality * 0.01));
    	sc.close();
    }
}
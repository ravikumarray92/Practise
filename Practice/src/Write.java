import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;

public class Write {
	


	    public static void main(String[] args) throws IOException {

	        try {

	            File f = new File("D:/Content.txt");

	            BufferedReader b = new BufferedReader(new FileReader(f));

	            String readLine = "";

	            System.out.println("Reading file using Buffered Reader");

	            while ((readLine = b.readLine()) != null) {
	                System.out.println(readLine);
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    

	}

}

package CollectionsFrameworkASSIGNMENTS;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWordDoc {
	
	public static void main(String[] args) throws IOException {
		try{FileReader r=new FileReader("C:\\Users\\palak\\Documents\\JavaExcel\\PlainTextFileHiFive.txt");
		int character;
		while((character=r.read())!=-1) {
			System.out.println((char)character);
			
		
		}
		r.close();
	} catch (IOException e) {
		e.printStackTrace();
	}	
		try{FileWriter writer=new FileWriter("C:\\Users\\palak\\Documents\\JavaExcel\\PlainTextFileHiFive.txt",true);
		writer.write("10987654321");
				
		writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}



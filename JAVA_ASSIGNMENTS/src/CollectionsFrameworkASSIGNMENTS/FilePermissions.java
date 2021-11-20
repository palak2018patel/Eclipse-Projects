package CollectionsFrameworkASSIGNMENTS;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FilePermissions {

	public static void main(String[] args)throws IOException {
		String filePath="C:\\Users\\palak\\Documents\\JavaExcel\\HelloPermissionFile";
		File f=new File(filePath);         //creating a file
		System.out.println("File is created...");
		FileWriter wrt=new FileWriter(f);
		String data ="Hello";
		wrt.write(data);                  //writing
		System.out.println("Data is entered...");
		f.setReadable(true);              //setting permissions
		f.setWritable(true);
		f.setExecutable(true);
		System.out.println("File has permission to read and write");	
		Path path=Paths.get("C:\\Users\\palak\\Documents\\JavaExcel\\HelloPermissionFile");//line 22-end issufficient for demonstration.
		Boolean bool=Files.isReadable(path);
		if (bool){
			System.out.println("Is readable");
		}
		else {
			System.out.println("not readable");	
		
		}
		bool=Files.isWritable(path);
		if(bool) {
			System.out.println("Is writable");
		}
		else {
			System.out.println("Not writabe");
		}
		bool=Files.isExecutable(path);
		if(bool) {
			System.out.println("Is executable");
		}else {
			System.out.println("not executable");
		}
	
		}

}

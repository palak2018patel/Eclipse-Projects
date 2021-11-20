package CollectionsFrameworkASSIGNMENTS;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ReadPropFile {

	public static void main(String[] args)throws IOException {
		FileReader fr=new FileReader("C:\\Users\\palak\\eclipse-workspace\\JAVA_ASSIGNMENTS\\src\\DataFiles\\demo.properties");
		Properties p=new Properties();
		p.load(fr);
		System.out.println(p.getProperty("name"));
		Set  set=p.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue() );			
		}
		
		Properties p1=new Properties();
		p1.setProperty("ID", "02");
		p1.setProperty("Name", "XYZ");
		p1.setProperty("Dept", "Bio");
		p1.store(new FileWriter("C:\\Users\\palak\\eclipse-workspace\\JAVA_ASSIGNMENTS\\src\\DataFiles\\demowrite2.properties"),"Writing a File");
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperties());
		
		
		
		
		
		
		
		
	}

}

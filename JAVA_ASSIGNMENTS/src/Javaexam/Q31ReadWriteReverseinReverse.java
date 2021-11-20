package Javaexam;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.hpsf.Property;

public class Q31ReadWriteReverseinReverse {

	public static void main(String[] args) {
		FileReader fr=new FileReader("C:\\Users\\palak\\eclipse-workspace\\JAVA_ASSIGNMENTS\\src\\DataFiles\\demo.properties");
		Properties p=new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("name"));
		Set set=p.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry =(Map.Entry)itr.next();
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	}
			Properties p1= new Properties();
			p1.setProperty("ID0", "01");
			p1.setProperty("ID1","02");
			p1.setProperty("ID2","03");
			p1.setProperty("ID4","04");	
			p1.store(new FileWriter("C:\\Users\\palak\\eclipse-workspace\\JAVA_ASSIGNMENTS\\src\\DataFiles\\demowrite.properties"));
			
			//System.out.println(System.getProperty(user.dir");"
}
			
	}
	
	

}

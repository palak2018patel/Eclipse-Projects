import java.util.HashMap;
import java.util.Map;
public class Hashmap {
		public static void main(String[] args) {
			Map<String,Object>Student=new HashMap<String,Object>();
			Student.put("1", "ABC");
			Student.put("2", "DEF");
			Student.put("ID",313);
			Student.put("Name","Palak");
			Student.put("LMN", "45");
			Student.put("pqr", null);
		System.out.println(Student.get("ID"));
		for(Map.Entry<String, Object>m:Student.entrySet()) {
			System.out.print(m.getKey());
			System.out.print(" : ");
			System.out.println(m.getValue());
		}		
		
	}

}

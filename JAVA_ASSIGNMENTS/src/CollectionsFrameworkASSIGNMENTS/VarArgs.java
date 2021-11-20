package CollectionsFrameworkASSIGNMENTS;

public class VarArgs {
 static void method1(int a) {
	System.out.println("Value a" +a);
	
}
 static void method1(int a, int b) {
	 System.out.println("Value a"+a+"Value b"+b);
	 
 }
 static void method1(int a[]) {
	 for(int x:a)
	 {
	 System.out.println("Value a "+x);
 }
 }
	 static void method(int ...v) {
		 for(int x:v)
		 {
		 System.out.println("Value a "+x);
 }
	 }

public static void main(String[] args) {
	int a[]= {3,4,5,6,7};
	VarArgs.method1(2);
	VarArgs.method(2,4,6,7,8,9);
}
	
	
}
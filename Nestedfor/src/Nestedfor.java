
public class Nestedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1; i<=5; i++) {
			System.out.println("12345");*/
		
	/*for(int sum=11111; sum<= 55555; sum=sum+11111) {
		System.out.println(sum);*/
		
		//String[] numbers= {"1", "12", "123", "1234", "12345"};
		
		/*for (int i=0;i<5;i++) {
			System.out.println(numbers[i]);	*/
		
		
		/*for (int j=4;j>=0;j--) {
			System.out.println(numbers[j]);*/
		
		/*for (int k=1; k<=5;k++) {
			for(int l=1; l<=k; l++) {
			System.out.print("*");
			}
			System.out.println();
			}
		for (int m=5; m>=1;m--) {
			for (int n=1; n<=m;n++) {
				System.out.print("*");
			}
				System.out.println();
				
			}*/
		/*for (int p=1;p<=5;p++) {
			for (int q=1; q<=p;q++) {
				System.out.print(q);
			}
			System.out.println();
		
		}*/
		/*for (int r=5;r>=1;r--){
			for (int s=1;s<=r;s++) {
				System.out.print(s);
			}
			System.out.println();
		}*/
		
		
	
//one dimensional array
	
/*int age1[] ;
 age1 = new int[]{12,13,14,15,24,45,};
for(int i=0;i<6;i++)
		
	System.out.println(age1[i]);*/
//very small 2D array		
		
	/*	numbers=new int[2][3];
		numbers[0][0]=numbers[0][1]=numbers[0][2]=5;
		numbers[1][0]=numbers[1][1]=numbers[1][2]=9;
		System.out.println(numbers[0][0]+" "+numbers[0][1]+" "+numbers[0][2]);
		System.out.println(numbers[1][0]+" "+numbers[1][1]+" "+numbers[1][2]);
		*/
		

//Intialising 2d arrary at the time of declaration//
		/*int myArray[][]= {{1,2},{3,4},{5,6}};
		System.out.println("Initialised two dimensional array is :");
		
		for(int i=0;i<3;i++) {
	 
			for(int j=0;j<2;j++) {
				System.out.print(myArray[i][j]+"");
			}
			System.out.println();
output: 12
    	34
	    56	}*/
		
		
		//new 2d array using a loop//
		
		int myarray[][];
		myarray = new int[3][3];
		System.out.println("Array elements are:");
		for (int i=0;i<3;i++) 
		{
			for(int j=0;j<3; j++) 
			{
				    myarray[i][j] = i+1;
				System.out.print(myarray[i][j]+" ");
				}
			System.out.println();
			}
		}
}



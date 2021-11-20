package CollectionsFrameworkASSIGNMENTS;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.*;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
public class FIleReadingExcel {	
	public static void main(String[] args)throws IOException {		
		
		//File f=new File();
		FileInputStream fis=new FileInputStream("C:\\Users\\palak\\Documents\\JavaExcel\\DemoExcelFile.xls");
		System.out.println("Check if DemoExcelFIle has permission to read "+fis.getFD());
		
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet sheet=wb.getSheetAt(0);
			HSSFRow row=sheet.getRow(0);
			System.out.println(row.getCell(1));		
	
			String filePath="C:\\Users\\palak\\Documents\\JavaExcel\\DemoWriteExcelFile.xls";
			
			HSSFWorkbook wb1=new HSSFWorkbook();
			HSSFSheet sheet1=wb1.createSheet("StudentData");
			HSSFRow row1=sheet1.createRow(0);
			row1.createCell(0).setCellValue("StudentName");
			row1.createCell(1).setCellValue("ID");
			row1.createCell(2).setCellValue("Department");
					
					HSSFRow row2=sheet1.createRow(2);
					row2.createCell(0).setCellValue("Premal");
					row2.createCell(1).setCellValue("1");
					row2.createCell(2).setCellValue("Bio");	
					
					HSSFRow row3=sheet1.createRow(3);
					row3.createCell(0).setCellValue("Kabu");
					row3.createCell(1).setCellValue("2");
					row3.createCell(2).setCellValue("Math");	
					
				
			
			FileOutputStream fos = new FileOutputStream(filePath);
			
			wb1.write(fos);
			fos.close();
		
	}

	}
	



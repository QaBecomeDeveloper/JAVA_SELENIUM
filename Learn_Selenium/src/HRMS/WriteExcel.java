package HRMS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	@SuppressWarnings({ "resource" })
	public static void updateExcel() throws IOException {
			try {
		    FileInputStream file = new FileInputStream(new File("C:\\Users\\Sushil\\Downloads\\Attendance.xlsx"));
			XSSFWorkbook my = new XSSFWorkbook(file);
	        XSSFSheet Adetails = my.getSheetAt(0);
	        String attendance[] = 
	        {"P","P","P","P","LWP","LWP","L","L","HD","HD","A","A","P","P","P","P","P","P","P","P","A","A","P","P","P","P","P","P","P","P"};
	        int rowCount=3, colCount=3;
	      
	        XSSFRow row = Adetails.getRow(rowCount);
	        for(int i=0;i<attendance.length;i++)
	        {
	        	row.createCell(colCount++).setCellValue((String)attendance[i]);
	        }
	        
	        String filePath ="C:\\Users\\Sushil\\Downloads\\UpdateAttendance.xlsx";
	        FileOutputStream outStream =new FileOutputStream(filePath);
	        my.write(outStream);
	        outStream.close();
	        System.out.println("file updated");
	}catch (Exception e) 
	{
    	e.printStackTrace();
			}
	}

	public static void main(String[] args) throws IOException {
		updateExcel();
	}
}
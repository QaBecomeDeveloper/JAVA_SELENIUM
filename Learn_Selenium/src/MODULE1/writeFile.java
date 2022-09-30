package MODULE1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeFile {

	public static void writeExcel() throws IOException {
	
	try {
		FileInputStream file = new FileInputStream(new File("C:\\Users\\Sushil\\Downloads\\Attendance.xlsx"));
        @SuppressWarnings("resource")
		XSSFWorkbook yourworkbook = new XSSFWorkbook(file);
        XSSFSheet Attendancesdetails = yourworkbook.getSheetAt(0);
        XSSFRow row = Attendancesdetails.getRow(3);
        XSSFCell column = row.getCell(3);
        String status = column.getStringCellValue();
        status ="P";
        System.out.println(status);
        column.setCellValue(status);
        file.close();
        FileOutputStream out = 
            new FileOutputStream(new File("C:\\Users\\Sushil\\Downloads\\AttendanceUpdate.xlsx"));
        yourworkbook.write(out);
        out.close();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
	
	
}
	public static void main(String[] args) throws IOException {
		writeExcel();
	}
}
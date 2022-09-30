package MODULE1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {
	public String readDataFromExcel(int rowcount,int columncount, String filepath,String Sheetname )
    {
        String data=null;
        try
        {
            FileInputStream input= new FileInputStream(filepath);
            XSSFWorkbook wb=new XSSFWorkbook(input);
            XSSFSheet sh=wb.getSheet(Sheetname);
            XSSFRow row=sh.getRow(rowcount);
            row.getCell(columncount).toString();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return data;
     }

public void writeDataFromExcel(int rowcount,int columncount,String filepath,String Sheetname,String value)
{
    try
    {
        FileInputStream input=new FileInputStream(filepath);
        XSSFWorkbook wb=new XSSFWorkbook(input);
        XSSFSheet sh=wb.getSheet(Sheetname);
        XSSFRow row=sh.getRow(rowcount);
        FileOutputStream webdata=new FileOutputStream(filepath);
        row.createCell(columncount).setCellValue(value);
        wb.write(webdata);

    }
    catch(Exception e)
    {

    }
}

}

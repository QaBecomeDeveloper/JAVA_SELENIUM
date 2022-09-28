package dataDriven;

public class xldemo {

	public static void main(String[] args) throws Exception {
	      ExcelUtils  dd = new ExcelUtils ("C:\\Users\\lenovo\\Downloads\\PLC.xlsx","Sheet1");
	      System.out.println("The Row count is " + dd.excel_get_rows());

	      dd.getCellDataasnumber(1, 1);
	      dd.getCellDataasnumber(1, 2);
	      dd.getCellDataasnumber(1, 3);
	      dd.getCellDataasnumber(2, 1);
	      dd.getCellDataasnumber(2, 2);
	      dd.getCellDataasnumber(2, 3);
	      dd.getCellDataasnumber(3, 1);
	      dd.getCellDataasnumber(3, 2);
	      dd.getCellDataasnumber(3, 3);
	   }
}

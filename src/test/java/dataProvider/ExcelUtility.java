package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	    
    ConfigFileReader config = new ConfigFileReader();
    
    public String ReadExcel(int r, int c) throws Exception {
    
    File scr = new File(config.getexcelPath()+config.getexcelFilename());
    FileInputStream file = new FileInputStream(scr);    
    XSSFWorkbook wb = new XSSFWorkbook(file);
    XSSFSheet sh = wb.getSheet(config.getsheetName());
    
    wb.close();
    
    return sh.getRow(r).getCell(c).getStringCellValue(); 
    
    
    
    }
    
    public int getSheetLastRowNum() throws Exception {
        
        File scr = new File(config.getexcelPath()+config.getexcelFilename());
        FileInputStream file = new FileInputStream(scr);    
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sh = wb.getSheet(config.getsheetName());
        wb.close();
        return sh.getLastRowNum();    
        
        
        
        }
    
public int getSheetLastColNum(int row) throws Exception {
        
        File scr = new File(config.getexcelPath()+config.getexcelFilename());
        FileInputStream file = new FileInputStream(scr);    
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sh = wb.getSheet(config.getsheetName());
        XSSFRow cl = sh.getRow(row);
        wb.close();
        return cl.getLastCellNum();
        
        
        
        
        
        }
    
    

}

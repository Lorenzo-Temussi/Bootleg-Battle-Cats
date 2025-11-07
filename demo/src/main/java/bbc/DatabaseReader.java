package bbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatabaseReader {

  private HSSFSheet sheet;

  public DatabaseReader() {
    System.out.println("Working dir: " + new File(".").getAbsolutePath());
    try {     
    FileInputStream file = new FileInputStream("demo/src/main/resources/Excels/Catabase.xlt");
    HSSFWorkbook database = new HSSFWorkbook(file);
    this.sheet = database.getSheetAt(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    
  }

  public int getCatStat(int ID, CatStats statEnum) {
    int statIndex = statEnum.ordinal();
    
    return (int)sheet.getRow(ID + 2).getCell(statIndex).getNumericCellValue();
  }
  
  
}

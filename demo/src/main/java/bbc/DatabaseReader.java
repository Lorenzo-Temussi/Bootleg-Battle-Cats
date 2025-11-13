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
  int numOfCats = 3;
  int numOfStats = 40;

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

  public int getCatScalarStat(int ID, String stat) { // returns -1 on bad input
    int statIndex = -1;
    
    for (int i = 0; sheet.getRow(1).getCell(i) != null; i++) {
      statIndex = i;
      if(stat.equals((String)sheet.getRow(1).getCell(i).getStringCellValue())) {
        break;
      }
      
      if (i > numOfStats) { 
        return -1;
      }
    }

    return (int)sheet.getRow(ID + 2).getCell(statIndex).getNumericCellValue();
  }
  
  public String getCatDescStat(int ID, String stat) {
    int statIndex = -1;
    
    for (int i = 0; sheet.getRow(1).getCell(i) != null; i++) {
      statIndex = i;
      
      if(stat.equals((String)sheet.getRow(1).getCell(i).getStringCellValue())) {
        break;
      }
      
      if (i > numOfStats) {
        return "errorito out of boundito";
      }
    }
    
    return (String)sheet.getRow(ID + 2).getCell(statIndex).getStringCellValue();
  }
}

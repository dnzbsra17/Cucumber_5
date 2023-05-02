package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _07_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        //hafızada workbook ve sheet ini oluşturucam

        XSSFWorkbook workbook=new XSSFWorkbook(); // hafızada bir woekbook oluşturuldu
        XSSFSheet sheet=workbook.createSheet("Sayfa1"); // içinde sheet oluşturdum


        //Hafızada işlemlere devem ediyorum

        Row newRow=sheet.createRow(0);
        Cell newCell=newRow.createCell(0);
        newCell.setCellValue("Büşra and Deniz");

        //paht i verip yazdırma işlemi SAVE işlemi

        String path="src/test/java/ApachePOI/resorce/NewExcel.xlsx";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("işlem tamamlandı");









    }
}

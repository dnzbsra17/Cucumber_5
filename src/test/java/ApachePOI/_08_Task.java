package ApachePOI;
/**
 * Soru 1:
 * yeni excel (altalta.xls)
 * Çarpım tablosunu excele yazdırınız.
 * 1 x 1 = 1 şeklinde işaretleri de yazdırınız.
 * sıfırdan excel oluşturarak.
 * her bir onluktan sonra 1 satır boşluk bırakarak alt alata
 */

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Soru 2:
 * yeni excel (yanyana.xls)
 * Çarpım tablosunu excele yazdırınız.
 * 1 x 1 = 1 şeklinde işaretleri de yazdırınız.
 * sıfırdan excel oluşturarak.
 * her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
 */
public class _08_Task {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sayfa1");
        Row newRow = null;
        Cell newCell;
        int sayac = 0;
        int createCellSayac=0;
        int setCellValueSayac=0;
        for (int i = 1; i <= 3; i++) {
            newRow = sheet.createRow(sayac);
            newCell = newRow.createCell(createCellSayac);
            newCell.setCellValue(i);
            createCellSayac++;

        }

        String path = "src/test/java/ApachePOI/resorce/altalta.xlsx";
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("işlem bitti");


    }


}

package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {
        String paht = "src/test/java/ApachePOI/resorce/ApacheExcel2.xlsx";

        FileInputStream inputStream = new FileInputStream(paht);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        //çalışma sayfasındaki fiziksel kullanılan toplam satır sayısını veriyor
        int rowCount = sheet.getPhysicalNumberOfRows(); // zoo daki lenght e karşılık gelmektedir

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells(); //zoo[i].lenght

            for (int j = 0; j < cellCount; j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell + "\t");

            }
            System.out.println();

        }


        System.out.println("************************************");

        //2.yol
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                System.out.print(sheet.getRow(i).getCell(j) + "\t");

            }
            System.out.println();

        }


    }
}

package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        // dosyanın yolunu değişkene atalım
        String paht = "src/test/java/ApachePOI/resorce/ApacheExcel2.xlsx";

        //JavaDosya okuma işlemcisine dosyanın yolunu veriyoruz
        //böylece program ile dosya arasında bağlantı oluştu

        FileInputStream dosyaOkumaBaglantisi = new FileInputStream(paht);

        //dosya okuma işlemcisi üzerinden Çalışma Kitabını alıyorum
        //hafızada workbooku alıp oluşturdu

        Workbook calismaKitabi = WorkbookFactory.create(dosyaOkumaBaglantisi);


        //istediğim isimdeki çalışma sayfasını alıyorum

        Sheet calismaSayfasi = calismaKitabi.getSheet("sheet1");


        //istenilen satırı alıyorum

        Row satir = calismaSayfasi.getRow(0);

        Cell hucre= satir.getCell(0);

        System.out.println("hucre = " + hucre);


    }
}

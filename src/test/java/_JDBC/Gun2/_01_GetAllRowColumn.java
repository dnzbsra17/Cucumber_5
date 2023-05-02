package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class _01_GetAllRowColumn extends JDBCParent {
    @Test
    public void Test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language"); // data+ metadata
        ResultSetMetaData rsmd = rs.getMetaData();// data dışındaki bilgileri : kolon sayısı , ismi , tipleri

        // Sonucları haricindeki diğer bilgiler : kolon sayısı isimleri , tipleri

        int coloumCount = rsmd.getColumnCount();
        System.out.println("coloumCount = " + coloumCount);

        for (int i = 1; i <= coloumCount; i++) {
            System.out.println("rsmd = " + rsmd.getColumnName(i));
            System.out.println("rsmd.getColumnTypeName(i) = " + rsmd.getColumnTypeName(i));


        }

    }

    @Test
    public void Test2() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language"); // data+ metadata
        ResultSetMetaData rsmd = rs.getMetaData();// data dışındaki bilgileri : kolon sayısı , ismi , tipleri

        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.print(rsmd.getColumnName(i) + "\t");
        }
        System.out.println();

        while (rs.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.print(rs.getString(i) + "\t");
            }

            System.out.println();
        }

    }

    @Test
    public void test3() throws SQLException {
        // bir metoda sorguyu("select * from language") gönderiniz,
        // metod size sorgunun datasını bir ArrayList olarak döndürsün

        String sql = "select * from city";
        ArrayList<ArrayList<String>> donenSonuc = getListData(sql);
        for (ArrayList<String> s:donenSonuc){
            System.out.println("s = " + s);
        }
        
    }

    public ArrayList<ArrayList<String>> getListData(String sql) {
        ArrayList<ArrayList<String>> tablo = new ArrayList<>();

        try {
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {

                ArrayList<String> satir = new ArrayList<>();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    satir.add(rs.getString(i));
                }

                tablo.add(satir);
            }
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        return tablo;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTest;

import Entity.Hasta;
import Model.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author nurcan
 */
public class login {

    private DBConnection db;

    public DBConnection getDb() {

        if (db == null) {
            this.db = new DBConnection();
        }
        return db;
    }

    public void setDb(DBConnection connection) {
        this.db = connection;
    }

    @Test
    public void HastaKullaniciTest() {
        Hasta hasta = new Hasta();
        hasta.setTc("19777905432");
        String tc = hasta.getTc();
        Assert.assertEquals("19777905432", tc);
        hasta.setSifre("12345");
        String sifre = hasta.getSifre();
        Assert.assertEquals("12345", sifre);
        System.out.println("HastaKullaniciTest() çalıştı");
    }

    @Test()
    public void KullaniciTest() {
        String sifre = "12345";
        String tc = "19777905432";
        int sayac = 0;
        try {
            Statement st = this.getDb().connect().createStatement();
            ResultSet rs = st.executeQuery("select * from hasta");

            while (rs.next()) {
                Hasta tmp = new Hasta(rs.getString("tc"), rs.getString("sifre"));
                if (rs.getString("tc").equals(tc) && rs.getString("sifre").equals(sifre)) {
                    sayac++;
                }
            }

            if (0 == sayac) {
                System.out.println("Sisteme giriş başarsız");
            } else {
                System.out.println("Sisteme giriş başarılı");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}

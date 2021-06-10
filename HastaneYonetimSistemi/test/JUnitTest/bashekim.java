/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTest;

import Model.DBConnection;
import java.sql.Statement;
import org.junit.Test;

public class bashekim {
    
    public bashekim() {
    }
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
     public void insert() {
         int id=22;
         String poliklinik="Çocuk Enfeksiyon";
         String name="Fatih ÇOLAK";
         
        try {
            Statement st = this.getDb().connect().createStatement();
            st.executeUpdate("insert into bashekim(id,poliklinik, name) values ('" + id + "','" + poliklinik + "','" + name + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("insert() metodu çalıştı");
        System.out.println("Sisteme başarıyla eklendi");
                
    }
}

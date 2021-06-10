/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTest;

import Model.DBConnection;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nurcan
 */
public class randevu {
    
    public randevu() {
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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void add() {
         
         String doktoradi="Fatih ÇOLAK";
         String poliklinik="Çocuk Enfeksiyon";
         String randevuSaati="13:10";
         
       try {
            Statement st = this.getDb().connect().createStatement();
            st.executeUpdate("insert into randevularım(doktoradi,poliklinik,randevusaati) values ('" + doktoradi + "','" + poliklinik + "','" + randevuSaati + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}

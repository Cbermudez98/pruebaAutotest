package pruebaautotest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Leer {
    private static Connection conn;
    private String[] v = null;
    private String[] c = null;
    private PreparedStatement ps;
    public void leer(String archivo){
        try{
            int i = 0;
            String clave="",valor="";
            FileReader r = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(r);
            String dato = "";
            while (dato != null) {
                dato = buffer.readLine();
                if(dato != null){
                    String[] tmp = dato.split("=");
                    int lenght = tmp.length;
                    if(lenght == 2) {
                        if (clave == "") {
                            clave += tmp[0];
                            valor += tmp[1]; 
                        }else{
                            clave += ","+tmp[0];
                            valor += ","+tmp[1]; 
                        }
                              
                    }
                    i++;  
                }                              
            }
            
            c = clave.split(",");
            v = valor.split(",");           
            String Table = "CREATE TABLE IF NOT EXISTS datos ("
                    + "id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, ";
            String insert = "INSERT INTO datos ("+clave+") VALUES (";
            for (int j = 0; j < c.length; j++) { 
                
                if(j < (c.length-1)){
                    insert += " ?, ";
                    try {
                        double d = Double.parseDouble(v[j]);
                        Table += c[j]+" INT(20) NOT NULL, ";
                   } catch (Exception e) {
                        Table += c[j]+" VARCHAR(50) NOT NULL, ";                        
                   }
                    
                }else{
                    insert += " ?)";
                    try {
                        double d = Double.parseDouble(v[j]);
                        Table += c[j]+" INT(20) NOT NULL)";
                   } catch (Exception e) {
                        Table += c[j]+" VARCHAR(50) NOT NULL)";
                   }
                }                
            }     
            Coneccion db = new Coneccion();
            db.createTable(Table);
            conn = db.getConn();
            ps = conn.prepareStatement(insert);
            for (int j = 0; j < v.length; j++) {
                int id = j+1;
                try {                    
                    int d = Integer.parseInt(v[j]);
                    ps.setInt(id, d);
                } catch (Exception e) {
                    ps.setString(id, v[j]);
                }
            }
            ps.executeUpdate(); 
            System.out.println("Datos almacenados correctamente.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        };       
    }    
}

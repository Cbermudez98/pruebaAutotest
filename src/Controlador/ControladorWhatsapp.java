/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Auxiliar
 */
public class ControladorWhatsapp {
    //Api para enviar mensaje a whatapp niceapi.net
    static String id = "YXzDpxAvWUyK/RI3WlUJXGNjODYwNDY2NF9hdF9nbWFpbF9kb3RfY29t";
    static String mobile = "+573015267745";
    static String message = "Hello dude this is a try, don't worry";
    
    static HttpURLConnection con = null;
    
    public static void EnviarWhatsapp(){
        try {
            URL url = new URL("https://NiceApi.net/API");
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("X-APIId", id);
            con.setRequestProperty("X-APIMobile", mobile);
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.setUseCaches(false);
            con.setDoOutput(true);
            
            DataOutputStream streamOut = new DataOutputStream(con.getOutputStream());
            streamOut.writeBytes(message);
            streamOut.close();
            
            InputStream streamIn = con.getInputStream();
            BufferedReader readerIn = new BufferedReader(new InputStreamReader(streamIn));
            System.out.println(readerIn.readLine());
            readerIn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            if(con != null){
                con.disconnect();
            }
        }
    }
}

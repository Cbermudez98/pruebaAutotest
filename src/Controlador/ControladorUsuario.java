/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Auxiliar
 */
public class ControladorUsuario {

    public static Connection con;

    public static Usuario Login(String usuario, String password) throws SQLException, Exception {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Usuario usu = null;
        try {
            ConexionBaseDeDatos mbd = ConexionBaseDeDatos.getInstancia();
            mbd.conectar();
            con = mbd.getConexion();
            pst = con.prepareStatement("select * from usuario where usuario = ? and contrasena = ?");
            pst.setString(1, usuario);
            pst.setString(2, password);
            rs = pst.executeQuery();
            while (rs.next()) {
                usu = load(rs);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            
            if(pst != null){
                pst.close();
            }
        }
        return usu;
    }

    public static Usuario load(ResultSet usu) throws SQLException {
        Usuario u = new Usuario();
        u.setUsuario(usu.getString(1));
        u.setContrasena(usu.getString(2));
        u.setNombre(usu.getString(3));
        u.setFirma(usu.getString(4));
        u.setTipo(usu.getString(5));
        u.setId(Integer.parseInt(usu.getString(6)));

        return u;
    }
}

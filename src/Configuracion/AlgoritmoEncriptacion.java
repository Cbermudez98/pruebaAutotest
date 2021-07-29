/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.*;
import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;

/**
 *
 * @author Auxiliar
 */
public class AlgoritmoEncriptacion {
    Cipher encrypt;
    Cipher decrypt;
    SecretKey key;
    String keyTxt;

    public AlgoritmoEncriptacion(String clave) {
        keyTxt = clave;
        try {
            encrypt = Cipher.getInstance("DES");
            decrypt = Cipher.getInstance("DES");

            if (keyTxt.equals("")) {
                SecretKey key = KeyGenerator.getInstance("DES").generateKey();//Genera Clave automàtica
                encrypt.init(Cipher.ENCRYPT_MODE, key);//Con clave aleatoria
                decrypt.init(Cipher.DECRYPT_MODE, key);//Con clave aleatoria
            } else {
                KeySpec ks = new DESKeySpec(keyTxt.getBytes("UTF8"));
                SecretKeyFactory kf = SecretKeyFactory.getInstance("DES");
                SecretKey ky = kf.generateSecret(ks);
                encrypt.init(Cipher.ENCRYPT_MODE, ky);
                decrypt.init(Cipher.DECRYPT_MODE, ky);
            }
        } catch (InvalidKeySpecException ex) {
        } catch (UnsupportedEncodingException ex) {
        } catch (InvalidKeyException ex) {
        } catch (NoSuchAlgorithmException ex) {
        } catch (NoSuchPaddingException ex) {
        }
    }

    public String encriptar(String str) {
        try {
            byte[] utf8 = str.getBytes("UTF8");
            byte[] enc = encrypt.doFinal(utf8);
            return new sun.misc.BASE64Encoder().encode(enc);
        } catch (javax.crypto.BadPaddingException e) {
        } catch (IllegalBlockSizeException e) {
        } catch (UnsupportedEncodingException e) {
        } catch (java.io.IOException e) {
        }
        return null;
    }

    public String desencriptar(String str) {
        try {
            byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);
            byte[] utf8 = decrypt.doFinal(dec);
            return new String(utf8, "UTF8");
        } catch (javax.crypto.BadPaddingException e) {
        } catch (IllegalBlockSizeException e) {
        } catch (UnsupportedEncodingException e) {
        } catch (java.io.IOException e) {
        }
        return null;
    }
}

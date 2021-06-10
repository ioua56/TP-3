/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.messagedecorator;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import org.emp.gl.messages.IMessage;

/**
 *
 * @author islem
 */
public class DesCrypte extends Cryptage{
    
    public DesCrypte(IMessage decoratedMessage) {
        super(decoratedMessage);

    }

    @Override
    public void setMessage(String message) {
        
           
        try {
            super.setMessage(DesEncrypt(message)); //To change body of generated methods, choose Tools | Templates.
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DesCrypte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(DesCrypte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(DesCrypte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(DesCrypte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(DesCrypte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(DesCrypte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public String DesEncrypt(String ss) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException{
            //    byte[] plainText = args[0].getBytes("UTF8");
      byte[] plainText = ss.getBytes();
      //
      // get a DES private key
      KeyGenerator keyGen = KeyGenerator.getInstance("DES");
      keyGen.init(56);
      Key key = keyGen.generateKey();
      //
      // get a DES cipher object and print the provider
      Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
   
      cipher.init(Cipher.ENCRYPT_MODE, key);
      byte[] cipherText = cipher.doFinal(plainText);
      return (new String(cipherText, "UTF8"));
    }
    
    
    
}

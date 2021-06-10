/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.messagedecorator;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.emp.gl.messages.IMessage;

/**
 *
 * @author islem
 */
public class MD5Hash extends Inetgrity {

    public MD5Hash(IMessage decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public void setMessage(String message) {
        try {
            message +="\n MD5 Hash : "+getMD5Hash(message);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MD5Hash.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.setMessage(message); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public String getMD5Hash(String message) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(message.getBytes());

        byte byteData[] = md.digest();

        //convertir le tableau de bits en une format hexadécimal - méthode 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();

       
    }
}



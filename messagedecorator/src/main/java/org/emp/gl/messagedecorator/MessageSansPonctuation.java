/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.messagedecorator;

import org.emp.gl.messages.IMessage;

/**
 *
 * @author islem
 */
public class MessageSansPonctuation extends Filtrage{
    
    public MessageSansPonctuation(IMessage decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public void setMessage(String message) {
        message = removePonctuation(message);
        decoratedMessage.setMessage(message);
    }

    private String removePonctuation(String message) {
              return message.replaceAll("\\p{Punct}","");
    }
    
    
    
}

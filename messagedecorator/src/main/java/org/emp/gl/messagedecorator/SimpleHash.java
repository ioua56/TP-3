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
public class SimpleHash extends Inetgrity{
    
    public SimpleHash(IMessage decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public void setMessage(String message) {
        message +="\n Hash : "+SimpleHash(message);
        decoratedMessage.setMessage(message);
    }

    private int SimpleHash(String message) {
              return message.length();
    }
    
    
    
}

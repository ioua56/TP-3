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
public class MessageMAJ extends Filtrage{
    
    public MessageMAJ(IMessage decoratedMessage) {
        super(decoratedMessage);
    }
 
    @Override
    public void setMessage(String message) {
        decoratedMessage.setMessage(message.toUpperCase());
    }
    
}

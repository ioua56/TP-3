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
public class MessageDecorator implements IMessage {
    
    protected IMessage decoratedMessage;
    
    public MessageDecorator(IMessage decoratedMessage) {
        this.decoratedMessage = decoratedMessage;
    }
    
    @Override
    public String getTitle() {
        return decoratedMessage.getTitle();
    }
    
    @Override
    public String getSender() {
        return decoratedMessage.getSender();
    }
    
    @Override
    public String getMessage() {
        return decoratedMessage.getMessage();
    }
    
    @Override
    public void setTitle(String title) {
        decoratedMessage.setTitle(title);
    }
    
    @Override
    public void setSender(String sender) {
        decoratedMessage.setSender(sender);
    }
    
    @Override
    public void setMessage(String message) {
        decoratedMessage.setMessage(message);
    }

    @Override
    public String toString() {
        return decoratedMessage.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

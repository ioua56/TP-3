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
public class Anonyme extends MessageDecorator{
    
    public Anonyme(IMessage decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public void setSender(String sender) {
        super.setSender("Anonymous Sender"); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
}

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
public class Cryptage extends MessageDecorator{
    
    public Cryptage(IMessage decoratedMessage) {
        super(decoratedMessage);
    }
    
}

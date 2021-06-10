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
public abstract class Filtrage extends MessageDecorator{
    
    public Filtrage(IMessage decoratedMessage) {
        super(decoratedMessage);
    }
    
}

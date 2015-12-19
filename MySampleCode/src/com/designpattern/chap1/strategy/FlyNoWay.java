
package com.designpattern.chap1.strategy;

public class FlyNoWay implements FlyBehaviour
{
    
    @Override
    public void fly()
    {
       System.out.println("I cannot Fly");
        
    }
    
}


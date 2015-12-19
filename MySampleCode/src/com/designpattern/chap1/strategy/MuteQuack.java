
package com.designpattern.chap1.strategy;

public class MuteQuack implements QuackBehaviour 
{

    @Override
    public void quack()
    {
        System.out.println("<<Silence>>.");
        
    }
    
}




package com.designpattern.chap1.strategy;

public class Quack implements QuackBehaviour
{

    @Override
    public void quack()
    {
       System.out.println("Quacking.");
    }
    
}



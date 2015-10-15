
package com.test.java.general;

class myOverload {
    
    public void fun1(int i)
    {
        System.out.println("int");
    }
    
    public void fun1(Integer i)
    {
        System.out.println("Integer");
    }
}

public class Overloading
{ // first widening then auto boxing 
    public static void main(String[] args)
    {
        new myOverload().fun1(0);
    }
}




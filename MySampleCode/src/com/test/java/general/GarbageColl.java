
package com.test.java.general;


class myClass {
    
    private  int [] i = new int [100000];
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Memory Freed");
        super.finalize();
    }
    
}

public class GarbageColl
{
    
    public static void main(String[] args)
    {
        
        for(int i= 1; i<10000; i++)
        {
            testFun();
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                
            }
        }
    }

    private static void testFun()
    {
        myClass m = new myClass();
    }
}


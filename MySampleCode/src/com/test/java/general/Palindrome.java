package com.test.java.general;

public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("hi");
        System.out.println(isPalindrome("Madam, I'm Adam."));
    }
    
    public static boolean isPalindrome(String string)
    {
        
        boolean b = true;
        
        int endindex = string.length() - 1;
        String str = string.toUpperCase();
        
        for (int startindex = 0; startindex < str.length();)
        {
            char c1, c2;
            if (((str.charAt(startindex) >= 65) && str.charAt(startindex) <= 90))
            {
                c1 = str.charAt(startindex);
            }
            else
            {
                startindex++;
                continue;
            }
            
            if (((str.charAt(endindex) >= 65) && str.charAt(endindex) <= 90))
            {
                c2 = str.charAt(endindex);
            }
            else
            {
                endindex--;
                continue;
            }
            if (c1 != c2)
            {
                b = false;
                break;
            }
            else
            {
                startindex++;
                endindex--;
            }
            
            if (startindex > endindex)
            {
                break;
            }
        }
        
        return b;
    }
    
}

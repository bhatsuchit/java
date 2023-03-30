package org.example;

import org.apache.xerces.util.SynchronizedSymbolTable;

public class exceptionhandle {
    public static void main(String[] args) {
        System.out.println("SOME TASK BEFORE");
        try
        {
            int a=20;
            int b=0;
            System.out.println(a/b);

        }
        catch(Exception e)
        {
            System.out.println("Don't divide by 0");
        }
    }
}

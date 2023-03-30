package org.example;

public class Java05 {
    public static void main(String[] args) {
        int amt=550;
        int dc=0;
        if(amt<=100)
        {
            dc=40;
        }
        else if (amt>100 && amt<=500)
        {
            dc=20;
        }
        else
        {
            dc=5;
        }
        System.out.println(dc);
    }

}

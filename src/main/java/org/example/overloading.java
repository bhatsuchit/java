package org.example;

public class overloading {
    public static void main(String[] args) {
        overloading obj = new overloading();
        obj.sum(10,20,40);
    }
            void sum(int a,int b)
            {
                System.out.print(a+b);
            }

            void sum (int a,int b,int c)
            {
                System.out.println(a+b+c);
            }

}


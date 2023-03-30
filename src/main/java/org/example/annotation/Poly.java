package org.example.annotation;
class vehicle777
{
    void color()
    {
        System.out.println("Blue color");
    }
    void wheels()
    {
        System.out.println("I have 4 wheels");
    }

}
class car101 extends vehicle777
{
    void color()
    {
        System.out.println("Red color");
    }
    void capacity()
    {
        System.out.println("sitting capacity");
    }
}
public class Poly {
    public static void main(String[] args) {
        vehicle777 v= new car101();
        v.color();
        v.wheels();
    }
}

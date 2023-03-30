package org.example;
class Bank
{
    String name;
    private int PIN;
    public void setvalue(int p)
    {
        PIN=p;
    }
    public void getvalue()
    {
        System.out.println("PIN:" +PIN);
    }
}
public class java14 {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.name="SBI";
        b.setvalue(1902);
        b.getvalue();
    }

}
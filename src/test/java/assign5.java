public class assign5 {
    public static void main(String[] args) {
        int n1=0,n2=1,n3=0;
        for(int i=0;i<=5;i=i+1)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }


    }
}

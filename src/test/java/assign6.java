public class assign6 {
    public static void main(String[] args) {
        int i=1234;
        int rev = 0;
       while(i!=0)
        {
            int r= i % 10;
            rev=  rev*10+r;
            i= i/10;
        }
        System.out.println(rev);
    }
}

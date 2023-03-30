import java.lang.reflect.Array;
import java.util.Arrays;

public class swapping {
    public static void main(String[] args) {
        int [] a={30,60,40,50,10};
        int size=a.length;
        int temp=a[1];

        a[1]=a[size-1];

        a[size-1]=temp;
        {
            System.out.println(Arrays.toString(a));
        }
    }
}

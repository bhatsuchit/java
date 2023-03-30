public class assign7 {
    public static void main(String[] args) {
        int[] arr = {24,35,87,12,54};
        int max =arr[2];

        for(int i=1; i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];

            }
            System.out.println("MAXIMUM ELEMENT IN ARRAY" +max);
        }
    }
}

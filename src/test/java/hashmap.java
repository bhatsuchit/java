import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map= new HashMap<>();

        map.put(101,"JAVA");
        map.put(102,"Python");
        map.put(103,"C++");
        map.put(104,"Ruby");

        for(Map.Entry m: map.entrySet())
        {
            System.out.println(m);
        }

    }
}

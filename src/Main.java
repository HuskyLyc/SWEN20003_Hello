import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
            //定义一个map
            Map<String, Integer> map = new HashMap();
            map.put("1", 8);
            map.put("2", 12);
            map.put("3", 53);
            map.put("4", 33);
            map.put("5", 11);
            map.put("6", 3);
            map.put("7", 3);
            Collection<Integer> c = map.values();
            Object[] obj = c.toArray();
            Arrays.sort(obj);
            System.out.print(obj);
    }
}
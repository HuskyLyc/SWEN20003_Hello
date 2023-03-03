import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class getUsedToJava {
    public static void main(String[] args) {
            Map<String, Integer> map = new HashMap();
            map.put("1", 8);
            map.put("2", 12);
            map.put("3", 53);
            map.put("4", 33);
            map.put("5", 11);
            map.put("6", 3);
            map.put("7", 3);
            //get values of map
            Collection<Integer> c = map.values();
            Object[] obj = c.toArray();
            Arrays.sort(obj);

            for(Object i : obj){
                    System.out.print(i + "   ");
            }
    }
}
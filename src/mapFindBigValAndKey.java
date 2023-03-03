import java.util.*;

public class mapFindBigValAndKey {
    public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            map.put("1", 8);
            map.put("2", 12);
            map.put("3", 53);
            map.put("4", 33);
            map.put("5", 11);
            map.put("6", 3);
            map.put("7", 3);
            List<Map.Entry<String,Integer>> list = new ArrayList(map.entrySet());
            list.sort((o1, o2) -> (o1.getValue() - o2.getValue()));

            for(Object i : list){
                    System.out.print(i + "   ");
            }
    }
}
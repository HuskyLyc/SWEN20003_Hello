import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class mapFindBigVal{
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
            //Object[]“是定义了一个一维的对象，这个Object是任何对象的父类，也就是说可以转换成任何的类型。举例：
            //Object[] object = new Object[3] ；
            //object [0] = new String(“12312”);
            //object [1] = new String[] { “String1”, “String2” };
            //object [2] = new Date();
            //解释：也就是说Object类型之后可以给任意类型的值或者对象赋值给当前的object 对象，而不需要强制类型转换，方便操作
            Arrays.sort(obj);

            for(Object i : obj){
                    System.out.print(i + "   ");
            }
    }
}
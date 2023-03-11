import java.util.*;

public class 加减乘除 {
    public static void main(String[] args) {
        int x = 3, y = 5;
        List<Number> list = new ArrayList<>();
        //x + y,x - y,x * y,(x + 0.0) / (y + 0.0),x % y
        list.add(x + y);
        list.add(x - y);
        list.add(x * y);
        list.add((x + 0.0) / (y + 0.0));
        list.add(x % y);
        System.out.println(list);

        //System.out.println(x + y,x - y,x * y,(x + 0.0) / (y + 0.0),x % y);
    }
}
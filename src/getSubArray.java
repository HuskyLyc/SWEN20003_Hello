import java.util.ArrayList;
import java.util.List;

public class getSubArray{
    // 测试代码
    public static void main(String[] args) {
        int[] ints = {100, 200, 300};
        List<List<Integer>> allSubList = continuousSubList(ints);
        System.out.println("ints的所有连续子数组为：" + allSubList);
    }
    /**
     * 求arr的所有连续子数组
     */
    public static List<List<Integer>> continuousSubList(int[] arr) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (arr == null || arr.length < 1) {
            return resultList;
        }
        // 对于每个位置都求包含他本身在内的所有连续子数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // 从 i ~ j位置求得一个子数组
                List<Integer> subList = new ArrayList<>();
                resultList.add(subList);
                for (int k = i; k <= j; k++) {
                    subList.add(arr[k]);
                }
            }
        }
        // 返回最终结果
        return resultList;
    }

}
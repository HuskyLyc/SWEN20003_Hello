import java.util.*;
import java.lang.*;
public class LC697 {
    //      找到frequency最大的键值对 再判断有无重复最高频词
    //      找高频词的upperbound() - lower-bound()
    public static void main(String[] args){
        int[] nums1 = {1,2,2,3,1};
        int[] nums2 = {1,2,2,3,1,4,2};
         System.out.println("ShortestSubArrayLength1 = "+findShortestSubArray(nums1));
         System.out.println("ShortestSubArrayLength2 = "+findShortestSubArray(nums2));
    }
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> occur = new HashMap<>();
        for (int x : nums) {
            occur.put(x, occur.getOrDefault(x, 0) + 1);
        }
        occur.forEach((key, value) -> System.out.println(key + " -- " + value + "||"));
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(occur.entrySet());
        list.sort((o1, o2) -> (o2.getValue() - o1.getValue()));     //从大到小排序

        if(list.size() == 1) return (lastIndex(nums, list.get(0).getKey()) - Index(nums, list.get(0).getKey()) + 1);
        Map.Entry<Integer,Integer> et0 = list.get(0);
        Map.Entry<Integer,Integer> et1 = list.get(1);
        if(Objects.equals(et0.getValue(), et1.getValue())){
            // System.out.println("Equals occurs!");
            Integer x1 = et0.getKey();
            // System.out.println(x1 +" at:"+ arrFind.lastIndex(nums, x1) + "  " + arrFind.Index(nums, x1));
            Integer x2 = et1.getKey();
            // System.out.println(x2 +" at:"+ arrFind.lastIndex(nums, x2)+ "  " + arrFind.Index(nums, x2));
            int L1 = lastIndex(nums, x1) - Index(nums, x1) + 1;
            int L2 = lastIndex(nums, x2) - Index(nums, x2) + 1;
            // System.out.println("L1 = "+L1+" L2 = " + L2);
            return Math.min(L1, L2);
        }else{
            Integer x1 = et0.getKey();
            return lastIndex(nums, x1) - Index(nums, x1) + 1;
        }
    }
    public static int Index(int[] Arr,int key)
    {
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i]==key)
            {
//                System.out.print(key+"第一次出现的下标为：");
                return i;
            }
        }
        return 0;
    }
    public static int lastIndex(int[] Arr,int key)
    {
        for(int i=Arr.length-1;i>=0;i--)
        {
//            System.out.print(key+"最后一次出现的下标为：");
            if(Arr[i] == key) return i;

        }
        return 0;
    }
}


import java.util.*;

public class LC697 {
    //      找到frequency最大的键值对 再判断有无重复最高频词
//      找高频词的upperbound() - lower-bound()
    public static void main(String[] args){
        int[] nums1 = {1,2,2,3,1};
        int[] nums2 = {1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(nums1));
        System.out.println();
//        System.out.println(findShortestSubArray(nums2));
    }
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> occur = new HashMap<Integer, Integer>();
        for (int x : nums) {
            occur.put(x, occur.getOrDefault(x, 0) + 1);
        }
        occur.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " -- " + entry.getValue() + "||");
        });
        //checked occuer ok
//                1 -- 2||
//                2 -- 2||
//                3 -- 1||


        List<Map.Entry<Integer,Integer>> list = new ArrayList(occur.entrySet());
        list.sort((o1, o2) -> (o2.getValue() - o1.getValue()));     //从大到小排序
//            if(list.size() == 1) return
        Map.Entry<Integer,Integer> et0 = list.get(0);
        Map.Entry<Integer,Integer> et1 = list.get(1);
        if(et0.getValue() == et1.getValue()){
            System.out.println("Equals occurs!");

            Integer x1 = et0.getKey();
            System.out.println(x1 +"  "+ arrFind.lastIndex(nums, x1) + "  " + arrFind.Index(nums, x1));
            Integer x2 = et1.getKey();
            System.out.println(x2 +"  "+ arrFind.lastIndex(nums, x2)+ "  " + arrFind.Index(nums, x2));


            Integer L1 = arrFind.lastIndex(nums, x1) - arrFind.Index(nums, x1);
            Integer L2 = arrFind.lastIndex(nums, x2) - arrFind.Index(nums, x2);
            System.out.println("L1 = "+L1+" L2 = " + L2);

            return L1 > L2 ? L2 : L1;
        }else{
            Integer x1 = et0.getKey();
            Integer L1 = arrFind.lastIndex(nums, x1) - arrFind.Index(nums, x1);
            return L1;
        }
    }
}


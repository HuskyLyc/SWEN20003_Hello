//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class LC697 {
////      找到frequency最大的键值对 再判断有无重复最高频词
////      找高频词的upperbound() - lowerbound()
//    public int findShortestSubArray(int[] nums) {
//        Map<Integer, Integer> occur = new HashMap<Integer, Integer>();
//        for (int x : nums) {
//            occur.put(x, occur.getOrDefault(x, 0) + 1);
//            List<Map.Entry<Integer,Integer>> list = new ArrayList(occur.entrySet());
//            list.sort((o1, o2) -> (o1.getValue() - o2.getValue()));
////            if(list.size() == 1) return Array.upperbound
//            Map.Entry<Integer,Integer> et0 = list.get(0);
//            Map.Entry<Integer,Integer> et1 = list.get(1);
//            if(et0.getValue() == et1.getValue()){
//
//            }
//        }
//
//
//
//    }
//
//}

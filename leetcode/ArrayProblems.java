package leetcode;
import java.util.*;
public class ArrayProblems {
    public static void basic () {
        System.out.println("hello meow");
    }
    public static int[] twoSum(int[] nums, int target) {
        int solution[] = new int[2];
        HashMap<Integer, Integer> sumVals = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++) {
            sumVals.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++) {
            boolean containsKey = sumVals.containsKey(target-nums[i]);
            int index = containsKey ? sumVals.get(target-nums[i]) : -1;
            if(containsKey && index != i) {
                solution[0] = i;
                solution[1] = index;
            }
        }

        return solution;
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        HashMap<Integer, Integer> sumVals = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!sumVals.containsKey(nums[i])) {
                nums[count] = nums[i];
                count++;
            sumVals.put(nums[i], i);
            }
        }
        return sumVals.size();
    }

   public static int [] topKfreq(int[] nums, int k) {
       HashMap<Integer, Integer> hashy = new HashMap <Integer,Integer>();
       for (int i = 0; i < nums.length; i++) {
           boolean containsKey = hashy.containsKey(nums[i]);
           if (containsKey) {
              hashy.put(nums[i], hashy.get(nums[i]) +1) ;
           }else {
               hashy.put(nums[i], 1) ;
           }
       }
       List <Integer []> sort = new ArrayList<Integer []> ();
       for (Integer key: hashy.keySet()) {
           int val = hashy.get(key);
           Integer [] temp = {key, val};
           sort.add(temp);
       }
       Collections.sort(sort, (a,b) ->  b[1] - a[1]);
       int [] results = new int [k];
       int i = 0;
       for (Integer [] n : sort) {
           if (i == k) break;
           results[i++] = n[0];
       }
       return results;
   }
}

//package the directory's name of the file
package main;
import java.util.*;
import leetcode.ArrayProblems;
import leetcode.StringProblems;
public class TestSolutions {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,6,7};
        int k = 3;
        int [] twoSum = ArrayProblems.twoSum(nums, k);
        System.out.println("twoSum"+ " " + Arrays.toString(twoSum));

        // int [] topKFreq= ArrayProblems.topKfreq(nums, k);
        // ArrayProblems.basic();
        // System.out.println("topKFreq"+ " " + Arrays.toString(topKFreq));
        // int removeDuplicates = ArrayProblems.removeDuplicates(nums);
        // System.out.println("removeDuplicates" + " " +removeDuplicates);

        // int countSubstrings = StringProblems.countSubstrings("aaaa");
        // System.out.println("countSubstrings" + " " + countSubstrings);

    }
}

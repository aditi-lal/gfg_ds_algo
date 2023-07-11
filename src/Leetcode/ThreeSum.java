/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] numbers = new int[]{-1,0,1,2,-1,-4};

        System.out.println("****Naive Solution****");
        printList(naiveSolution(numbers));
        System.out.println("\n****Optimal Solution****");
        printList(optimalSolution(numbers));
    }

    public static List<List<Integer>> optimalSolution(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> sol = new HashSet<>();
       for(int i=0; i< nums.length;i++){
           int start = i+1;
           int end = nums.length-1;
           while(start<end){
               if(nums[start]+nums[end]>(0-nums[i])){
                   end--;
               }
               else if(nums[start]+nums[end]<(0-nums[i])){
                   start++;
               }
               else{
                   sol.add(List.of(nums[i],nums[start],nums[end]));
                   start++;
                   end--;
               }
           }
       }
        return new ArrayList<>(sol);
    }

    public static List<List<Integer>> naiveSolution(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> sol = new HashSet<>();
        for(int i = 0;i<nums.length-2;i++){
            for(int j =i+1;j<nums.length-1 && j!=i;j++){
                for(int k =j+1;k<nums.length && k!=i && k!=j;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        sol.add(List.of(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return new ArrayList<>(sol);
    }

    public static void printList (List<List<Integer>> arr) {
        for(List<Integer> data: arr){
            System.out.print("[ ");
            data.stream().forEach(x-> System.out.print(x+","));
            System.out.print("],");
        }
    }
}

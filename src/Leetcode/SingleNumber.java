/* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space. */

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums  = new int[]{4,1,2,1,2};
        System.out.println("Naive Solution "+ naiveSolution(nums));
        System.out.println("Optimal Solution "+ optimalSolution(nums));

    }

    public static int naiveSolution(int[] arr){
        int num=0;
        Map<Integer, Integer> dataMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(dataMap.containsKey(arr[i])){
                dataMap.put(arr[i],dataMap.get(arr[i])+1);
            }
            else{
                dataMap.put(arr[i],1);
            }

        }
        for(int i: dataMap.keySet()){
            if(dataMap.get(i)==1){
                num =i;
                break;
            }
        }
        return num;
    }

    /***using xor******/
    /**
     *
     a xor 0 = a
     a xor a = 0
     a xor b = b xor a
     xor all element will return only element with no pair(as pair one will get cancel)
     */
    public static int optimalSolution(int[] arr){
        int num=0;
        for(int i=0;i<arr.length;i++){
            num ^= arr[i];
        }
        return num;
    }
}


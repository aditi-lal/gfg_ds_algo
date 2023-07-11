/* Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.


 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,7,11,15};
        int target = 9;
        System.out.println("****Naive Solution****");
        Arrays.stream(naiveSolution(numbers, target)).forEach(x->System.out.print(x+" "));

        System.out.println("\n****Optimal Solution****");
        Arrays.stream(optimalSolution(numbers, target)).forEach(x->System.out.print(x+" "));


    }



    public static int[] naiveSolution(int[] arr, int target){
        int[] sol = new int[2];
        Map<Integer, Integer> mapData = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(mapData.containsKey(target-arr[i])){
                sol[0] = mapData.get(target-arr[i]);
                sol[1] = i+1;
                break;
            }else{
                mapData.put(arr[i], i+1);
            }


        }
        return sol;

    }

    public static int[] optimalSolution(int[] arr, int target){
        int[] sol = new int[2];
        int i=0; int j = arr.length-1;
        while(arr[i]+arr[j]!=target){
            if(arr[i]+arr[j]>target){
                j--;
            }
            if(arr[i]+arr[j]<target){
                i++;
            }
        }
        sol[0]= i+1;
        sol[1] = j+1;
        return sol;

    }
}

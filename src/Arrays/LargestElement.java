import  java.lang.*;

public class LargestElement {

    public static void main(String[] args) {
        int[] arr = new int[]{20,30,10,1,5, 32, 1};
        getLargestElement(arr);
    }

    private static void getLargestElement(int[] arr){
        int max = Integer.MIN_VALUE;
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                pos=i;
            }
        }
        System.out.println("Largest Element in array: "+max+" at position "+pos);
    }
}
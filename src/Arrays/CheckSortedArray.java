public class CheckSortedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{5,6,6,7,4};
        isArraySorted(arr);
    }

    private static void isArraySorted(int[] arr) {
        boolean flag=true;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[]{5,20,12,20,8, 9};
        getReverseArray(arr);
    }

    private static void getReverseArray(int[] arr) {
        int temp;
        for(int i=0;i<arr.length/2;i++){
            temp= arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for (int element:arr) {
            System.out.print(element+" ");
        }
    }


}

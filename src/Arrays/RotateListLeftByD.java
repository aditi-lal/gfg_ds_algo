public class RotateListLeftByD {
    public static void main(String[] args) {
        int d= 3;
        int[] arr = new int[]{5,20,12,20,8, 9};
        getRotatedListMethod1(arr.clone(),d);
        getRotatedListMethod2(arr.clone(),d);
    }







    private static void getRotatedListMethod1(int[] arr, int d) {
        System.out.println("******Method:1 ********");
        int j=0;
        int[] arr1=arr.clone();
        for(int i=d;i< arr.length;i++){
            arr[j]=arr[i];
            j++;
        }
        j=0;
        for(int i=arr1.length-d;i<arr1.length;i++){
            arr[i]=arr1[j];
            j++;
        }

        for (int element:arr
             ) {
            System.out.print(element+" ");
        }

    }

    /***************Reversal Algorithm*****************/
    private static void getRotatedListMethod2(int[] arr, int d) {

        reverseArray(arr,0,d-1);
        reverseArray(arr, d, arr.length-1);
        reverseArray(arr,0, arr.length-1);
        System.out.println("\n******Method:2 ********");
        for (int element: arr) {
            System.out.print(element+" ");
        }

    }

    private static void reverseArray(int[] arr, int start, int end){
        int temp;
        while(start<end){
            temp= arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

    }
}

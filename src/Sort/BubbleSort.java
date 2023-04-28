public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{7, 10, 4, 10, 6, 5, 2};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j] = temp;
                }

            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}

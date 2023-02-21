public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{5,20,12,20,8};
        getSecondLargestElement(arr);
    }

    private static void getSecondLargestElement(int[] arr) {
        int max=0;
        int secondLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[max]){
                secondLargest = max;
                max = i;

            }
            else if(arr[i]!=arr[max] ){
                if(secondLargest==-1 ||
                        arr[i]>arr[secondLargest]) {
                    secondLargest = i;
                }

            }


        }
        System.out.println("Second Largest Element in array: "+arr[secondLargest]+" at position "+secondLargest);
    }
}

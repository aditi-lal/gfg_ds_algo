public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{10,10,20,20,20,30, 40};
        removeDuplicateElements(arr);
    }

    private static void removeDuplicateElements(int[] arr) {
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                j+=1;
                arr[j] = arr[i];
            }
        }
        for (int element: arr
             ) {
            System.out.print(element+" ");
        }
        System.out.println("size of array +"+j+1);
    }
}

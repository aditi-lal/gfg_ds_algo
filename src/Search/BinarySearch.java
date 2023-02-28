public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 7, 10, 13, 15, 42};
        int element = 42;
        System.out.println("*****Iterative solution, index of "+element +" :"+
                getBinarySearchIterativeSoln(arr, element));
        System.out.println("*****Recursive solution, index of "+element +" :"+
                getBinarySearchRecursiveSoln(arr, element));
    }


    private static int getBinarySearchIterativeSoln(int[] arr, int element) {
        int mid;
        int low =0;
        int high= arr.length-1;
        while(low<=high){
            mid = (low+high)/2;
            if(element == arr[mid]){
                return mid;

            }
            else if (element<arr[mid]){
                    high = mid-1;

            }
            else{
                low= mid+1;
            }
        }
        return -1;

    }


    private static int getBinarySearchRecursiveSoln(int[] arr, int element) {
      int low= 0;
      int high =  arr.length;
        return getBinarySearch(arr, low, high, element);
    }

    private static int getBinarySearch(int[] arr, int low, int high, int element) {
        int mid = (low+high)/2;

        if(element==arr[mid]){
            return mid;
        }
        if(low>=high){
            return -1;
        }
        else if(element>arr[mid]){
            return getBinarySearch(arr, mid+1, high, element);
        }
        else {
            return getBinarySearch(arr, low, mid-1, element);
        }
    }

}

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = new int[]{7, 10, 4, 10, 6, 5, 2};
        int element = 3;
        findElementUsingLinearSearch(arr, element);
    }

    private static void findElementUsingLinearSearch(int[] arr, int element) {
        boolean flag=false;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==element){
                flag=true;
                System.out.println("Element found at index "+i);
                break;
            }
        }
        if(!flag){
            System.out.println("Element not found");
        }
    }
}

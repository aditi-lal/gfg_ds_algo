/***** Find max a[j]-a[i], such that j>i ************/

public class MaxDifference {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,10,6,4,8,1};
//        int[] arr = new int[]{7,9,5,6,3,2};
//        int[] arr = new int[]{10,20,30};
        findMaxDiffNaive(arr);
        findMaxDiffEfficient(arr);
    }
    
    /********Efficient- O(n)*****************/
    private static void findMaxDiffEfficient(int[] arr) {
        System.out.println("********Efficient Solution *********");
        int min_value = arr[0];
        int max=Integer.MIN_VALUE;
        int temp;
        for (int i = 1; i < arr.length; i++) {
                temp= arr[i]-min_value;
                if(temp>max){
                    max=temp;
                }
                if(arr[i]<min_value){
                    min_value=arr[i];
                }
            
        }
        System.out.println("Max Difference: "+max);
    }

    /********Naive- O(n2)*****************/
    private static void findMaxDiffNaive(int[] arr) {
        System.out.println("********Naive Solution *********");
        int max= Integer.MIN_VALUE;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j< arr.length;j++){
                temp =  arr[j]-arr[i];
                if(temp>max){
                    max=temp;
                }
            }
        }
        System.out.println("Max Difference: "+max);
    }
}

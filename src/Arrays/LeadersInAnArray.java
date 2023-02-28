//import java.util.Scanner;

public class LeadersInAnArray {
    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the length of array");
//        int n = scan.nextInt();
//        System.out.println("Enter the elements");
//        int[] arr= new int[n];
//        for (int i = 0; i < n ; i++) {
//                arr[i] = scan.nextInt();
//        }
        int[] arr = new int[]{7, 10, 4, 10,6, 5 ,2};
        findLeadersInAnArrayNaive(arr);
        findLeadersInAnArrayEfficient(arr);
    }



    /******************Naive - O(n2)*************/
    private static void findLeadersInAnArrayNaive(int[] arr){
        System.out.println("**********Method1********");
        for(int i =0; i<arr.length;i++){
            boolean isLeader= true;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]<=arr[j]){
                    isLeader= false;
                    break;
                }
            }
            if(isLeader){
                System.out.print(arr[i]+" ");
            }

        }
    }

    /******************Efficient - O(n)*************/
    private static void findLeadersInAnArrayEfficient(int[] arr) {
        System.out.println("\n**********Method2********");
        int curr_max = arr[arr.length-1];
        System.out.print(curr_max+" ");
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i]>curr_max){
                curr_max= arr[i];
                System.out.print(arr[i]+" ");
            }
        }
    }
}

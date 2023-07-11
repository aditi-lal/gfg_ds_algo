
/* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 */
//Q.121
public class Stock {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println("Naive Solution "+ naiveSoln(prices));
        System.out.println("Optimal Solution "+ optimumSoln(prices));
    }

    public static int naiveSoln(int[] arr){
        int maxProfit = 0;
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]- arr[i]> maxProfit){
                    maxProfit= arr[j]- arr[i];
                }
            }
        }
        return maxProfit;
    }


    public static int optimumSoln(int[] arr){
        int maxProfit = 0;
        int minSoFar = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]-minSoFar>maxProfit){
                maxProfit=arr[i]-minSoFar;
            }
            minSoFar = Math.min(arr[i], minSoFar);
        }
        return maxProfit;
    }
}

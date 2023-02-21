

public class MovesZerosToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,7,8,0,5,0};
        moveZerosToEndNaiveFunc(arr);
        moveZerosToEndNaiveEff(arr);
    }

    /***********************Naive*************************/
    private static void moveZerosToEndNaiveFunc(int[] arr) {
        System.out.println("***Naive\n");
        int temp;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i+1;j< arr.length;j++){
                    if(arr[j]!=0){
                        temp=arr[i];
                        arr[i]= arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
            }
        }
        for (int element:arr
             ) {
            System.out.print(element+" ");
        }
    }


    /***********************Efficient*************************/
    private static void moveZerosToEndNaiveEff(int[] arr) {
        System.out.println("\n***Efficient\n");
        int temp;
        int zeros=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               temp=arr[zeros];
               arr[zeros]= arr[i];
               arr[i]= temp;
               zeros++;
           }
        }
        for (int element:arr
        ) {
            System.out.print(element+" ");
        }
    }



}

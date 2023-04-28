public class FrequencyArray {
/***Frequency in sorted array **/
    public static void main(String[] args) {
        int[] arr = new int[]{10,10,10,25,30,30,30};
        getFrequencyEff(arr);
    }

    private static void getFrequencyEff(int[] arr) {
        System.out.println("******Efficient method******");
        int count=1;
        for (int i = 0; i < arr.length ; i++) {
            if(i< arr.length-1 && arr[i]==arr[i+1]){
                count++;
            }
            else{

                System.out.println(arr[i]+" "+count);
                count=1;
            }

        }
    }



}

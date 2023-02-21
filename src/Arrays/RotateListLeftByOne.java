public class RotateListLeftByOne {

    public static void main(String[] args) {
        int[] arr = new int[]{5,20,12,20,8};
        getRotatedListByOne(arr);
    }

    private static void getRotatedListByOne(int[] arr) {
        int lastElement = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]= arr[i];

        }
        arr[arr.length-1]=lastElement;
        for (int element:arr
             ) {
            System.out.print(element+" ");
        }
    }
}

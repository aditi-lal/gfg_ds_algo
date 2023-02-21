import java.util.Scanner;

public class TrailingZerosInFact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        Integer n = scan.nextInt();
        trailingZerosFactFunc(n);

    }
// Time complexity is theta(log n)
    private static void trailingZerosFactFunc(Integer n) {
        int zeros =0;
        for(int i=5;i<=n;i=i*5){
            zeros+=n/i;
        }
        System.out.println("TRailing zeroes in factorial of "+n+" is "+zeros);
    }
}

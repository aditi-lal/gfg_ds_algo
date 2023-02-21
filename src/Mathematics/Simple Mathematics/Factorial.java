import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        Integer n = scan.nextInt();
        iterativeFactorial(n);
        recursiveFactorial(n);


    }

    /*********************Iterative Solution *******************************/
    // Time complexity theta(n), auxilary space 0(1)
    private static void iterativeFactorial(Integer n) {
        long fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" using iterative method is "+fact);
    }

    /*********************Recursive Solution *******************************/


    // Time complexity theta(n), auxilary space 0(n)
    private static long fact(Integer n) {
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    private static void recursiveFactorial(Integer n) {
        System.out.println("Factorial of "+n+" using iterative method is "+fact(n));
    }


}

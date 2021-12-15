import  java.util.*;
import  java.lang.*;

public class CountDigits  {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        Integer n = scan.nextInt();
        System.out.println("Count of digits: ");
        System.out.println("Iterative solution: "+getDigitCountIteration(n));
        System.out.println("Recursive solution: "+getDigitCountRecursion(n));
        System.out.println("Logarithmic solution: "+getDigitCountLog(n));

    }
    //Iterative solution
    public static int getDigitCountIteration(Integer n){
        int count =0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }

    //Recursive solution
    public static int getDigitCountRecursion(Integer n){
        if(n==0)
            return 0;
        else{
            return 1+ getDigitCountIteration(n/10);
        }
    }

    //Logarithmic solution- base 10 log of n
    public static int getDigitCountLog(Integer n){
       return (int)Math.floor(Math.log10(n))+1;
    }
}

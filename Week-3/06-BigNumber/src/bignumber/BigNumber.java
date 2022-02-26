package bignumber;
import java.util.Scanner;
import java.math.BigInteger;

public class BigNumber {

    public static void main(String[] args) {
        BigInteger a,b, sum, multiply;
        
        // membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        // input user
        a = input.nextBigInteger();
        b = input.nextBigInteger();
        
        // algoritma
        sum = a.add(b);
        multiply = a.multiply(b);
        System.out.println(sum);
        System.out.println(multiply);
    }
    
}

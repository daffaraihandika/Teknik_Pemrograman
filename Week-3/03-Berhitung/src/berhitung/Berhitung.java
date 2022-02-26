package berhitung;
import java.util.Scanner;

public class Berhitung {

    static int tambah(int a, int b){
        return a + b; 
    }
    
    static int kurang(int a, int b){
        return a-b;
    }
    
    static int kali(int a, int b){
        return a*b;
    }
    
    static int bagi(int a, int b){
        return a/b;
    }
    
    static int modulus(int a, int b){
        return a%b;
    }
    public static void main(String[] args) {
        // deklarasi variabel
        int a, b;
        char operator;
        
        // membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        // input user
        a = input.nextInt();
        operator = input.next().charAt(0);
        b = input.nextInt();
        
        // algoritma
        if(a >= 1 && a <= 100000){
            if(b >= 1 && b <= 100000){
                if(operator == '+'){
                    tambah(a, b);
                    System.out.println(String.format("%d", tambah(a,b)));
                }else if(operator == '-'){
                    kurang(a,b);
                    System.out.println(String.format("%d", kurang(a,b)));
                }else if(operator == '*'){
                    kali(a,b);
                    System.out.println(String.format("%d", kali(a,b)));
                }else if(operator == '/'){
                    bagi(a,b);
                    System.out.println(String.format("%d", bagi(a,b)));
                }else if(operator == '%'){
                    modulus(a,b);
                    System.out.println(String.format("%d", modulus(a,b)));
                }
            }
        }
    }
    
}

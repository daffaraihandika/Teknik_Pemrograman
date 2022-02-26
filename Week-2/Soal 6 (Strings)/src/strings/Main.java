package strings;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // membuat scanner
        Scanner scan = new Scanner(System.in);
        
        // deklarasi variabel
        String a, b, output;
        int jumlahStr;
        
        // user menginputkan string
        a = scan.next();
        b = scan.next();
        
        // jumlah huruf dari kedua string
        jumlahStr = a.length() + b.length();
        System.out.println(jumlahStr);
        
        // memeriksa untuk lexicographically
        if(a.compareTo(b) > 0){
            System.out.println("Yes");
        }else if(b.compareTo(a) > 0){
            System.out.println("No");
        }else{
            System.out.println("Are Equals");
        }
        
        // melakukan gabungan terhadap kedua string dan membuat huruf awal dari kedua string tersebut menjadi kapital
        output = a.substring(0,1).toUpperCase() + a.substring(1) + " " + b.substring(0,1).toUpperCase() + b.substring(1);
        System.out.println(output);
    }
    
}

package input.output;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        // deklarasi variabel
        String str;

        // membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        // input string
        str = input.nextLine();

        // memisahkan string berdasarkan token
        String[] kata = str.split("[ !,?._'@]");

        // menampilkan jumlah token dalam string 
        System.out.println(kata.length);
        
        // menampilkan string yang telah dipisahkan token
        for(String text:kata){
            System.out.println(text);
        }
    }
    
}

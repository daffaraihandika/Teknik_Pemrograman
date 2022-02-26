package datatypes;
import java.util.Scanner;

public class DataTypes {

 public static void main(String[] args) {
        // TODO code application logic here
        // deklarasi variabel
        int banyakAngka;
        
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // input user
        banyakAngka = keyboard.nextInt();
        
        // deklarasi variabel untuk menampung angka
        String[] angka = new String [banyakAngka];
        
        for (int i = 0; i < banyakAngka; i++) {
            angka[i] = keyboard.next();
        }
        
        for (int i = 0; i < banyakAngka; i++){
            long longMin = -9223372036854775808L;
            long longMax = 9223372036854775807L;
            try{
                long parseLong = Long.parseLong(angka[i]);
                System.out.println(parseLong + " can be fitted in:");
                if(parseLong >= longMin && parseLong <= longMax){
                    System.out.println("long");
                    if(parseLong >= -2147483648 && parseLong <= 2147483647){
                         System.out.println("int");
                        if(parseLong >= -32768 && parseLong <= 32767){
                            System.out.println("short");
                        }
                    }
                }
                // ini bisa masuk long
            }catch(Exception e){
                //ini ga bisa masuk manapun
                System.out.println(angka[i] + " can't be fitted anywhere");
                }
        }

    }
    
}

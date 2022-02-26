package buka.tutup.jalan;
import java.util.Arrays;
import java.util.Scanner;



public class BukaTutupJalan {

    public static void main(String[] args) {
        // deklarasi variabel
        int[] plat = new int[4];
        String str;
        long platGabungan;
        
        // membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        // input user
        for(int i = 0; i < plat.length; i++){
            plat[i] = input.nextInt();
        }
        
        // convert array to string
        str = Arrays.toString(plat).replaceAll("\\[|\\]|,|\\s", "");
        
        // convert string to long
        platGabungan = Long.parseLong(str);
        
        // cek kondisi
        if((platGabungan - 999999) % 5 == 0){
            System.out.println("berhenti");
        }else{
            System.out.println("jalan");
        }
        
    }
    
}

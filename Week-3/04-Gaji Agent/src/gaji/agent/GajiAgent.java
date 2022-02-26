package gaji.agent;
import java.util.Scanner;

public class GajiAgent {

    public static void main(String[] args) {
        // deklarasi variabel
        int gajiPokok = 500000,
            totalGaji,
            totalPenjualan,
            totalHarga,
            denda;
        int bonusPenjualan;
        final int hargaItem = 50000;
        
        // membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        // input user
        totalPenjualan = input.nextInt();
        
        // algoritma
        if(totalPenjualan > 80){
            totalHarga = totalPenjualan * hargaItem;    
            bonusPenjualan = (int) ((int) totalHarga * 0.35); 
            totalGaji = gajiPokok + bonusPenjualan;
            System.out.println("Total gaji : " + totalGaji);
        }else if(totalPenjualan >= 40){
            totalHarga = totalPenjualan * hargaItem;    
            bonusPenjualan = (int) ((int) totalHarga * 0.25); 
            totalGaji = gajiPokok + bonusPenjualan;
            System.out.println("Total gaji : " + totalGaji);
        }else if(totalPenjualan < 40 && totalPenjualan >= 15){
            totalHarga = totalPenjualan * hargaItem;    
            bonusPenjualan = (int) ((int) totalHarga * 0.10); 
            totalGaji = gajiPokok + bonusPenjualan;
            System.out.println("Total gaji : " + totalGaji);
        }else if(totalPenjualan < 15){
            denda = (int) (((15 - totalPenjualan) * hargaItem) * 0.15);
            gajiPokok = (int) (gajiPokok - denda); 
            totalGaji = gajiPokok;
            System.out.println("Total gaji : " + totalGaji);
        }
    }
    
}

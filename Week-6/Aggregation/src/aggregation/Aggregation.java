package aggregation;

public class Aggregation {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Daffa", "211524050");
        Kendaraan kendaraan = new Kendaraan("Mobil", "Alphard", "D 2034 ABY");
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNama("Juned");
        mhs2.setNim("211524047");
        Kendaraan kendaraan2 = new Kendaraan();        
        kendaraan2.setJenis("Mobil");
        kendaraan2.setNama("Hijet 1000");
        kendaraan2.setPlatNomor("D 2312 YZ");

        Mahasiswa mhs3 = new Mahasiswa("Ferdi", "211524058");
        Kendaraan kendaraan3 = new Kendaraan("Motor", "Beat", "Z 6969 HK");
        
        System.out.println("======================================================================================");
        System.out.println(mhs.getNama() + " dengan NIM " + mhs.getNim() + " mempunyai " + kendaraan.getJenis() + " bernama " + kendaraan.getNama() + " dengan plat " + kendaraan.getPlatNomor());
        System.out.println(mhs2.getNama() + " dengan NIM " + mhs2.getNim() + " mempunyai " + kendaraan2.getJenis() + " bernama " + kendaraan2.getNama() + " dengan plat " + kendaraan2.getPlatNomor());
        System.out.println(mhs3.getNama() + " dengan NIM " + mhs3.getNim() + " mempunyai " + kendaraan3.getJenis() + " bernama " + kendaraan3.getNama() + " dengan plat " + kendaraan3.getPlatNomor());
        System.out.println("======================================================================================");
    }
    
}

package dependence;

public class Laptop{
    private String nama;
    private int harga;
    private String warna;

    
    Laptop(String nama, int harga, String warna){
        this.nama = nama;
        this.harga = harga;
        this.warna = warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void jualLaptop(){
        System.out.print("Laptop dijual ");
    }
    
}
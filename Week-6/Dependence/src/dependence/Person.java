package dependence;

public class Person{
    private String nama;
    
    Person(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void display(Laptop l){
        System.out.println("Laptop " + getNama());
        System.out.println("Nama : " + l.getNama());
        System.out.println("Warna : " + l.getWarna());
        System.out.println("Harga : " + l.getHarga());
        System.out.println();
    }
    
    public void jualLaptop(Laptop l){
        l.jualLaptop();
        System.out.println("oleh " + getNama());
    }
}
package aggregation;

public class Kendaraan{
    private String jenis;
    private String nama;
    private String platNomor;

    // constructor
    Kendaraan(){
        this.jenis = "";
        this.nama = " ";
        this.platNomor = " ";
    }

    Kendaraan(String jenis, String nama, String platNomor){
        this.jenis = jenis;
        this.nama = nama;
        this.platNomor = platNomor;
    }
    
    // method
    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }    
    
    public String getJenis() {
        return jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}

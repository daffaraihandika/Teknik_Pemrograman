package composition;

public class Motor{
    private String name;
    private int tahun;
    private SparePart sparePart;
    
    // constructor
    Motor(String nama, int tahun, SparePart sparePart){
        this.name = nama;
        this.tahun = tahun;
        this.sparePart = sparePart;
    }
    
    Motor(){
        this.name = " ";
        this.tahun = 0;
    }

    public String getName() {
        return name;
    }

    public int getTahun() {
        return tahun;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public String toString(){
        return String.format("Nama : %s\nTahun : %d\n%s\n", this.name, this.tahun, this.sparePart);
    }
}
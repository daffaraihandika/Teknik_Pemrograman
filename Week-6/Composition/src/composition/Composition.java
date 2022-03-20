package composition;

public class Composition {

    public static void main(String[] args) {
        System.out.println("SPESIFIKASI MOTOR");
        System.out.println("==================");
        SparePart sparePart = new SparePart("Swallow", "Akrapovic", "RCB");
        Motor motor = new Motor("Beat", 1990, sparePart);
        System.out.println(motor);
    
        SparePart sparePart2 = new SparePart("Maxis", "Pro Liner", "Kaleng");
        Motor motor2 = new Motor("ZX-25R", 2021, sparePart2);
        System.out.println(motor2);
    }
    
}

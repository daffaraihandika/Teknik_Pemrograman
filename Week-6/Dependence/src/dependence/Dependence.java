package dependence;

public class Dependence {

    public static void main(String[] args) {
        Person person = new Person("Daffa");
        Laptop laptop = new Laptop("Asus Zenbook", 21000000, "Hitam");
        person.display(laptop);
        

        Person person2 = new Person("Bang Juned");
        Laptop laptop2 = new Laptop("Lenovo Ideapad", 14300000, "Putih");
        person2.display(laptop2);
        person2.jualLaptop(laptop2);
        System.out.println();
    }
    
}

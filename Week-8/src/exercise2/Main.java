package exercise2;

public class Main {
    public static void main(String[] args) {
        Shape obj1 = new Shape("red", false);
        System.out.println(obj1);
        
        Circle obj2 = new Circle();
        System.out.println(obj2);
        
        Rectangle obj3 = new Rectangle(20, 30);
        System.out.println(obj3);
        
        Square obj4 = new Square(10, "blue", false);
        System.out.println(obj4);
        obj4.setSide(20);
        System.out.println(obj4);
    }
}

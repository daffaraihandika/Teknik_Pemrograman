package input.output2;

import java.util.Scanner;

class ProgrammingLanguage{
    String name;
    int number;

    void printOutput(String name, int number){
        this.name = name;
        this.number = number;
        System.out.println(String.format("%s\t\t%03d", this.name, this.number));
    }
}

public class InputOutput2 {

    public static void main(String[] args) {
        ProgrammingLanguage var1 = new ProgrammingLanguage();
        ProgrammingLanguage var2 = new ProgrammingLanguage();
        ProgrammingLanguage var3 = new ProgrammingLanguage();
        
        // membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        // input user baris pertama
        var1.name = input.next();
        var1.number = input.nextInt();

        // input user baris kedua
        var2.name = input.next();
        var2.number = input.nextInt();

        // input user baris ketiga
        var3.name = input.next();
        var3.number = input.nextInt();
        
        // menampilkan output
        System.out.println("=======================");
        var1.printOutput(var1.name, var1.number);
        var2.printOutput(var2.name, var2.number);
        var3.printOutput(var3.name, var3.number);
        System.out.println("=======================");
    }
    
}

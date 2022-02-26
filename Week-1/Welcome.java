/*
*this program display a greeting for the reader
*@version 1.30 2022-02-03
*author : Muhammad Daffa Raihandika
*/

public class Welcome{
	public static void main (String[] args){
        String greeting = "welcome to core java";
        System.out.println(greeting);
        for(int i=0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();
    }
}
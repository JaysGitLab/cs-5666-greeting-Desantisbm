import java.util.Scanner;
import java.io.File;

public class HelloName
{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[]args)
    {
        print();
    }  
    public static void print(){
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("-Me");
        String capName = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println("Hello, " + capName + "!\n -Hal");
    }
}

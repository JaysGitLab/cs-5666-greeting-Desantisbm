import java.util.Scanner;

public class HelloCapName
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        String capName = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println("Hello, " + capName + "!");
    
    }  
}

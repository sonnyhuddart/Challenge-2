package challenge.pkg2;
import java.util.Scanner;
public class Challenge2 {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Name a country?");
        String answer = myScanner.nextLine();
        System.out.println("What is the population of " + answer + "?");
        String num = myScanner.nextLine();
        System.out.println("The population of " + answer + " is " + num);
        
        
    }
    
}

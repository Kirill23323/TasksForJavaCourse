package PasswordGenerator;
import java.util.Scanner;

public class PasswordGeneratorMain {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        PasswordGenerator passGen = new PasswordGenerator();
        passGen.Start(scanner);
        scanner.close();
        
    }
    
}

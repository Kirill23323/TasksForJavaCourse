package CurrencyConverter;
import java.util.Scanner;

public class CurrencyConverterMain {
    
    public static void main(String[] args){
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);
        converter.Start(scanner);
        scanner.close();
    }
    
}

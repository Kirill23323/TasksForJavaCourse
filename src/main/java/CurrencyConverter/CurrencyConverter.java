package CurrencyConverter;
import java.util.Scanner;


public class CurrencyConverter {
    
    private static final double USD_TO_EUR = 0.85;
    private static final double EUR_TO_USD = 1.18;
    private static final double USD_TO_RUB = 90.0;
    private static final double RUB_TO_USD = 0.011;
    private static final double EUR_TO_RUB = 105.0;
    private static final double RUB_TO_EUR = 0.0095;
    private static final double USD_TO_CNY = 7.3; 
    private static final double CNY_TO_USD = 0.137; 
    private static final double USD_TO_JPY = 150.0; 
    private static final double JPY_TO_USD = 0.0067; 
    private static final double EUR_TO_CNY = 8.6; 
    private static final double CNY_TO_EUR = 0.116; 
    private static final double EUR_TO_JPY = 175.0; 
    private static final double JPY_TO_EUR = 0.0057; 
    private static final double RUB_TO_CNY = 0.081; 
    private static final double CNY_TO_RUB = 12.3; 
    private static final double RUB_TO_JPY = 1.67; 
    private static final double JPY_TO_RUB = 0.60;
    
    
    private boolean isWorking;
    
    
    
    private void Convert(Scanner scanner){
        
        System.out.println("Введите исходную валюту USD, EUR, RUB, CNY, JPY");
        String fromCurrency = scanner.nextLine().toUpperCase();
        System.out.println("Введите целевую валюту USD, EUR, RUB, CNY, JPY:");
        String toCurrency = scanner.nextLine().toUpperCase();
        double exchangeRate = 0;
        switch (fromCurrency + "_" + toCurrency) {
            case "USD_EUR":
                exchangeRate = USD_TO_EUR;
                break;
            case "EUR_USD":
                exchangeRate = EUR_TO_USD;
                break;
            case "USD_RUB":
                exchangeRate = USD_TO_RUB;
                break;
            case "RUB_USD":
                exchangeRate = RUB_TO_USD;
                break;
            case "EUR_RUB":
                exchangeRate = EUR_TO_RUB;
                break;
            case "RUB_EUR":
                exchangeRate = RUB_TO_EUR;
                break;
            case "USD_CNY":
                exchangeRate = USD_TO_CNY;
                break;
            case "CNY_USD":
                exchangeRate = CNY_TO_USD;
                break;
            case "USD_JPY":
                exchangeRate = USD_TO_JPY;
                break;
            case "JPY_USD":
                exchangeRate = JPY_TO_USD;
                break;
            case "EUR_CNY":
                exchangeRate = EUR_TO_CNY;
                break;
            case "CNY_EUR":
                exchangeRate = CNY_TO_EUR;
                break;
            case "EUR_JPY":
                exchangeRate = EUR_TO_JPY;
                break;
            case "JPY_EUR":
                exchangeRate = JPY_TO_EUR;
                break;
            case "RUB_CNY":
                exchangeRate = RUB_TO_CNY;
                break;
            case "CNY_RUB":
                exchangeRate = CNY_TO_RUB;
                break;
            case "RUB_JPY":
                exchangeRate = RUB_TO_JPY;
                break;
            case "JPY_RUB":
                exchangeRate = JPY_TO_RUB;
                break;
            default:
                System.out.println("Неверная комбинация валют.");
                return;
        }
        double amount = 0;
        while (true) {
            System.out.println("Введите сумму для конвертации:");
            try {
                amount = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите числовое значение.");
                scanner.nextLine(); 
            }
        }
        System.out.printf("%s -> %s = %.2f %s%n", fromCurrency, toCurrency, amount * exchangeRate, toCurrency);
        
         while (true) {
                System.out.println("Завершить программу? Да/Нет");
                String response = scanner.nextLine().trim().toUpperCase();
                if (response.equals("ДА")) {
                    isWorking = false;
                    break;
                } else if (response.equals("НЕТ")) {
                    break; 
                } else {
                    System.out.println("Некорректный ввод.");
                }
            }
    }
    
    public void Start(Scanner scanner){
        System.out.println("Добро пожаловать в конвертер валют!");
        System.out.println("Доступные валюты: USD, EUR, RUB, CNY, JPY");
        while(isWorking)
            Convert(scanner);
    }
    
    public CurrencyConverter(){
        this.isWorking = true; 
    }
    
}

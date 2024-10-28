package PasswordGenerator;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    
    private static final String[] chars = {"abcdefghijklmnopqrstuvwxyz","ABCDEFGJKLMNPRSTUVWXYZ",
        "0123456789","^$?!@#%&"};
    
    private int passLen;
    private boolean isWorking;
    
    public PasswordGenerator(){
        this.passLen = 0;
        this.isWorking = true;
    }
    
    private void Generate(Scanner scanner){
        Random random = new Random();
        while(true){
            System.out.println("Введите длину пароля (от 8 до 12 символов)");
            try{
                 passLen = scanner.nextInt();
                scanner.nextLine(); 
                if(passLen < 8 || passLen > 12){
                    System.out.println("Некорректная длина пароля!");
                }
                else{
                    break;
                }
            }catch(Exception e){
                 System.out.println("Некорректный ввод. Пожалуйста, введите числовое значение.");
                 scanner.nextLine();
            }
        }
        String password;
        do {
            StringBuilder passwordBuilder = new StringBuilder(passLen);
            for (int i = 0; i < passLen; i++) {
                String charCategory = chars[random.nextInt(chars.length)];
                int position = random.nextInt(charCategory.length());
                passwordBuilder.append(charCategory.charAt(position));
            }
            password = passwordBuilder.toString();
        } while (!PasswordCheck(password));
        System.out.println("Ваш пароль: " + password);
        
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
    
    private boolean PasswordCheck(String password){
        for(String charCategory: chars){
            boolean containsCharFromCategory = false;
            for(char ch : charCategory.toCharArray()){
                if(password.indexOf(ch) >= 0){
                    containsCharFromCategory = true;
                    break;
                }
            }
            if(!containsCharFromCategory){
                return false;
            }
        }
        return true;
    }
    
    public void Start(Scanner scanner){
        
        System.out.println("Добро пожаловать в генератор паролей!");
        while(isWorking){
            Generate(scanner);
        }
        
    }
}
    

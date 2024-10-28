package GallowsGame;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class GallowsGame {
    
    private String wordToGuess;
    private char[] guessedWord;
    private final String[] vocabulary = {"COMPUTER","PROCESSOR","TV","PHONE","GPU","INTERNET"};
    private int attempts;
    private Set<Character> guessedLetters;
    
    private boolean isWorking;
    
    private void GameBegin(Scanner scanner){
        Init();
        while(!GameOver()&&!GameWon()){
            ShowGuessedWord();
            System.out.println("Текущее количество попыток: " + attempts);
            System.out.println("Введите букву:");
            char guessLetter = Character.toUpperCase(scanner.nextLine().charAt(0));
           
            if(guessedLetters.contains(guessLetter)){
                System.out.println("Вы уже вводили такую букву");
                continue;
            }
            boolean letterGuessed = false;
            
            for(int i = 0;i < wordToGuess.length();i++){
                if(guessLetter == wordToGuess.charAt(i)){
                    guessedWord[i] = guessLetter;
                    letterGuessed = true;
                }
            }
            guessedLetters.add(guessLetter);
            if(letterGuessed == true){
                 System.out.println("Вы угадали букву!");
            }
            else{
                System.out.println("Вы не угадали букву!");
                attempts--;
            }
            
        }
        
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
    private boolean GameOver(){
        if(attempts <= 0){
            System.out.println("Попытки закончились, вы проиграли!");
            System.out.println("Загаданное слово было: " + wordToGuess);
            return true;
        }
        return false;
    }
    
    private boolean GameWon(){
        if(wordToGuess.equals(new String(guessedWord))){
            System.out.println("Вы угадали слово!");
            System.out.println("Загаданное слово было: " + wordToGuess);
            return true;
        }
        return false;
    }
    
    private void ShowGuessedWord(){
        for (char c : guessedWord) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    
    private void Init(){
        this.attempts = 5;
        this.wordToGuess = vocabulary[(int)(Math.random() * vocabulary.length)];
        this.guessedWord = new char[wordToGuess.length()];
        this.guessedLetters = new HashSet<>();
        for(int i = 0;i < wordToGuess.length();i++){
            guessedWord[i] = '*';
        }
        
    }
    
    
    public void Start(Scanner scanner){
        System.out.println("Добро пожаловать в игру Виселица!");
        while(isWorking){
            GameBegin(scanner);
        }
        
    }
    
    public GallowsGame(){
        this.isWorking = true;
    }
    
}

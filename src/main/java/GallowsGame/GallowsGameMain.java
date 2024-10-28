package GallowsGame;
import java.util.Scanner;

public class GallowsGameMain {
    
    public static void main(String[] args){
        GallowsGame game = new GallowsGame();
        Scanner scanner = new Scanner(System.in);
        game.Start(scanner);
        scanner.close();
    }
    
}

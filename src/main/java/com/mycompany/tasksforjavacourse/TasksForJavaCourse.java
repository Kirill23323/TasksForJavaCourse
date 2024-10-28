package com.mycompany.tasksforjavacourse;
import CurrencyConverter.CurrencyConverter;
import GallowsGame.GallowsGame;
import PasswordGenerator.PasswordGenerator;
import java.util.Scanner;

public class TasksForJavaCourse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GallowsGame game = new GallowsGame();
        PasswordGenerator gen = new PasswordGenerator();
        CurrencyConverter conv = new CurrencyConverter();
        
        game.Start(scanner);
        conv.Start(scanner);
        gen.Start(scanner);
        scanner.close();
    }
}

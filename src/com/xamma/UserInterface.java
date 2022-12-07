package com.xamma;

import java.util.Scanner;

public class UserInterface {

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice now");
        try {
            String input = scanner.nextLine();
            return Integer.parseInt(input);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void greetUser() {
        System.out.println("Hello and Welcome to Rock-Paper-Scissors! Time to play.");
        System.out.println("-----------");
        System.out.println("Please insert your choice: ");
        System.out.println("(1) Rock");
        System.out.println("(2) Paper");
        System.out.println("(3) Scissor");
        System.out.println("-----------");
        System.out.println("Enter '4' to quit the game");
        System.out.println("\n");
    }

    public static void printTie() {
        System.out.println("Tie! Noone wins, try again. \n");
    }

    public static void printWin() {
        System.out.println("You won! Congratulations. \n");
    }

    public static void printLose() {
        System.out.println("You lose! \n");
    }

    public static void printGoodbye() {
        System.out.println("Goodbye! Hope you enjoyed! \n");
    }

    public static void printInvalidOption() {
        System.out.println("Please choose a valid option. \n");
    }

    public static void getAnswer(int humanChoice, int computerChoice) {
        if (humanChoice == ChoiceOptions.ROCK) {
            System.out.println("You chose ROCK.");
        }
        else if (humanChoice == ChoiceOptions.PAPER) {
            System.out.println("You chose PAPER.");
        }
        else if (humanChoice == ChoiceOptions.SCISSORS) {
            System.out.println("You chose SCISSORS.");
        }
        else {
            printInvalidOption();
        }

        if (computerChoice == ChoiceOptions.ROCK) {
            System.out.println("Computer chose ROCK.");
        }
        else if (computerChoice == ChoiceOptions.PAPER) {
            System.out.println("Computer chose PAPER.");
        }
        else if (computerChoice == ChoiceOptions.SCISSORS) {
            System.out.println("Computer chose SCISSORS");
        }
        else {
            printInvalidOption();
        }
    }
}

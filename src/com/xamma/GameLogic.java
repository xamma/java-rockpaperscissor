package com.xamma;

import java.util.Random;

public class GameLogic {

    public static int getComputerChoice() {
        Random randomNumb = new Random();
        int computerChoice = randomNumb.nextInt(3);
        computerChoice += 1;

        return computerChoice;
    }

    public static void calculateWinner(int humanChoice, int computerChoice) {
        if (humanChoice == computerChoice) {
            UserInterface.getAnswer(humanChoice, computerChoice);
            UserInterface.printTie();
        }
        else if (humanChoice == ChoiceOptions.ROCK && computerChoice == ChoiceOptions.PAPER) {
            UserInterface.getAnswer(humanChoice, computerChoice);
            UserInterface.printLose();
        }
        else if (humanChoice == ChoiceOptions.ROCK && computerChoice == ChoiceOptions.SCISSORS) {
            UserInterface.getAnswer(humanChoice, computerChoice);
            UserInterface.printWin();
        }
        else if (humanChoice == ChoiceOptions.PAPER && computerChoice == ChoiceOptions.SCISSORS) {
            UserInterface.getAnswer(humanChoice, computerChoice);
            UserInterface.printLose();
        }
        else if (humanChoice == ChoiceOptions.PAPER && computerChoice == ChoiceOptions.ROCK) {
            UserInterface.getAnswer(humanChoice, computerChoice);
            UserInterface.printWin();
        }
        else if (humanChoice == ChoiceOptions.SCISSORS && computerChoice == ChoiceOptions.ROCK) {
            UserInterface.getAnswer(humanChoice, computerChoice);
            UserInterface.printLose();
        }
        else if (humanChoice == ChoiceOptions.SCISSORS && computerChoice == ChoiceOptions.PAPER) {
            UserInterface.getAnswer(humanChoice, computerChoice);
            UserInterface.printWin();
        }
        else if (humanChoice == 4) {
            UserInterface.printGoodbye();
        }
        else {
            System.out.println("Something went wrong !");
        }
    }

    public static void execute() {
        boolean playAgain = true;
        while (playAgain) {
            UserInterface.greetUser();
            int userInput = UserInterface.getUserInput();
            if (userInput == 4) {
                playAgain = false;
            }
            int computerChoice = GameLogic.getComputerChoice();
            GameLogic.calculateWinner(userInput, computerChoice);
        }
    }
}

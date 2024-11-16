package org.example;

import java.util.Scanner;

public class FantasyAnswer {
    private int answerNumber;

    public int getAnswerNumber() {
        return answerNumber;
    }


    public FantasyAnswer(int answerNumber) {
        this.answerNumber = answerNumber;
    }

    private boolean checkInput(String input){
        if (input.length() > 4){
            return false;
        }
        if (input.matches("[abcd]+")){
            return true;
        } else {
            return false;
        }
    }

    public int getAnswer(){
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int points = 0;
        if (getAnswerNumber() == 1){
            while (!answer.equals("a") && !answer.equals("b") && !answer.equals("c")) {
                try {
                    answer = scanner.nextLine().toLowerCase();
                    if (!answer.equals("a") && !answer.equals("b") && !answer.equals("c")) {
                        System.out.println("Not one from options. Try again!");
                    }
                } catch (Exception e) {
                    System.out.println("Wrong input. Try again!");
                }
            }
            if(answer.equals("a")){
                System.out.println("Correct!");
                points++;
            } else {
                System.out.println("Wrong answer!");
            }
        }

        if (getAnswerNumber() == 2){
            while (answer.isEmpty() || !checkInput(answer) || answer.contains("aa") || answer.contains("bb") || answer.contains("cc")) {
                try {
                    answer = scanner.nextLine().toLowerCase();
                    if (answer.isEmpty() || !checkInput(answer) || answer.contains("aa") || answer.contains("bb") || answer.contains("cc"))  {
                        System.out.println("Not right option. Try again!");
                    }
                } catch (Exception e) {
                    System.out.println("Wrong input. Try again!");
                }
            }
            if (answer.length() > 3){
                System.out.println("Too many choices. Not a single point for this question.");
            } else if (answer.length() == 3 && !answer.contains("d")) {
                points += 3;
            } else if (answer.length() == 3 && answer.contains("d")) {
                points += 2;
            } else if (answer.length() == 2 && !answer.contains("d")) {
                points += 2;
            } else if (answer.length() == 2 && answer.contains("d")) {
                points += 1;
            } else if (answer.length() == 1) {
                System.out.println("Not enough choices. Not a single point for this question. Do not be a coward.");
            }
        }

        if (getAnswerNumber() == 3){
            while (answer.isEmpty()) {
                try {
                    answer = scanner.nextLine().toLowerCase();
                } catch (Exception e) {
                    System.out.println("Wrong input. Try again!");
                }
            }
            if(answer.equals("a game of thrones") || answer.equals("game of thrones")){
                points += 5;
                System.out.println("Correct, full points for this answer.");
            } else {
                System.out.println("Sorry, but i do not take your stuttering.");
            }
        }

        return points;
    }
}

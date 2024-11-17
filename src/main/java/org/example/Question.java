package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question {
    private String description;
    private String question;
    private List<Answer> answers;
    private boolean Typo;

    public boolean isTypo() {
        return Typo;
    }

    public Question(String description, String question, boolean Typo) {
        this.description = description;
        this.question = question;
        this.Typo = Typo;
        this.answers = new ArrayList<>();
    }
    public void addAnswers(Answer answer){
        this.answers.add(answer);
    }

    public void printDescription(){
        System.out.println(description);
        System.out.println("=========================");
        System.out.println(question);
        for(Answer answer: answers){
            answer.printAnswer();
        }
    }

    public int checkAnswer(){
        String input;
        int points = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine().toLowerCase();
        for(Answer answer: answers){
            if (input.contains(answer.getInput()) && answer.isCorrect()){
                points++;
            }
        }
        return points;
    }

    public int checkTypoAnswer(){
        String input;
        int points = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine().toLowerCase();
        for(Answer answer: answers){
            if (input.equals(answer.getInput()) && answer.isCorrect()){
                points += 5;
            }
        }
        return points;
    }
}

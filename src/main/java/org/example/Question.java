package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question {
    private String description;
    private String question;
    private List<Answer> answers;
    private QuestionType questionType;
    private int pointsForQuestion;

    public int getPointsForQuestion() {
        return pointsForQuestion;
    }

    public Question(String description, String question, QuestionType questionType) {
        this.description = description;
        this.question = question;
        this.questionType = questionType;
        this.answers = new ArrayList<>();
    }
    public void addAnswers(Answer answer){
        this.answers.add(answer);
        if (answer.isCorrect()){
            if (this.questionType == QuestionType.TYPED_ANSWER){
                this.pointsForQuestion = 5;
            } else {
                this.pointsForQuestion++;
            }
        }
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
        switch (questionType) {
            case SINGLE_ANSWER, MULTIPLE_ANSWERS:
                for (Answer answer : answers) {
                    if (input.contains(answer.getOption()) && answer.isCorrect()) {
                        points++;
                    }
                }
                break;
            case TYPED_ANSWER:
                for(Answer answer: answers){
                    if (input.equals(answer.getOption()) && answer.isCorrect()){
                        points += 5;
                    }
                }
                break;
        }
        return points;
    }
}

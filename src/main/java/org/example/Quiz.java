package org.example;

import java.util.*;

public class Quiz {
    private String name;
    private List<FantasyQuestion> listOfQuestions;
    private List<FantasyAnswer> listOfAnswers;
    private int points;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Quiz(String name) {
        this.name = name;
        this.listOfQuestions = new ArrayList<>();
        this.listOfAnswers = new ArrayList<>();

    }

    public void addQuestionAndAnswer(FantasyQuestion fantasyQuestion, FantasyAnswer fantasyAnswer){
        this.listOfQuestions.add(fantasyQuestion);
        this.listOfAnswers.add(fantasyAnswer);
    }

    public void runQuiz(){
        points = 0;
        if (!listOfQuestions.isEmpty() && !listOfAnswers.isEmpty()) {
            System.out.println("Greetings traveler, welcome to " + this.name + " quiz!");
            System.out.println("=========================");
            for (int i = 0; i < listOfQuestions.size(); i++){
                listOfQuestions.get(i).printQuestion();
                setPoints(points += listOfAnswers.get(i).getAnswer());
            }
            System.out.println("You got " + getPoints() +" from 9 points.");
        } else {
            System.out.println("I do not have any questions.");
        }
    }
}

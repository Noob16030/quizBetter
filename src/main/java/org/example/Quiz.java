package org.example;

import java.util.*;

public class Quiz {
    private String name;
    private List<Question> listOfQuestions;
    private int points;
    private int maxPoints;

    public int getPoints() {
        return points;
    }

    public Quiz(String name) {
        this.name = name;
        this.listOfQuestions = new ArrayList<>();
    }

    public void addQuestion(Question question){
        this.listOfQuestions.add(question);
        this.maxPoints += question.getPointsForQuestion();
    }

    public void runQuiz(){
        points = 0;
        if (!listOfQuestions.isEmpty()) {
            System.out.println("Greetings traveler, welcome to " + this.name + " quiz!");
            System.out.println("=========================");
            for (int i = 0; i < listOfQuestions.size(); i++){
                listOfQuestions.get(i).printDescription();
                this.points += listOfQuestions.get(i).checkAnswer();
            }
            System.out.println("You got " + getPoints() +" from " + this.maxPoints + " points.");
        } else {
            System.out.println("I do not have any questions.");
        }
    }
}

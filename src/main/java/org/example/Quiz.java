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

    public void setPoints(int points) {
        this.points = points;
    }

    public Quiz(String name, int maxPoints) {
        this.name = name;
        this.maxPoints = maxPoints;
        this.listOfQuestions = new ArrayList<>();
    }

    public void addQuestion(Question question){
        this.listOfQuestions.add(question);
    }

    public void runQuiz(){
        points = 0;
        if (!listOfQuestions.isEmpty()) {
            System.out.println("Greetings traveler, welcome to " + this.name + " quiz!");
            System.out.println("=========================");
            for (int i = 0; i < listOfQuestions.size(); i++){
                listOfQuestions.get(i).printDescription();
                if (listOfQuestions.get(i).isTypo()){
                    points += listOfQuestions.get(i).checkTypoAnswer();
                } else {
                    points += listOfQuestions.get(i).checkAnswer();
                }
            }
            System.out.println("You got " + getPoints() +" from " + maxPoints + " points.");
        } else {
            System.out.println("I do not have any questions.");
        }
    }
}

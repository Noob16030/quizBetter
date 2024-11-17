package org.example;

public class Answer {
    private String input;
    private String description;
    private boolean correct;
    private boolean hideText;

    public boolean isCorrect() {
        return correct;
    }

    public Answer(String input, String description, boolean correct, boolean hideText) {
        this.input = input;
        this.description = description;
        this.correct = correct;
        this.hideText = hideText;
    }

    public void printAnswer(){
        if (!hideText) {
            System.out.println(input + ". " + description);
        } else {
            System.out.println("Type your answer: ");
        }
    }

    public String getInput() {
        return input;
    }
}

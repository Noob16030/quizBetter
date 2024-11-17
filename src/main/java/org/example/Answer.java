package org.example;

public class Answer {
    private String option;
    private String description;
    private boolean correct;
    private boolean hideText;

    public boolean isCorrect() {
        return correct;
    }

    public Answer(String option, String description, boolean correct, boolean hideText) {
        this.option = option;
        this.description = description;
        this.correct = correct;
        this.hideText = hideText;
    }

    public void printAnswer(){
        if (!hideText) {
            System.out.println(option + ". " + description);
        } else {
            System.out.println("Type your answer: ");
        }
    }

    public String getOption() {
        return option;
    }
}

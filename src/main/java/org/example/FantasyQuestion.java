package org.example;

public class FantasyQuestion {
    private int questionNumber;

    public int getQuestionNumber() {
        return questionNumber;
    }



    public FantasyQuestion(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public void printQuestion(){
        if (getQuestionNumber() == 1){
            System.out.println("Please enter one letter with correct answer.");
            System.out.println("=========================");
            System.out.println("Finish the sentence: Hobits are *** *** dwarfs.");
            System.out.println("a. smaller than");
            System.out.println("b. taller than");
            System.out.println("c. same as");

        }

        if (getQuestionNumber() == 2){
            System.out.println("This question have multiple correct answers. For every correct choice is 1 point, so you can take more points in this round.");
            System.out.println("=========================");
            System.out.println("Which signs can Witcher (especially Geralt of Rivia) use?");
            System.out.println("a. Aard");
            System.out.println("b. Quen");
            System.out.println("c. Yrden");
            System.out.println("d. Srpen");
        }

        if (getQuestionNumber() == 3){
            System.out.println("Please enter whole words for correct answer. For this round you can take 5 points.");
            System.out.println("=========================");
            System.out.println("Name of first novel from A Song of Ice and Fire?");
        }
    }



}

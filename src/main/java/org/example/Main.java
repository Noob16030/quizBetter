package org.example;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz("fantasy", 9);
        Question question1 = new Question("Please enter one letter with correct answer.", "Finish the sentence: Hobits are *** *** dwarfs.", false);
        Answer answer1n1 = new Answer("a", "smaller than", true, false);
        Answer answer1n2 = new Answer("b", "taller than", false, false);
        Answer answer1n3 = new Answer("c", "same as", false, false);

        question1.addAnswers(answer1n1);
        question1.addAnswers(answer1n2);
        question1.addAnswers(answer1n3);

        Question question2 = new Question("This question have multiple correct answers. For every correct choice is 1 point, so you can take more points in this round.",
                "Which signs can Witcher (especially Geralt of Rivia) use?", false);
        Answer answer2n1 = new Answer("a", "Aard", true, false);
        Answer answer2n2 = new Answer("b", "Quen", true, false);
        Answer answer2n3 = new Answer("c","Yrden", true, false);
        Answer answer2n4 = new Answer("d","Srpen", false, false);

        question2.addAnswers(answer2n1);
        question2.addAnswers(answer2n2);
        question2.addAnswers(answer2n3);
        question2.addAnswers(answer2n4);

        Question question3 = new Question("Please enter whole words for correct answer. For this round you can take 5 points.",
                "What was name of famous elf archer from Lord Of The Rings trilogy?", true);
        Answer answer3n1 = new Answer("legolas", "", true, true);
        question3.addAnswers(answer3n1);

        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);

        quiz.runQuiz();

    }
}
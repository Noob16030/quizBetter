package org.example;

public class Main {
    public static void main(String[] args) {
        FantasyQuestion question1 = new FantasyQuestion(1);
        FantasyQuestion question2 = new FantasyQuestion(2);
        FantasyQuestion question3 = new FantasyQuestion(3);

        FantasyAnswer answer1 = new FantasyAnswer(1);
        FantasyAnswer answer2 = new FantasyAnswer(2);
        FantasyAnswer answer3 = new FantasyAnswer(3);

        Quiz quiz = new Quiz("fantasy");
        quiz.addQuestionAndAnswer(question1, answer1);
        quiz.addQuestionAndAnswer(question2, answer2);
        quiz.addQuestionAndAnswer(question3, answer3);

        quiz.runQuiz();
    }
}
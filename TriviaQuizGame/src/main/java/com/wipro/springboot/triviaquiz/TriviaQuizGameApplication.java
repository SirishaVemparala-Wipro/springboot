package com.wipro.springboot.triviaquiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class TriviaQuizGameApplication implements CommandLineRunner {

    @Autowired
    private QuizRepository quizRepository;

    public static void main(String[] args) {
        SpringApplication.run(TriviaQuizGameApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Dummy Data Insertion (Only for testing purpose)
        quizRepository.save(new Quiz(1L, "What is the capital of France?", "Berlin", "Paris", "Rome", "B"));
        quizRepository.save(new Quiz(2L, "Who developed the theory of relativity?", "Isaac Newton", "Albert Einstein", "Galileo", "B"));
        quizRepository.save(new Quiz(3L, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "B"));

        // Start the game
        startQuizGame();
    }

    // Method to run the quiz game in the console
    private void startQuizGame() {
        Scanner scanner = new Scanner(System.in);
        List<Quiz> quizzes = quizRepository.findAll(); // Retrieve all quiz questions from the database
        int score = 0;

        System.out.println("Welcome to the Trivia Quiz Game!\n");

        // Loop through each quiz question
        for (Quiz quiz : quizzes) {
            System.out.println(quiz.getQuestion());
            System.out.println("A) " + quiz.getOptionA());
            System.out.println("B) " + quiz.getOptionB());
            System.out.println("C) " + quiz.getOptionC());

            System.out.print("Your answer: ");
            String answer = scanner.nextLine().toUpperCase();

            if (answer.equals(quiz.getCorrectAnswer())) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + quiz.getCorrectAnswer() + "\n");
            }
        }

        System.out.println("Your final score is: " + score + "/" + quizzes.size());
    }
}

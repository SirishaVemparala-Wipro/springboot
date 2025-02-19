package com.wipro.springboot.triviaquiz;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Quiz {

    @Id
    private Long id;
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String correctAnswer;

    
    public Quiz() {
    }

    public Quiz(Long id, String question, String optionA, String optionB, String optionC, String correctAnswer) {
        this.id = id;
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.correctAnswer = correctAnswer;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Quiz{id=" + id + ", question='" + question + "', options=[A: " + optionA + ", B: " + optionB + ", C: " + optionC + "], correctAnswer='" + correctAnswer + "'}";
    }
}

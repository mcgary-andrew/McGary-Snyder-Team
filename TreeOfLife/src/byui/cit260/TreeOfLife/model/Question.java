/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;

/**
 *
 * @author Andrew
 */
public class Question implements Serializable{
    private String question;
    private String answerLevelQuestion;
    private String possibleAnswers;

    public String getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(String possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerLevelQuestion() {
        return answerLevelQuestion;
    }

    public void setAnswerLevelQuestion(String answerLevelQuestion) {
        this.answerLevelQuestion = answerLevelQuestion;
    }    
}

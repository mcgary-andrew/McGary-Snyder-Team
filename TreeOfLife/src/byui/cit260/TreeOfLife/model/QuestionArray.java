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
public class QuestionArray implements Serializable{
    
    private static Question[][] locQuestArray;
    private Scene scene;
    private static String[][] questionArray;
    private static Location[][] location;
    int currentXLocation;
    int currentYLocation;
    private Question currentQuestion;

    public Question getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(Question currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    public static Location[][] getLocation() {
        return location;
    }

    public static void setLocation(Location[][] location) {
        QuestionArray.location = location;
    }

    public static Question[][] getLocQuestArray() {
        return locQuestArray;
    }

    public static void setLocQuestArray(Question[][] locQuestArray) {
        QuestionArray.locQuestArray = locQuestArray;
    }

    public static String[][] getQuestionArray() {
        return questionArray;
    }

    public static void setQuestionArray(String[][] questionArray) {
        QuestionArray.questionArray = questionArray;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    

    public QuestionArray() {
        questionArray = new String[3][25];
        this.createLocationQuestionArray();
        currentXLocation = 0;
        currentYLocation = 0;
        this.updateCurrentLocation();
    }

    public void updateCurrentLocation(){
        currentQuestion = locQuestArray[currentXLocation][currentYLocation];
    }
    
    public Question getNextLocationQuestion() {
        
        this.updateCurrentLocation();
        return currentQuestion;
    }
    
    public enum QuestionType {
        faith,
        knowledge,
        obedience,
    }
    
    private Question[][] createLocationQuestionArray() {
         locQuestArray = new Question[3][25];
         
        Question locQuest1 = new Question();
        locQuest1.setQuestion("How many commandments has the Lord given without a way prepared to accomplish them?");
        locQuest1.setPossibleAnswers("\nA" + " - None"
                + "\nB" + " - Over 100"
                + "\nC" + " - No way to tell");
        locQuest1.setAnswerLevelQuestion("A");
        locQuest1.setAttributeAmount(3, 1, 1);
        locQuestArray[QuestionType.faith.ordinal()][0] = locQuest1;
        
        Question locQuest2 = new Question();
        locQuest2.setQuestion("Adam fell that men might be, and men are that they might have ______. (Fill in the blank)");
        locQuest2.setPossibleAnswers("\nA" + " - Money"
                + "\nB" + " - Joy"
                + "\nC" + " - Friends");
        locQuest2.setAnswerLevelQuestion("B");
        locQuest2.setAttributeAmount(0, 0, 5);
        locQuestArray[QuestionType.obedience.ordinal()][1] = locQuest2;
        
        Question locQuest3 = new Question();
        locQuest3.setQuestion("People are free to choose liberty and _____ or captivity and ______. (Fill in the blanks)");
        locQuest3.setPossibleAnswers("\nA" + " - Eternal Life, Death"
                + "\nB" + " - Freedom, Bondage"
                + "\nC" + " - Equality, Restriction");
        locQuest3.setAnswerLevelQuestion("A");
        locQuest3.setAttributeAmount(1, 4, 0);
        locQuestArray[QuestionType.knowledge.ordinal()][2] = locQuest3;
        
        Question locQuest4 = new Question();
        locQuest4.setQuestion("When is learning and wisdom foolishness?");
        locQuest4.setPossibleAnswers("\nA" + " - When you forget to study"
                + "\nB" + " - When it's a subject you don't like"
                + "\nC" + " - When you don't listen to God");
        locQuest4.setAnswerLevelQuestion("C");
        locQuest4.setAttributeAmount(2, 1, 2);
        locQuestArray[QuestionType.knowledge.ordinal()][3] = locQuest4;
         
         Question locQuest5 = new Question();
        locQuest5.setQuestion("What are we saved by?");
        locQuest5.setPossibleAnswers("\nA" + " - Grace"
                + "\nB" + " - Works"
                + "\nC" + " - Grace, after all we can do");
        locQuest5.setAnswerLevelQuestion("C");
        locQuest5.setAttributeAmount(1, 1, 3);
        locQuestArray[QuestionType.obedience.ordinal()][4] = locQuest5;
        
         Question locQuest6 = new Question();
        locQuest6.setQuestion("Eat, drink, and be merry, for tomorrow we die.  God says that...");
        locQuest6.setPossibleAnswers("\nA" + " - This is false, vain, and foolish"
                + "\nB" + " - He will beat us with a few stripes"
                + "\nC" + " - This is just fine");
        locQuest6.setAnswerLevelQuestion("A");
        locQuest6.setAttributeAmount(2, 2, 1);
        locQuestArray[QuestionType.obedience.ordinal()][5] = locQuest6;
        
         Question locQuest7 = new Question();
        locQuest7.setQuestion("We need steadfast faith in Christ, hope, and a love of God and all men. How long do we have to keep this up for?");
        locQuest7.setPossibleAnswers("\nA" + " - Until we join the church"
                + "\nB" + " - Until the end"
                + "\nC" + " - Only on Sundays");
        locQuest7.setAnswerLevelQuestion("B");
        locQuest7.setAttributeAmount(2, 2, 1);
        locQuestArray[QuestionType.obedience.ordinal()][6] = locQuest7;
        
        Question locQuest8 = new Question();
        locQuest8.setQuestion("The words of Christ will tell ____ all things...(to) do. (Fill in the blank)");
        locQuest8.setPossibleAnswers("\nA" + " - Sinners"
                + "\nB" + " - You"
                + "\nC" + " - Everyone else");
        locQuest8.setAnswerLevelQuestion("B");
        locQuest8.setAttributeAmount(1, 0, 4);
        locQuestArray[QuestionType.knowledge.ordinal()][7] = locQuest8;
        
        Question locQuest9 = new Question();
        locQuest9.setQuestion("What is the first thing we should do before performing anything for the Lord?");
        locQuest9.setPossibleAnswers("\nA" + " - Pray"
                + "\nB" + " - Read Scriptures"
                + "\nC" + " - Go to church");
        locQuest9.setAnswerLevelQuestion("A");
        locQuest9.setAttributeAmount(3, 2, 0);
        locQuestArray[QuestionType.faith.ordinal()][8] = locQuest9;
        
        Question locQuest10 = new Question();
        locQuest10.setQuestion("What is one way you can serve God?");
        locQuest10.setPossibleAnswers("\nA" + " - Pray all day"
                + "\nB" + " - Write in a journal"
                + "\nC" + " - Serve Others");
        locQuest10.setAnswerLevelQuestion("C");
        locQuest10.setAttributeAmount(1, 3, 1);
        locQuestArray[QuestionType.obedience.ordinal()][9] = locQuest10;
        
        Question locQuest11 = new Question();
        locQuest11.setQuestion("Who should we become like if we want to become a saint?");
        locQuest11.setPossibleAnswers("\nA" + " - Little kids"
                + "\nB" + " - Your parents"
                + "\nC" + " - The Prophet");
        locQuest11.setAnswerLevelQuestion("A");
        locQuest11.setAttributeAmount(2, 3, 0);
        locQuestArray[QuestionType.obedience.ordinal()][10] = locQuest11;
        
        Question locQuest12 = new Question();
        locQuest12.setQuestion("How do we protect ourselves from all the various ways of committing sin?");
        locQuest12.setPossibleAnswers("\nA" + " - Keep a list of commandments close by"
                + "\nB" + " - Stay out of the world as much as possible"
                + "\nC" + " - Watch yourself");
        locQuest12.setAnswerLevelQuestion("C");
        locQuest12.setAttributeAmount(0, 3, 2);
        locQuestArray[QuestionType.obedience.ordinal()][11] = locQuest12;
        
        Question locQuest13 = new Question();
        locQuest13.setQuestion("Why did Jesus suffer for us?");
        locQuest13.setPossibleAnswers("\nA" + " - To become famous"
                + "\nB" + " - To have mercy and help us get out of sin"
                + "\nC" + " - To protect only a chosen few");
        locQuest13.setAnswerLevelQuestion("B");
        locQuest13.setAttributeAmount(2, 1, 2);
        locQuestArray[QuestionType.knowledge.ordinal()][12] = locQuest13;
        
        Question locQuest14 = new Question();
        locQuest14.setQuestion("Faith is to hope for things which are not seen, which are _____. (Fill in the blank)");
        locQuest14.setPossibleAnswers("\nA" + " - True"
                + "\nB" + " - Hard to understand"
                + "\nC" + " - Beliefs");
        locQuest14.setAnswerLevelQuestion("A"); 
        locQuest14.setAttributeAmount(5, 0, 0);
        locQuestArray[QuestionType.faith.ordinal()][13] = locQuest14;
        
        Question locQuest15 = new Question();
        locQuest15.setQuestion("When is the best time to learn to keep the commandments?");
        locQuest15.setPossibleAnswers("\nA" + " - When we get older and closer to death"
                + "\nB" + " - When others make us"
                + "\nC" + " - In our youth");
        locQuest15.setAnswerLevelQuestion("C");
        locQuest15.setAttributeAmount(0, 5, 0);
        locQuestArray[QuestionType.obedience.ordinal()][14] = locQuest15;
        
        Question locQuest16 = new Question();
        locQuest16.setQuestion("What should people do who are struggling with lust?");
        locQuest16.setPossibleAnswers("\nA" + " - Give up"
                + "\nB" + " - Cross themselves"
                + "\nC" + " - Read more scriptures");
        locQuest16.setAnswerLevelQuestion("B");
        locQuest16.setAttributeAmount(4, 0, 1);
        locQuestArray[QuestionType.faith.ordinal()][15] = locQuest16;
        
        Question locQuest17 = new Question();
        locQuest17.setQuestion("Wickedness never was ____. (Fill in the blank)");
        locQuest17.setPossibleAnswers("\nA" + " - Happiness"
                + "\nB" + " - Very hard to fall into"
                + "\nC" + " - The best way to go");
        locQuest17.setAnswerLevelQuestion("A");
        locQuest17.setAttributeAmount(1, 3, 1);
        locQuestArray[QuestionType.obedience.ordinal()][16] = locQuest17;
        
        Question locQuest18 = new Question();
        locQuest18.setQuestion("Where should we build our foundation?");
        locQuest18.setPossibleAnswers("\nA" + " - In the sand"
                + "\nB" + " - Wherever is easiest"
                + "\nC" + " - On a rock");
        locQuest18.setAnswerLevelQuestion("C");
        locQuest18.setAttributeAmount(3, 2, 0);
        locQuestArray[QuestionType.faith.ordinal()][17] = locQuest18;
        
        Question locQuest19 = new Question();
        locQuest19.setQuestion("We should be as perfect as _____. (Fill in the blank)");
        locQuest19.setPossibleAnswers("\nA" + " - Everyone else"
                + "\nB" + " - We can be"
                + "\nC" + " - Jesus and Heavenly Father");
        locQuest19.setAnswerLevelQuestion("C");
        locQuest19.setAttributeAmount(1, 2, 2);
        locQuestArray[QuestionType.obedience.ordinal()][18] = locQuest19;
        
        Question locQuest20 = new Question();
        locQuest20.setQuestion("Who is it most important that we pray for to be blessed?");
        locQuest20.setPossibleAnswers("\nA" + " - Our families"
                + "\nB" + " - Our friends"
                + "\nC" + " - Other church members");
        locQuest20.setAnswerLevelQuestion("A");
        locQuest20.setAttributeAmount(2, 0, 3);
        locQuestArray[QuestionType.knowledge.ordinal()][19] = locQuest20;
        
        Question locQuest21 = new Question();
        locQuest21.setQuestion("When do we gain our testimony of a gospel principle?");
        locQuest21.setPossibleAnswers("\nA" + " - When we study about it a lot"
                + "\nB" + " - After the trial of our faith"
                + "\nC" + " - After bearing lots of testimony");
        locQuest21.setAnswerLevelQuestion("B");
        locQuest21.setAttributeAmount(3, 0, 2);
        locQuestArray[QuestionType.faith.ordinal()][20] = locQuest21;
        
        Question locQuest22 = new Question();
        locQuest22.setQuestion("Why do we have to have weaknesses?");
        locQuest22.setPossibleAnswers("\nA" + " - Because people are never perfect"
                + "\nB" + " - So we can be humble and become stronger"
                + "\nC" + " - That's just the way life is");
        locQuest22.setAnswerLevelQuestion("B");
        locQuest22.setAttributeAmount(4, 1, 0);
        locQuestArray[QuestionType.faith.ordinal()][21] = locQuest22;
        
        Question locQuest23 = new Question();
        locQuest23.setQuestion("What should we be hoping for?");
        locQuest23.setPossibleAnswers("\nA" + " - Lots of money"
                + "\nB" + " - Lots of friends"
                + "\nC" + " - The Atonement and Eternal Life");
        locQuest23.setAnswerLevelQuestion("C");
        locQuest23.setAttributeAmount(2, 1, 2);
        locQuestArray[QuestionType.knowledge.ordinal()][22] = locQuest23;
        
        Question locQuest24 = new Question();
        locQuest24.setQuestion("Charity is _____. (Fill in the blank)");
        locQuest24.setPossibleAnswers("\nA" + " - Giving money to the poor"
                + "\nB" + " - Giving up something"
                + "\nC" + " - The pure love of Christ");
        locQuest24.setAnswerLevelQuestion("C");
        locQuest24.setAttributeAmount(0, 2, 3);
        locQuestArray[QuestionType.knowledge.ordinal()][23] = locQuest24;
        
        Question locQuest25 = new Question();
        locQuest25.setQuestion("By _______ ye may know the truth of all things. (Fill in the blank)");
        locQuest25.setPossibleAnswers("\nA" + " - Studying on your own"
                + "\nB" + " - The power of the Holy Ghost"
                + "\nC" + " - Reading lots of Scripture");
        locQuest25.setAnswerLevelQuestion("B");
        locQuest25.setAttributeAmount(2, 2, 1);
        locQuestArray[QuestionType.faith.ordinal()][24] = locQuest25;
        

        return locQuestArray;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.model;

/**
 *
 * @author Andrew
 */
public class QuestionArray {
    
    private static Question[][] locQuestArray;
    

    public QuestionArray() {
    }
    public enum QuestionType {
        faith,
        knowledge,
        obedience,
    }
    
    private Question[][] createLocationQuestionArray() {
         locQuestArray = new Question[4][21];
         
        Question locQuest1 = new Question();
        locQuest1.setQuestion(" ");
        locQuest1.setPossibleAnswers(" ");
        locQuest1.setAnswerLevelQuestion("");
        locQuestArray[QuestionType.faith.ordinal()][0] = locQuest1;
        
        Question locQuest2 = new Question();
        locQuest2.setQuestion("");
        locQuest2.setPossibleAnswers(" ");
        locQuest2.setAnswerLevelQuestion(""); 
        locQuestArray[QuestionType.faith.ordinal()][1] = locQuest2;
        
        Question locQuest3 = new Question();
        locQuest3.setQuestion(" ");
        locQuest3.setPossibleAnswers(" ");
        locQuest3.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][2] = locQuest3;
        
        Question locQuest4 = new Question();
        locQuest4.setQuestion(" ");
        locQuest4.setPossibleAnswers(" ");
        locQuest4.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][3] = locQuest4;
         
         Question locQuest5 = new Question();
        locQuest5.setQuestion(" ");
        locQuest5.setPossibleAnswers(" ");
        locQuest5.setAnswerLevelQuestion(" ");
        locQuestArray[QuestionType.faith.ordinal()][4] = locQuest5;
        
         Question locQuest6 = new Question();
        locQuest6.setQuestion(" ");
        locQuest6.setPossibleAnswers(" ");
        locQuest6.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][5] = locQuest6;
        
         Question locQuest7 = new Question();
        locQuest7.setQuestion(" ");
        locQuest7.setPossibleAnswers(" ");
        locQuest7.setAnswerLevelQuestion(""); 
        locQuestArray[QuestionType.faith.ordinal()][6] = locQuest7;
        
        Question locQuest8 = new Question();
        locQuest8.setQuestion(" ");
        locQuest8.setPossibleAnswers(" ");
        locQuest8.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][7] = locQuest8;
        
        Question locQuest9 = new Question();
        locQuest9.setQuestion(" ");
        locQuest9.setPossibleAnswers(" ");
        locQuest9.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][8] = locQuest9;
        
        Question locQuest10 = new Question();
        locQuest10.setQuestion(" ");
        locQuest10.setPossibleAnswers(" ");
        locQuest10.setAnswerLevelQuestion(""); 
        locQuestArray[QuestionType.faith.ordinal()][9] = locQuest10;
        
        Question locQuest11 = new Question();
        locQuest11.setQuestion(" ");
        locQuest11.setPossibleAnswers(" ");
        locQuest11.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][10] = locQuest11;
        
        Question locQuest12 = new Question();
        locQuest12.setQuestion(" ");
        locQuest12.setPossibleAnswers(" ");
        locQuest12.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][11] = locQuest12;
        
        Question locQuest13 = new Question();
        locQuest13.setQuestion(" ");
        locQuest13.setPossibleAnswers(" ");
        locQuest13.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][12] = locQuest13;
        
        Question locQuest14 = new Question();
        locQuest14.setQuestion(" ");
        locQuest14.setPossibleAnswers(" ");
        locQuest14.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][13] = locQuest14;
        
        Question locQuest15 = new Question();
        locQuest15.setQuestion(" ");
        locQuest15.setPossibleAnswers(" ");
        locQuest15.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][14] = locQuest15;
        
        Question locQuest16 = new Question();
        locQuest16.setQuestion(" ");
        locQuest16.setPossibleAnswers(" ");
        locQuest16.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][15] = locQuest16;
        
        Question locQuest17 = new Question();
        locQuest17.setQuestion(" ");
        locQuest17.setPossibleAnswers(" ");
        locQuest17.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][16] = locQuest17;
        
        Question locQuest18 = new Question();
        locQuest18.setQuestion(" ");
        locQuest18.setPossibleAnswers(" ");
        locQuest18.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][17] = locQuest18;
        
        Question locQuest19 = new Question();
        locQuest19.setQuestion(" ");
        locQuest19.setPossibleAnswers(" ");
        locQuest19.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][18] = locQuest19;
        
        Question locQuest20 = new Question();
        locQuest20.setQuestion(" ");
        locQuest20.setPossibleAnswers(" ");
        locQuest20.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][19] = locQuest20;
        
        Question locQuest21 = new Question();
        locQuest21.setQuestion(" ");
        locQuest21.setPossibleAnswers(" ");
        locQuest21.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][20] = locQuest21;
        
        Question locQuest22 = new Question();
        locQuest22.setQuestion(" ");
        locQuest22.setPossibleAnswers(" ");
        locQuest22.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][21] = locQuest22;
        
        Question locQuest23 = new Question();
        locQuest23.setQuestion(" ");
        locQuest23.setPossibleAnswers(" ");
        locQuest23.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][22] = locQuest23;
        
        Question locQuest24 = new Question();
        locQuest24.setQuestion(" ");
        locQuest24.setPossibleAnswers(" ");
        locQuest24.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][23] = locQuest24;
        
        Question locQuest25 = new Question();
        locQuest25.setQuestion(" ");
        locQuest25.setPossibleAnswers(" ");
        locQuest25.setAnswerLevelQuestion(" "); 
        locQuestArray[QuestionType.faith.ordinal()][24] = locQuest25;

        return locQuestArray;
    }
    
}

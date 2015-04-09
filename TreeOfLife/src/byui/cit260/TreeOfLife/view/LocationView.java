/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.MapControl;
import byui.cit260.TreeOfLife.exceptions.MapControlException;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Map;
import byui.cit260.TreeOfLife.model.Question;
import byui.cit260.TreeOfLife.model.QuestionArray;
import byui.cit260.TreeOfLife.model.Scene;
import treeoflife.TreeOfLife;

/**
 *
 * @author Andrew
 */
public class LocationView extends View {
    
    public final QuestionArray questions;

    public LocationView(){
        super("\n");
        questions = new QuestionArray();
        questions.updateCurrentLocation(TreeOfLife.currentGame.getScene(),TreeOfLife.currentGame.getQuestionNumber());
//        Scene scene = questions.getScene();
    }
    
    

    
   @Override
    public boolean doAction(Object obj) {
        
//        Scene scene = questions.getScene();
        Question locQuestion = questions.getCurrentQuestion();
//
////        System.out.printf("Location: %d %d", currentXLocation, currentYLocation );
//        System.out.println(scene.getDescription());
//        System.out.println(locQuestion.getQuestion());
        
        String value = (String) obj;
        
        if (value.equals(locQuestion.getAnswerLevelQuestion())){
              System.out.println("Correct!!");
              double questionAttribute = locQuestion.getAttributeAmount();
              double faith = locQuestion.getFaithAdded();
              double obedience = locQuestion.getObedienceAdded();
              double knowledge = locQuestion.getKnowledgeAdded();
              TreeOfLife.currentGame.setFaith(TreeOfLife.currentGame.getFaith() + faith);
              TreeOfLife.currentGame.setObedience(TreeOfLife.currentGame.getObedience() + obedience);
              TreeOfLife.currentGame.setKnowledge(TreeOfLife.currentGame.getKnowledge() + knowledge);
              
        }else{
            System.out.println("Wrong");
        }
        
        if(TreeOfLife.currentGame.getQuestionNumber() < 7  && TreeOfLife.currentGame.getScene() < 2){
            TreeOfLife.currentGame.setQuestionNumber(TreeOfLife.currentGame.getQuestionNumber()+1);
            MapView mapView = new MapView(this);
            mapView.display();
            return false;
        }
        else if(TreeOfLife.currentGame.getQuestionNumber() == 7  && TreeOfLife.currentGame.getScene() < 2) {
            TreeOfLife.currentGame.setQuestionNumber(0);
            TreeOfLife.currentGame.setScene(TreeOfLife.currentGame.getScene()+1);
            
            MapView mapView = new MapView(this);
            mapView.display();
            return false;
        }
        
        
        else /*if (TreeOfLife.currentGame.getQuestionNumber() == 7  && TreeOfLife.currentGame.getScene() == 2)*/
        {            
            System.out.println("You made it to the Tree of Life! Congratulations!");
            System.exit(0);
        }
        return false;
        }
    
    @Override 
    public void display() {
        Question locQuestion = questions.updateCurrentLocation(TreeOfLife.currentGame.getScene(), TreeOfLife.currentGame.getQuestionNumber());
        this.setPromptMessage(locQuestion.getQuestion() + "\n" + locQuestion.getPossibleAnswers());
        super.display();
    }
    
}

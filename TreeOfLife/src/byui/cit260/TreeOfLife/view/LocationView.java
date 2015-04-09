/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.MapControl;
import byui.cit260.TreeOfLife.exceptions.MapControlException;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Map;
import byui.cit260.TreeOfLife.model.Question;
import byui.cit260.TreeOfLife.model.QuestionArray;
import byui.cit260.TreeOfLife.model.Scene;

/**
 *
 * @author Andrew
 */
public class LocationView extends View {
    
    public final QuestionArray questions;

    public LocationView(){
        super("\n");
        questions = new QuestionArray();
        Scene scene = questions.getScene();
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

        }else{
            System.out.println("Wrong");
        }
        MapView mapView = new MapView(this);
        mapView.display();
        return false;
        }
    
    @Override 
    public void display() {
        Question locQuestion = questions.getNextLocationQuestion();
        this.setPromptMessage(locQuestion.getQuestion() + "\n" + locQuestion.getPossibleAnswers());
        super.display();
    }
    
}

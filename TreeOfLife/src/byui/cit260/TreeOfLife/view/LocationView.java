/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.GameControl;
import byui.cit260.TreeOfLife.control.MapControl;
import byui.cit260.TreeOfLife.exceptions.MapControlException;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Map;
import byui.cit260.TreeOfLife.model.Question;
import byui.cit260.TreeOfLife.model.QuestionArray;
import byui.cit260.TreeOfLife.model.Scene;
import java.util.logging.Level;
import java.util.logging.Logger;
import treeoflife.TreeOfLife;

/**
 *
 * @author Andrew
 */
public class LocationView extends View {
    
    private QuestionArray question;
    private Location[][] location;
    private Location currentLocation;
    int currentXLocation;
    int currentYLocation;

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }
     
    public LocationView() throws MapControlException{
        super("\n");
        Map map = new Map(5, 5);
        question = new QuestionArray();
        currentXLocation = 0;
        currentYLocation = 0;
        this.updateCurrentLocation();
       
    }

    public void updateCurrentLocation(){
        currentLocation = location[currentXLocation][currentYLocation];
    }
    
   @Override
    public boolean doAction(Object obj) {
        Scene scene = currentLocation.getScene();
        Question locQuestion = currentLocation.getQuestion();
        
        System.out.printf("Location: %d %d", currentXLocation, currentYLocation );
        System.out.println(scene.getDescription());
        System.out.println(locQuestion.getQuestion());
            
        String value = (String) obj;
        
        if (value.equals(locQuestion.getAnswerLevelQuestion())){
              System.out.println("Correct!!");
        }else{
            System.out.println("Wrong");
        }
        return true;
        }
    
    
}

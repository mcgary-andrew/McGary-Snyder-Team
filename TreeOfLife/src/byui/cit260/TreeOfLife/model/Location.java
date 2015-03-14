/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Krystal
 */
public class Location implements Serializable {
    private int spaceNumber;
    private String armorQuestion;
    private ArmorItem armorObtained;
    private Location[][] locations;
    
    private Scene[] scene;

    public Location(int i, int i0) {
        if (i < 1 || i0 <1) {
            System.out.println("The number of rows and columns muste be > zero");
            return;
        }
        this.i = i;
        this.i0 = i0;
        
        //create 2-D array for Location objects
        this.scene = new scene[i][i0];
        
        for(int row = 0; row < i; row++) {
            for(int column = 0; column < i0; column++){
                //create and initialize new Locatino object instance
                Scene scene = new Scene();
                scene.setColumn(column);
                scene.setRow(row);
                scene.setVisited(false);
                
                //assign the Location object to the current position in array
                scenes[row][column] = scene;
            }
        }
    }

    public Scene[] getScene() {
        return scene;
    }

    public void setScene(Scene[] scene) {
        this.scene = scene;
    }
    

    public Location() {
    }
    
    public int getSpaceNumber() {
        return spaceNumber;
    }

    public void setSpaceNumber(int spaceNumber) {
        this.spaceNumber = spaceNumber;
    }

    public String getArmorQuestion() {
        return armorQuestion;
    }

    public void setArmorQuestion(String armorQuestion) {
        this.armorQuestion = armorQuestion;
    }

    public ArmorItem getArmorObtained() {
        return armorObtained;
    }

    public void setArmorObtained(ArmorItem armorObtained) {
        this.armorObtained = armorObtained;
    }

    @Override
    public String toString() {
        return "Location{" + "spaceNumber=" + spaceNumber + ", armorQuestion=" + armorQuestion + ", armorObtained=" + armorObtained + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.spaceNumber;
        hash = 97 * hash + Objects.hashCode(this.armorQuestion);
        hash = 97 * hash + Objects.hashCode(this.armorObtained);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.spaceNumber != other.spaceNumber) {
            return false;
        }
        if (!Objects.equals(this.armorQuestion, other.armorQuestion)) {
            return false;
        }
        if (!Objects.equals(this.armorObtained, other.armorObtained)) {
            return false;
        }
        return true;
    }
    
    
}

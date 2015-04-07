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
    private Scene scene;

    
        
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

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.spaceNumber;
        hash = 53 * hash + Objects.hashCode(this.armorQuestion);
        hash = 53 * hash + Objects.hashCode(this.armorObtained);
        hash = 53 * hash + Objects.hashCode(this.scene);
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
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        return true;
    }

    void setColumn(int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRow(int row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
    
}

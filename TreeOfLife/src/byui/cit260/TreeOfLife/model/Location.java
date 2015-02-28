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

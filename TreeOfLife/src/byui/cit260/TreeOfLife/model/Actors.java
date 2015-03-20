
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Andrew
 */
public enum Actors implements Serializable{
    
       
    
    Lehi("He is the Prophet and leader of the family."),
    Nephi("Faithful son and later the prophet leader of the Nephites."),
    Sam("The youngest boy and faithful brother of Nephi.");
    
    //class instance variables
    public final String PlayerName;
    private final String description;
    private final Map coordinates;
    private ArmorPiece[] armor;

    public ArmorPiece[] getarmor() {
        return armor;
    }

    public void setarmor(ArmorPiece[] armor) {
        this.armor = armor;
    }

    private Actors(String description) {
    this.description = description;
    coordinates = new Map(1,1);
    PlayerName = new String();
    }
    public static Actors getLehi() {
        return Lehi;
    }

    public static Actors getNephi() {
        return Nephi;
    }

    public static Actors getSam() {
        return Sam;
    }
    public String getDescription() {
        return description;
    }
    
    public Map getCoordinates() {
        return coordinates;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    @Override
    public String toString() {
        return "Player{" + "PlayerName=" + PlayerName + "description=" + description + "coordinates=" + coordinates + '}';
    }   
}

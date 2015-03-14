
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Andrew
 */
public enum Player implements Serializable{
    
       
    
    Lehi("He is the Prophet and leader of the family."),
    Nephi("Faithful son and later the prophet leader of the Nephites."),
    Sam("The youngest boy and faithful brother of Nephi.");
    
    //class instance variables
    public final String PlayerName;
    private final String description;
    private final Point coordinates;
    
    private ArmorPiece[] armor;

    public ArmorPiece[] getarmor() {
        return armor;
    }

    public void setarmor(ArmorPiece[] armor) {
        this.armor = armor;
    }

    private Player(String description) {
    this.description = description;
    coordinates = new Point(1,1);
    PlayerName = new String();
    }
    public static Player getLehi() {
        return Lehi;
    }

    public static Player getNephi() {
        return Nephi;
    }

    public static Player getSam() {
        return Sam;
    }
    public String getDescription() {
        return description;
    }
    
    public Point getCoordinates() {
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

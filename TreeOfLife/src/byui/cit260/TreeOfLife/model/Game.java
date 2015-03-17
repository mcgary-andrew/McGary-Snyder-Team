/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;

/**
 *
 * @author Nathan
 */
public class Game implements Serializable {
        private double totalTime;
        private Player Player;
        private Location location;
        private CharacterAttributes Attributes;

    public CharacterAttributes getAttributes() {
        return Attributes;
    }

    public void setAttributes(CharacterAttributes Attributes) {
        this.Attributes = Attributes;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

     
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Player getPlayer() {
        return Player;
    }

    public void setPlayer(Player Player) {
        this.Player = Player;
    }
        
        
        
    
}

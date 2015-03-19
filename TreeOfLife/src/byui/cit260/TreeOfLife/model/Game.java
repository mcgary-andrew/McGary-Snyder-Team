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
        private Actors player;
        private Location[][] locations;
        private ArmorPiece[] armorPieces; 

    public ArmorPiece[] getArmorPieces() {
        return armorPieces;
    }

    public void setArmorPieces(ArmorPiece[] armorPieces) {
        this.armorPieces = armorPieces;
    }


    public Location[][] getLocation() {
        return locations;
    }

    public void setLocation(Location[][] location) {
        this.locations = location;
    }

     
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Actors getPlayer() {
        return player;
    }

    public void setPlayer(Actors Player) {
        this.player = Player;
    }
        
        
        
    
}

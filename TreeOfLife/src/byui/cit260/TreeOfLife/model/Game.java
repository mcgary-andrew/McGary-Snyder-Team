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
        private Player player;
        private Location[][] locations;
        private ArmorPiece[] armorPieces;
        private double obedience;
        private double faith;
        private double knowledge;
        private Map map;
        private int scene;
        private int questionNumber;
//        private int [][] currentLocation;

    public int getScene() {
        return scene;
    }

    public void setScene(int scene) {
        this.scene = scene;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

//    public int[][] getCurrentLocation() {
//        return currentLocation;
//    }
//
//    public void setCurrentLocation(int[][] currentLocation) {
//        this.currentLocation = currentLocation;
//    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Actors getActors() {
        return actors;
    }

    public void setActors(Actors actors) {
        this.actors = actors;
    }
        private Actors actors;

        
        
    public double getObedience() {
        return obedience;
    }

    public void setObedience(double obedience) {
        this.obedience = obedience;
    }

    public double getFaith() {
        return faith;
    }

    public void setFaith(double faith) {
        this.faith = faith;
    }

    public double getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(double knowledge) {
        this.knowledge = knowledge;
    }
   
                

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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player Player) {
        this.player = Player;
    }
        
        
        
    
}

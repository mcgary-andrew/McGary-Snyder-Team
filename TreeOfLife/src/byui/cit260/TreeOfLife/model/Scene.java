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
public class Scene implements Serializable{
    private String description;
    private String sceneType;
    private double armorRequiredToPass;
    private boolean visited;
    private int answeredCorrectlyQuestions;
    private Scene scene;
    private Actors actor;
    private String mapSymbol;
    private Boolean blocked;
    
    
    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }
    
    
    public Boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }
    

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Actors getActor() {
        return actor;
    }

    public void setActor(Actors actor) {
        this.actor = actor;
    }
    

    public Scene() {
    }  
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return sceneType;
    }

    public void setType(String type) {
        this.sceneType = type;
    }

    public double getArmorRequiredToPass() {
        return armorRequiredToPass;
    }

    public void setArmorRequiredToPass(double armorRequiredToPass) {
        this.armorRequiredToPass = armorRequiredToPass;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getAnsweredCorrectlyQuestions() {
        return answeredCorrectlyQuestions;
    }

    public void setAnsweredCorrectlyQuestions(int answeredCorrectlyQuestions) {
        this.answeredCorrectlyQuestions = answeredCorrectlyQuestions;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", type=" + sceneType + ", armorRequiredToPass=" + armorRequiredToPass + ", visited=" + visited + ", answeredCorrectlyQuestions=" + answeredCorrectlyQuestions + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.sceneType);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.armorRequiredToPass) ^ (Double.doubleToLongBits(this.armorRequiredToPass) >>> 32));
        hash = 71 * hash + (this.visited ? 1 : 0);
        hash = 71 * hash + this.answeredCorrectlyQuestions;
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.sceneType, other.sceneType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.armorRequiredToPass) != Double.doubleToLongBits(other.armorRequiredToPass)) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.answeredCorrectlyQuestions != other.answeredCorrectlyQuestions) {
            return false;
        }
        return true;
    }

}

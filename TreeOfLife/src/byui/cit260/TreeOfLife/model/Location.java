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
    private int row;
    private int column;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    private String armorQuestion;
    private ArmorItem armorObtained;
    private Scene scene;
    private Question question;
    private Actors[] actor;

    public Actors[] getActor() {
        return actor;
    }

    public void setActor(Actors[] actor) {
        this.actor = actor;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
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
        hash = 53 * hash + this.row;
        hash = 53 * hash + this.column;
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
        if (this.row != other.row) {
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
}

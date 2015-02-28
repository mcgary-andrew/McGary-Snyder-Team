/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.awt.image.BufferedImage;
import java.util.Objects;

/**
 *
 * @author Krystal
 */
public class Character implements Serializable {
    private String name;
    private BufferedImage image;
    private int faith;
    private int obedience;
    private int knowledge;

    public Character() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public int getFaith() {
        return faith;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }

    public int getObedience() {
        return obedience;
    }

    public void setObedience(int obedience) {
        this.obedience = obedience;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", image=" + image + ", faith=" + faith + ", obedience=" + obedience + ", knowledge=" + knowledge + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.image);
        hash = 37 * hash + this.faith;
        hash = 37 * hash + this.obedience;
        hash = 37 * hash + this.knowledge;
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.image, other.image)) {
            return false;
        }
        if (this.faith != other.faith) {
            return false;
        }
        if (this.obedience != other.obedience) {
            return false;
        }
        if (this.knowledge != other.knowledge) {
            return false;
        }
        return true;
    }
    
    
}

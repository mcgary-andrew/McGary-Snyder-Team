
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Andrew
 */
public class Player implements Serializable{
    
    //class instance variables
    private String PlayerName;
    private String Obedience;
    private String Faith;
    private String Knowledge;

    public Player() {
    }
    
    

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String PlayerName) {
        this.PlayerName = PlayerName;
    }

    public String getObedience() {
        return Obedience;
    }

    public void setObedience(String Obedience) {
        this.Obedience = Obedience;
    }

    public String getFaith() {
        return Faith;
    }

    public void setFaith(String Faith) {
        this.Faith = Faith;
    }

    public String getKnowledge() {
        return Knowledge;
    }

    public void setKnowledge(String Knowledge) {
        this.Knowledge = Knowledge;
    }

    @Override
    public String toString() {
        return "Player{" + "PlayerName=" + PlayerName + ", Obedience=" + Obedience + ", Faith=" + Faith + ", Knowledge=" + Knowledge + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.PlayerName);
        hash = 29 * hash + Objects.hashCode(this.Obedience);
        hash = 29 * hash + Objects.hashCode(this.Faith);
        hash = 29 * hash + Objects.hashCode(this.Knowledge);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.PlayerName, other.PlayerName)) {
            return false;
        }
        if (!Objects.equals(this.Obedience, other.Obedience)) {
            return false;
        }
        if (!Objects.equals(this.Faith, other.Faith)) {
            return false;
        }
        if (!Objects.equals(this.Knowledge, other.Knowledge)) {
            return false;
        }
        return true;
    }

    
    
    
    
}

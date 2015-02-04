
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.Objects;
import byui.cit260.TreeOfLife.model.ArmorPiece;

/**
 *
 * @author Andrew
 */
public class ArmorItem implements Serializable{
    
    //class instance variables
    private String ArmorAbility;
    private String ArmorCost;


    public ArmorItem() {
    }
    
    

    public String getArmorAbility() {
        return ArmorAbility;
    }

    public void setArmorAbility(String ArmorAbility) {
        this.ArmorAbility = ArmorAbility;
    }

    public String getArmorCost() {
        return ArmorCost;
    }

    public void setArmorCost(String ArmorCost) {
        this.ArmorCost = ArmorCost;
    }

        @Override
    public String toString() {
        return "Player{" + "ArmorItem=" + ArmorAbility + ", ArmorCost=" + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.ArmorAbility);
        hash = 29 * hash + Objects.hashCode(this.ArmorCost);
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
        final ArmorItem other = (ArmorItem) obj;
        if (!Objects.equals(this.ArmorAbility, other.ArmorAbility)) {
            return false;
        }
        if (!Objects.equals(this.ArmorCost, other.ArmorCost)) {
            return false;
        }
        return true;
    }

    
    
    
    
}

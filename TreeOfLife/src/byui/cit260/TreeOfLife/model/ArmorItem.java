
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
    private int ArmorAbility;
    private int ArmorCost;


    public ArmorItem() {
    }
    
    

    public int getArmorAbility() {
        return ArmorAbility;
    }

    public void setArmorAbility(int ArmorAbility) {
        this.ArmorAbility = ArmorAbility;
    }

    public int getArmorCost() {
        return ArmorCost;
    }

    public void setArmorCost(int ArmorCost) {
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

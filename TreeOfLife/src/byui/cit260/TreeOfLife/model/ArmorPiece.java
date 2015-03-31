
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Andrew
 */
public enum ArmorPiece implements Serializable{
    
    Faith("Shield of Faith", 5, 20, 5),
    Knowledge("Sword of God", 5, 5, 20),
    Obedience("Breastplate of Righteousness", 20, 5, 5);
    
    //class instance variables
    public final String armorPieceName;
    public final double obedienceValue;
    public final double faithValue;
    public final double knowledgeValue;

    ArmorPiece(String armorPieceName, double obedience, double faith, double knowledge){
        this.armorPieceName = armorPieceName;
        this.obedienceValue = obedience;
        this.faithValue = faith;
        this.knowledgeValue = knowledge;
        }
    
    public String getArmorPieceName() {
        return armorPieceName;
    }

    public double getObedienceValue() {
        return obedienceValue;
    }

    public double getFaithValue() {
        return faithValue;
    }

    public double getKnowledgeValue() {
        return knowledgeValue;
    }


}


package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Andrew
 */
public enum ArmorPiece implements Serializable{
    
    Faith("Shield of Faith", 5, 10, 15),
    Knowledge("Sword of God", 10, 15, 5),
    Obedience("Breastplate of Righteousness", 15, 5, 10);
    
    //class instance variables
    public final String armorPieceName;
    public final double obedienceRequired;
    public final double faithRequired;
    public final double knowledgeRequired;

    ArmorPiece(String armorPieceName, double obedience, double faith, double knowledge){
        this.armorPieceName = armorPieceName;
        this.obedienceRequired = obedience;
        this.faithRequired = faith;
        this.knowledgeRequired = knowledge;
        }
    
    public String getArmorPieceName() {
        return armorPieceName;
    }

    public double getObedienceRequired() {
        return obedienceRequired;
    }

    public double getFaithRequired() {
        return faithRequired;
    }

    public double getKnowledgeRequired() {
        return knowledgeRequired;
    }


}

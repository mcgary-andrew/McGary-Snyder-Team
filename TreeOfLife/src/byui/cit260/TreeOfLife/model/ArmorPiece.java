
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
    public final int obedienceRequired;
    public final int faithRequired;
    public final int knowledgeRequired;

    ArmorPiece(String armorPieceName, int obedience, int faith, int knowledge){
        this.armorPieceName = armorPieceName;
        this.obedienceRequired = obedience;
        this.faithRequired = faith;
        this.knowledgeRequired = knowledge;
        }
    
    public String getArmorPieceName() {
        return armorPieceName;
    }

    public int getObedienceRequired() {
        return obedienceRequired;
    }

    public int getFaithRequired() {
        return faithRequired;
    }

    public int getKnowledgeRequired() {
        return knowledgeRequired;
    }


}

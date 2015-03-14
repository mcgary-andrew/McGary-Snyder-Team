
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Andrew
 */
public enum ArmorPiece implements Serializable{
    
    Faith("Shield of Faith"),
    Knowledge("Sword of God"),
    Obedience("Breastplate of Righteousness");
    
    //class instance variables
    private final String ArmorPieceName;
    private final int ObedienceRequired;
    private final int FaithRequired;
    private final int KnowledgeRequired;

    ArmorPiece(String ArmorPieceName){
        this.ArmorPieceName = ArmorPieceName;
        int obedience = 30;
        this.ObedienceRequired = obedience;
        int faith = 30;
        this.FaithRequired = faith;
        int knowledge = 30;
        this.KnowledgeRequired = knowledge;
        }
    
    

    public String getArmorPieceName() {
        return ArmorPieceName;
    }

    public int getObedienceRequired() {
        return ObedienceRequired;
    }

    public int getFaithRequired() {
        return FaithRequired;
    }

    public int getKnowledgeRequired() {
        return KnowledgeRequired;
    }

    @Override
    public String toString() {
        return "Player{" + "ArmorPieceName=" + ArmorPieceName + ", ObedienceRequired=" + ObedienceRequired + ", FaithRequired=" + FaithRequired + ", KnowledgeRequired=" + KnowledgeRequired + '}';
    }

    public void setDescription(String sword_of_God) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRequriedAmount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

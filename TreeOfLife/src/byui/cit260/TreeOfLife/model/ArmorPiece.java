
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
    public final String ArmorPieceName;
    public final int ObedienceRequired;
    public final int FaithRequired;
    public final int KnowledgeRequired;

    ArmorPiece(String ArmorPieceName){
        this.ArmorPieceName = ArmorPieceName;
        int obedience = 30;
        this.ObedienceRequired = obedience;
        int faith = 30;
        this.FaithRequired = faith;
        int knowledge = 30;
        this.KnowledgeRequired = knowledge;
        }
    
    public static ArmorPiece[] createArmorPieceList() {
        ArmorPiece[] armor = new ArmorPiece[2];
        
        ArmorPiece[] SofG = new ArmorPiece[2];
        SofG.setDescription("Sword of God");
        SofG.setQuantityInStock(0);
        SofG.setRequriedAmount(0);
        armor[0] = SofG;
        
        ArmorPiece BofR = new ArmorPiece();
        BofR.setDescription("Breastplate of Righteousness");
        BofR.setQuantityInStock(0);
        BofR.setRequriedAmount(0);
        armor[1] = BofR;
        
        ArmorPiece SofF = new ArmorPiece();
        SofF.setDescription("Sheild of Faith");
        SofF.setQuantityInStock(0);
        SofF.setRequriedAmount(0);
        armor[2] = SofF;
        
        return armor;
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

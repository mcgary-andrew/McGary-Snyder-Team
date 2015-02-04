
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Andrew
 */
public class ArmorPiece implements Serializable{
    
    //class instance variables
    private String ArmorPieceName;
    private int ObedienceRequired;
    private int FaithRequired;
    private int KnowledgeRequired;

    public ArmorPiece() {
    }
    
    

    public String getArmorPieceName() {
        return ArmorPieceName;
    }

    public void setArmorPieceName(String ArmorPieceName) {
        this.ArmorPieceName = ArmorPieceName;
    }

    public int getObedienceRequired() {
        return ObedienceRequired;
    }

    public void setObedienceRequired(int ObedienceRequired) {
        this.ObedienceRequired = ObedienceRequired;
    }

    public int getFaithRequired() {
        return FaithRequired;
    }

    public void setFaithRequired(int FaithRequired) {
        this.FaithRequired = FaithRequired;
    }

    public int getKnowledgeRequired() {
        return KnowledgeRequired;
    }

    public void setKnowledgeRequired(int KnowledgeRequired) {
        this.KnowledgeRequired = KnowledgeRequired;
    }

    @Override
    public String toString() {
        return "Player{" + "ArmorPieceName=" + ArmorPieceName + ", ObedienceRequired=" + ObedienceRequired + ", FaithRequired=" + FaithRequired + ", KnowledgeRequired=" + KnowledgeRequired + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.ArmorPieceName);
        hash = 29 * hash + Objects.hashCode(this.ObedienceRequired);
        hash = 29 * hash + Objects.hashCode(this.FaithRequired);
        hash = 29 * hash + Objects.hashCode(this.KnowledgeRequired);
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
        final ArmorPiece other = (ArmorPiece) obj;
        if (!Objects.equals(this.ArmorPieceName, other.ArmorPieceName)) {
            return false;
        }
        if (!Objects.equals(this.ObedienceRequired, other.ObedienceRequired)) {
            return false;
        }
        if (!Objects.equals(this.FaithRequired, other.FaithRequired)) {
            return false;
        }
        if (!Objects.equals(this.KnowledgeRequired, other.KnowledgeRequired)) {
            return false;
        }
        return true;
    }

    
    
    
    
}

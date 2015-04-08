/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

/**
 *
 * @author Andrew
 */
public class AddArmorMenu extends View {
    public AddArmorMenu() { 
            super("\n"
            + "\n-----------------------------------------"
            + "\n| Add Armor Menu"
            + "\n-----------------------------------------"
            + "\nF - Add Shield of Faith (Requires 25 Faith, 10 Knowledge, and 10 Obedience)"
            + "\nS - Add Sword of God (Requires 10 Faith, 25 Knowledge, and 10 Obedience)"
            + "\nR - Add Breastplate of Righteousness (Requires 10 Faith, 10 Knowledge, and 25 Obedience)"
            + "\nE - Exit"
            + "\n-----------------------------------------");
            }
   

    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        switch (value){
            case "F": // Begin game
                this.addSofF();
                break;
            case "S": // Help
                this.addSofG();
                break;
            case "R": //Save
                this.addBofR();
                break;
            case "E": // Exit
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
                break;
            default:
                this.console.println("\n*** Invalid Selection ***");
                break;
        }
        return true;
    }

    private void addSofG() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.        
    }

    private void addBofR() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addSofF() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

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
public class GameMenuView extends View {

    public String gameMenu = "";    
    public GameMenuView(){
    super("\n"
            + "\n-----------------------------------------"
            + "\n Game Menu"
            + "\n-----------------------------------------"
            + "\nR - Resume" 
            + "\nS - Save" 
            + "\nA - Go to armor shop"
            + "\nE - Exit"
            + "\n-----------------------------------------");
    }
    
    
 @Override
    public void doAction(Object obj) {
        
        char value = (char) obj;
        
        switch (value){
            case 'R': // Resume Game
                this.resumeGame();
                break;
            case 'S': // Save
                this.saveGame();
                break;
            case 'A': // Go to Armor Shop
                this.displayAddArmorMenu();
                break;
            case 'E': // Exit
                return;
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
    }
    
    private void saveGame() {
       System.out.println("*** saveGame function called ***");
    }

    private void resumeGame() {
        System.out.println("*** resumeGame function called ***");
    }

    private void displayAddArmorMenu() {
        System.out.println("*** displayAddArmorMenu function called ***");
    }
    
}

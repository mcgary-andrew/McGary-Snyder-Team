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
public class HelpMenuView extends View {
    
    public HelpMenuView(){
            super("\n"
            + "\n-----------------------------------------"
            + "\n| Help Menu"
            + "\n-----------------------------------------"
            + "\nWhat is the goal of the game?"
            + "\n"
            + "\nYour goal is to reach the Tree of Life,"
            + "\nwhich has the fruit that is sweet above"
            + "\nall other fruits, which is Eternal Life."
            + "\n"
            + "\nTo reach the Tree of Life, you will need"
            + "\nto answer 25 questions about that will"
            + "\nstrengthen your faith, knowledge, and "
            + "\nobedience."
            + "\n"
            + "\nAs you strengthen these attributes, you"
            + "\nwill be able to earn pieces of armor from"
            + "\nthe Armor Shop (accessed from the game menu)."
            + "\n"
            + "\nHow to Move"
            + "\n"
            + "\nAnswer the questions to the best of your"
            + "\nability by selecting one of the multiple"
            + "\nchoice options.  Once you have made your"
            + "\nselection, a correct answer will award you"
            + "\nattributes and move you to the next location"
            + "\non the map in your progress towards the"
            + "\nTree of Life.  See you later! Goodbye!"
            + "\n-----------------------------------------"                
            + "\nE - Exit to Menu"
            + "\n-----------------------------------------");
    }
    
@Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        switch (value){
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
}

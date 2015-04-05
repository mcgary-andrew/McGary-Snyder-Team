/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.ProgramControl;
import byui.cit260.TreeOfLife.model.Player;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class StartProgramView{
    public StartProgramView(){
        
    }
    public void startProgram(){
        this.displayBanner();
        
        //prompt the player to enter their name
        String name = getPlayersName();
        
        //Creat and Save the player object
        Player player = ProgramControl.createPlayer(name);
        
        // Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        //Display the Main Menu.
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        
        
    }           

    private void displayBanner() {
        System.out.println("\n\n****************************************************************");
        
        System.out.println("*                                                              *"
                + "\n* In this game you will have the opportunity to choose between *"
                + "\n* three characters to embark on a journey to the Tree of Life. *"
                + "\n* Your journey will begin in the land of Lehi's Drea, taking   *"
                + "\n* you through different environments from the desert, to the   *"
                + "\n* forest, across rivers, through mountains in hopes of         *"
                + "\n* reaching your final destination, The Tree of Life.           *");
        
        System.out.println("*                                                              *"
                + "\n* The journey will not be an easy one. It will require faith   *"
                + "\n* and the ability to stay the course despite the hardships     *"
                + "\n* you encounter. You will need to acquire the Armor of God     *"
                + "\n* along the way to overcome the challenges ahead. You will     *"
                + "\n* also need to acquire adequate Faith, Knowledge and           *"
                + "\n* Obedience. You can visit the Armor Shop if you are low       *"
                + "\n* on any of these attributes to help guide you to the Tree     *"
                + "\n* of Life. If you do not have sufficient attributes or enough  *"
                + "\n* armor by certain points in the game you may find yourself    *"
                + "\n* stuck in a large and spacious building or at the Tree of     *"
                + "\n* Knowledge. The Tree of Knowledge only grants you one gift    *"
                + "\n* and if you fail to reach either tree, you will surely have   *"
                + "\n* been lost in the Spacious Building.                          *");
        
        System.out.println("****************************************************************");
    }

    public String getPlayersName() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        try {
        while(!valid){//while a valid name has not been retrieved
            
            //prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim off the blanks
            Scanner keyboard = new Scanner(System.in);
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //if the name is invalid (less than two characters in length))
            if (playersName.length() < 2){
                System.out.println("Invalid name - the name must be more than one character");
                continue; //and repeats again
                }
            break; //out of the (exit) the repetition
        }
        } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
                }
        
        return playersName; // return the name
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n====================================");
        System.out.println("\tWelcome to the game " + player.getName() + "!");
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("======================================");
        
    }
    
//    @Override
//    public boolean doAction(Object obj){
//        String value = (String) obj;
//        value = value.toUpperCase();
//        char choice = value.charAt(0);
//        
//        return false;
//    }
}

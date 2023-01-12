package my_OOP_Code;
import java.util.Scanner;

import my_OOP_Code.Players.Gaara;
import my_OOP_Code.Players.Kisame;
import my_OOP_Code.Players.Sauske;
import my_OOP_Code.Players.naruto;
import my_OOP_Code.Players.sakura;


public class Main {

     

public static int greeting(){
    String userInput;
    Scanner myObj = new Scanner(System.in);
    System.out.println("welcome to the Naruto fighiting game");
    System.out.println("You can select from these 5 charaters");
    System.out.println("naruto, sauske, sakura, kisame, gaara");
    System.out.println("Type the character you want to select");
   userInput = myObj.nextLine();
    if(userInput.equals("naruto")){
        return 1;
    }
    if(userInput.equals("sauske")){
        return 2;
    }
    if(userInput.equals("sakura")){
        return 3;
    }
    if(userInput.equals("kisame")){
        return 4;
    }
    if(userInput.equals("gaara")){
        return 5;
    }
return 0;
}

public static int[] moveSelect(Gaara player1, Kisame player2, naruto player3, sakura player4, Sauske player5 ){ 
    System.out.println("your character can have these moves ");
    int characterName = greeting();
    /* Gaara player01 = new Gaara(array); 
        Kisame player02 = new Kisame(array); 
        naruto player03 = new naruto(array); 
        sakura player04 = new sakura(array); 
        Sauske player05 = new Sauske(array); */
    if(characterName == 1){
player1.toString();
    }if(characterName == 2){
        player2.toString();
    }if(characterName == 3){
        player3.toString();
    }if(characterName == 4){
        player4.toString();
    }if(characterName == 5){
        player5.toString();
    }
    System.out.println("type 1,2,3 etc depeding on which special moves you want, remember you can only hava 3, having less gives you powerup points");


    return null;
    
    

}
public static int[] PowerSelect(){ 
    //this method will allow you to select the 3 special moves
    // this method gives you 10 upgrades
    //you can upgrade moves for 1 and special moves for 2
    // every round you play will automatically give you 3 upgrades

    System.out.println("here are all the moves you can do ");
    System.out.println("type in the upgrade amount for all your moves, remember you only have 12 upgrades");

    return null;
    
    

}

public static void userPlaying(){
// the goal will be to be able to create an instance of a class
        //naruto userPlayer = new naruto(array of power ups)
        // then in a depending on which powers use picks, those powers will be in a loop


}
public static void computerPlaying(){
    
}
    public static void main(String[] args) {
        
        int[] array = {3,5,3,3,45,4};
        Gaara player1 = new Gaara(array); 
        Kisame player2 = new Kisame(array); 
        naruto player3 = new naruto(array); 
        sakura player4 = new sakura(array); 
        Sauske player5 = new Sauske(array); 

        int healthUser = 1000;
        int healthcomputer = 1000;
        int userCharacter = greeting();
        
        moveSelect(player1, player2, player3, player4, player5);




}

    }



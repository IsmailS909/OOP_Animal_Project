package my_OOP_Code;
import java.util.Scanner;



public class Main {
   public static Scanner myObj = new Scanner(System.in);
     

public static int greeting(){
    String userInput;
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
    if(userInput.equals("kisame")){
        return 3;
    }
    if(userInput.equals("gaara")){
        return 4;
    }
return 0;
}

/*
public static int specialMoveSelect(Gaara player1, Kisame player2, naruto player3, sakura player4, Sauske player5 ){ 
    System.out.println("your character can have these moves special moves");
    int characterName = greeting();
     Gaara player01 = new Gaara(array); 
        Kisame player02 = new Kisame(array); 
        naruto player03 = new naruto(array); 
        sakura player04 = new sakura(array); 
        Sauske player05 = new Sauske(array); 
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
    System.out.println("from the 3 optional special moves, whcih one do you want");
int userInput = myObj.nextInt();
    while(true){
    if(userInput <= 3 || userInput > 0){
        break;
    }
    
    }
    return myObj.nextInt();
    
    
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
*/


public static void userPlaying(){
// the goal will be to be able to create an instance of a class
        //naruto userPlayer = new naruto(array of power ups)
        // then in a depending on which powers use picks, those powers will be in a loop


}
public static void computerPlaying(){
    
}
    
        
        

       //// int healthUser = 1000;
        //int healthcomputer = 1000;
       // int userCharacter = greeting();
        
      //  int s = specialMoveSelect(player1, player2, player3, player4, player5);

//healthUser = player1.Strike(2);
//System.out.println(healthUser);

// how the game will work,

/*
 * user will select character using 1,2,3,4,5, on screen using javadraw
 * a quick toString method will tell you its backsotry it's moves and special moves, then 8 input numbers for upgrades
 * game will tell user the rules
 * their will be 3 preset coputer characters each facing of in a different enviroment
 * user will have to use 1 character the whole time, as time goes on, user can upgrade duing after each battle
 * lose start again
 * 
 * 
 * gameplay:
 * 
 * 
 * 
 */
public static void main(String[] args) {

int userHealth = 1000;
int computerHealth =1000;
int[] array1 = {1,2,3,4,5};

Scanner myObj = new Scanner(System.in);  

greeting();
 while(userHealth > 0 && computerHealth > 0){
System.out.println("type the move you want to do 1- 7 ");
int userInput = myObj.nextInt();  


 }
 

}

    }



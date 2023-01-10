package my_OOP_Code;
import java.util.Scanner;

import my_OOP_Code.Players.naruto;


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

public static int[] moveAndPowerSelect(){
    return [3,3,2,34];
    

}
public static void userPlaying(){

}
public static void computerPlaying(){
    
}
    public static void main(String[] args) {
        
        int healthUser = 1000;
        int healthcomputer = 1000;
        int userCharacter = greeting();
        
        




}

    }



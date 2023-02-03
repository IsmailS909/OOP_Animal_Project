package my_OOP_Code;
import java.util.Scanner;

import my_OOP_Code.Powers.Player;



public class Main {

   public static Scanner myObj = new Scanner(System.in);
     

public static int greeting(){
    String userInput;
    System.out.println("welcome to the Naruto fighiting game");
    System.out.println("You can select from these 3 charaters");
    System.out.println("naruto, sauske, kisame");
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

return 0;
}

public static int[] userUpgrades(){
    int[] userUpgrades = new int[5];

    for(int i = 0; i < 5; i++){
        System.out.println("you have 10 total upgres types 5 numbers to decide which move get's how many upgrarades");
    userUpgrades[i] = myObj.nextInt();
    }
    return userUpgrades;
}


public static void main(String[] args) {

int userHealth= 1000;
int computerHealth = 1100; 
int computerPlayerChosen = 1;
int userStamina = 40;
int computerStamina = 40;
int computerArray[] = {2,3,2,4,1};
int roundPlayed = 1; 
int enviroment = 1;
int playerChosen = greeting();
Player user = new Player(1000, 50, userUpgrades());
Player computer = new Player(1100, 50,computerArray);

 while(userHealth > 0 && computerHealth > 0){
    
System.out.println("type the move you want to do 1- 5 ");
int userInput = myObj.nextInt();  

if(userInput == 0 && playerChosen == 1){
user.rasengan(enviroment, roundPlayed);

}
if(userInput == 1 && playerChosen == 1){
user.nineTailsStamina();
}

if(userInput == 0 && playerChosen == 2){

    user.waterPrisonShark();
}
if(userInput == 1 && playerChosen == 2){
    user.waterBall(enviroment);
}

if(userInput == 0 && playerChosen == 3){
int num = myObj.nextInt(); 
user.amaterasu(num);
}
if(userInput == 1 && playerChosen == 3){
    user.dimensioncreation(); 
}

if(userInput == 2){
user.heal();
}
if(userInput == 3){
    user.knifeThrow(roundPlayed);
}
if(userInput == 4){
    user.staminaBuild();
}



//userHealth = user.getOtherHealth();

//computerHealth = computer.getOtherHealth();




computerStamina = user.getHealth();
userStamina = user.getStamina();

System.out.println(userHealth);
System.out.println(userStamina);


int computerInput = (int)Math.floor(Math.random() * (5 - 1 + 1) + 1);





if(computerInput == 0 && computerPlayerChosen == 1){
    computer.rasengan(enviroment, roundPlayed);
    
    }
    if(computerInput == 1 && computerPlayerChosen == 1){
        computer.nineTailsStamina();
    }
    
    if(computerInput == 0 && computerPlayerChosen == 2){
    
        computer.waterPrisonShark();
    }
    if(computerInput == 1 && computerPlayerChosen == 2){
        computer.waterBall(enviroment);
    }
    
    if(computerInput == 0 && computerPlayerChosen == 3){
    int num = myObj.nextInt(); 
    computer.amaterasu(num);
    }
    if(computerInput == 1 && computerPlayerChosen == 3){
        computer.dimensioncreation(); 
    }
    
    if(computerInput == 2){
        computer.heal();
    }
    if(computerInput == 3){
        computer.knifeThrow(roundPlayed);
    }
    if(computerInput == 4){
        computer.staminaBuild();
    }
    
    
  //  userHealth = user.getOtherHealth();
    
  //  computerHealth = computer.getOtherHealth();
    
    

userHealth = user.getHealth();
computerStamina = user.getStamina();

    System.out.println(computerHealth);
System.out.println(computerStamina);
    
//use an item parent class and item subclass to show abstraction
 }
 

}

    }



package my_OOP_Code.Powers;

import java.util.ArrayList;
import my_OOP_Code.Players.Kisame;
import my_OOP_Code.Players.Sauske;
import my_OOP_Code.Players.naruto;

//this class holds methods with special moves, each player has 2 special moves
public class twoSpecialMoves implements  Kisame, naruto, Sauske{

    // these variable are defined as private and protected because we don't won't to give access to the main method
    protected int stamina;
    private ArrayList<Integer> roundsStaminaIncrease = new ArrayList<Integer>(); // 
    private ArrayList<Integer> futureRoundsAttack = new ArrayList<Integer>(); //
    protected int health; 
    protected int []upgrades;
//this is a constructer 
public twoSpecialMoves(int _health, int _stamina, int []_upgrades){
    this. health = _health;
    this. stamina = _stamina;
    this .upgrades = _upgrades;
    }
//setter method
    public void setStamina(int _stamina){
        this.stamina = _stamina;
    
    }
    //getter method
    public int getStamina(){
        return this.stamina;
    
    }
    //setter method
    public void setHeatlh(int _health){
        this.health = _health;
    
        //getter method
    }public int getHealth(){
        return this.health;
    }
//setter method
    public void setRoundsStaminaIncrease(ArrayList <Integer> _roundsStaminaIncrease){
        this.roundsStaminaIncrease = _roundsStaminaIncrease;
    
    }
    //getter method
    public ArrayList<Integer> GetRoundsStaminaIncrease(){
        return this.roundsStaminaIncrease;
    }
    //setter method
    public void setfutureRoundsAttack(ArrayList <Integer> _futureRoundsAttack){
        this.futureRoundsAttack = _futureRoundsAttack;
    
    }
    //getter method
    public ArrayList<Integer> getfutureRoundsAttack(){
        return this.futureRoundsAttack;
    }

//this method can be used by the character naruto and it takes in 2 parameters and how the user upgraded this move 
// and checks if there is engouh stamina for the move, if their is it reduces the health accordingly
   public int rasengan(int _enviroment, int roundsPlayed){  
    int enviromentBoost = 0;
    if(_enviroment == 1){
    enviromentBoost = 1;
    }
if(this.stamina > 10){
    this.stamina = this.stamina - 10;
    this.health = this.health - (100 + (50 * upgrades[0]) + (roundsPlayed * 10) + (enviromentBoost * 20));
}
return 0;
   }
//this is naruto's move
//this method uses how the user upgraded it and edits the array list which describes how many times stamina gained each round will be doubled
   public int nineTailsStamina(){ 

       for(int i = 0; i > this.upgrades[1] + 1; i++){
        this.roundsStaminaIncrease.add(2); // a arraylist is used because it allows for data to be deleted and added
       }
       this.health = this.health - 70;
   
   return 1;
    }

//this is kisame's move
// it reduces health depeding on a random number which is effected by upgrades
// it then takes stamina

public int waterPrisonShark(){ // kisame's attack, bigger upgrade, bigger random number damage, enviroment allows for more sharks attacking
int biggest = 70 + upgrades[0] * 40;

if(this.stamina > 20){
this.health =- (int) (this.health -  Math.floor(Math.random() *(biggest - 0 + 1) + 0));
this.stamina =- 20; 
return 1;
}

return 0;
}
//this is kisame's attack 
// it adds to an arraylist how much damage x rounds will automatically do 
    public int waterBall(int _enviroment){ 
        if(_enviroment == 2){
            if(this.stamina > 15){
            for(int i = 0; i < upgrades[1] + 2; i++){
                futureRoundsAttack.add(50);
            }
            return 1;
        }
        
        }
        return 0;
        }



//this is sauske's move and it does damage according to how much stamina you give it and upgrades
public int amaterasu(int _staminaUse){ 
                    if(_staminaUse > this.stamina){
                        health =- stamina * 30 + upgrades[0] * 5;
                    
                    this.stamina  =- stamina;
                    return 1; 
                    }
                    return 0;
                }

//doesn't do anything, it's to their just to trick the user
public void dimensioncreation(){  

                        }
                    
                    
                    }




    
    








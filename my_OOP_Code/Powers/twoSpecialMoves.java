package my_OOP_Code.Powers;

import java.util.ArrayList;

import my_OOP_Code.Players.Kisame;
import my_OOP_Code.Players.Sauske;
import my_OOP_Code.Players.naruto;

public class twoSpecialMoves implements  Kisame, naruto, Sauske{
    

 
    private int otherHealth; 
    protected int stamina;
    private ArrayList<Integer> roundsStaminaIncrease = new ArrayList<Integer>(); // 
    private ArrayList<Integer> futureRoundsAttack = new ArrayList<Integer>(); //
protected int health; 
protected int []upgrades;
// dont add more, just make the moves simpler

// every method should take in parameters, enviroment, health, stamina, nextAttackReduce;,roundsStaminaIncrease;,futureRoundsAttack;
public twoSpecialMoves(int _health, int _stamina, int []_upgrades){
    this. health = _health;
    this. stamina = _stamina;
    this .upgrades = _upgrades;
    }

    public void setStamina(int _stamina){
        this.stamina = _stamina;
    
    }
    public int getStamina(){
        return this.stamina;
    
    }
    public void setHeatlh(int _health){
        this.health = _health;
    
    }public int getHealth(){
        return this.health;
    }

    public void setRoundsStaminaIncrease(ArrayList <Integer> _roundsStaminaIncrease){
        this.roundsStaminaIncrease = _roundsStaminaIncrease;
    
    }
    public ArrayList<Integer> GetRoundsStaminaIncrease(){
        return this.roundsStaminaIncrease;
    }
    
    public void setfutureRoundsAttack(ArrayList <Integer> _futureRoundsAttack){
        this.futureRoundsAttack = _futureRoundsAttack;
    
    }
    public ArrayList<Integer> getfutureRoundsAttack(){
        return this.futureRoundsAttack;
    }

    
    //Special 3 special moves each, special moves are morepowerfull by enviroment, cost different stamina, 
        //more upgrades make moves exponentiallly powerfull

    




   public int rasengan(int _enviroment, int roundsPlayed){  //this will just do damage
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


   public int nineTailsStamina(){ // this will amek stamin double for x rounds

       for(int i = 0; i > this.upgrades[1] + 1; i++){
        this.roundsStaminaIncrease.add(2);
       }
       this.health = this.health - 70;
   
   return 1;
    }


public int waterPrisonShark(){ // kisame's attack, bigger upgrade, bigger random number damage, enviroment allows for more sharks attacking
int biggest = 70 + upgrades[0] * 40;

if(this.stamina > 20){
this.health =- (int) (this.health -  Math.floor(Math.random() *(biggest - 0 + 1) + 0));
this.stamina =- 20; 
return 1;
}

return 0;
}

    public int waterBall(int _enviroment){ //kisame's attack, takes less stamina in water, make's user healing for the next x moves not work at all
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




public int amaterasu(int _staminaUse){ //does damage, random amount of stamina used
                    if(_staminaUse > this.stamina){
                        health =- stamina * 30 + upgrades[0] * 5;
                    
                    this.stamina  =- stamina;
                    return 1; 
                    }
                    return 0;
                }
public void dimensioncreation(){  //doesn't do anything lol

                        }
                    
                    
                    }




    
    








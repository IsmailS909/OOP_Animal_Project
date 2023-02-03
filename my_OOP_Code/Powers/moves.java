package my_OOP_Code.Powers;

public class moves extends twoSpecialMoves{

    private int otherHealth; 
    
    // every method should take in 

    public void setotherHealth(int _otherHealth){
        this.otherHealth = _otherHealth;

    }
    public int getOtherHealth(){
        return this.otherHealth;
    }

    public moves(int _health, int _stamina, int []_upgrades) {
        super(_health, _stamina, _upgrades);
        //TODO Auto-generated constructor stub
    }
    
    public int shadowClone(){ // this attack will return the number of attacks it will blocks from oponent, takes in account upgrades and amount of stamina decreased will depend on upgrades
        //this can be used by anyone
       if(this.stamina > 10){
        this.stamina = this.stamina - 4;
this.health = this.health - 20;
       }
       return 0;
        }       
    
 
   
        
    public void heal(){
        this.otherHealth=this.otherHealth+ upgrades[4]* 20 + 30;
    }

    public void knifeThrow(int roundsPlayed){
        this.health =this.health- 40 + roundsPlayed * 5;
    }

    public void staminaBuild(){
        this.stamina =this.stamina+ 5;

    }
  
        
}
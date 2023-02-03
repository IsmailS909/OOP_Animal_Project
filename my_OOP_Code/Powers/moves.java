package my_OOP_Code.Powers;

//this class holds methods that are moves that all characters have
public class moves extends twoSpecialMoves{

    private int ThisPlayersHealth; 
    
//setter method 
    public void setThisPlayersHealth(int _ThisPlayersHealth){
        this.ThisPlayersHealth = _ThisPlayersHealth;

    }
    //getter method 
    public int getThisPlayersHealth(){
        return this.ThisPlayersHealth;
    }
// constructer
    public moves(int _health, int _stamina, int []_upgrades) {
        super(_health, _stamina, _upgrades);
    }
    //this move will check if the player has enough stamina and reduce the other player's health and this player's stamina
    public int shadowClone(){ 
       if(this.stamina > 10){
        this.stamina = this.stamina - 4;
this.health = this.health - 20;
       }
       return 0;
        }       

        // this move will allow you to heal 
    public void heal(){
        this.ThisPlayersHealth=this.ThisPlayersHealth+ upgrades[4]* 20 + 30;
    }

    //this method allows you do do an attack without any stamina
    public void knifeThrow(int roundsPlayed){
        this.health =this.health- 40 + roundsPlayed * 5;
    }
//this method allows you to gain stamina
    public void staminaBuild(){
        this.stamina =this.stamina+ 5;

    }
  
        
}
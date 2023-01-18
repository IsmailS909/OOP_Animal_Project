package my_OOP_Code.Powers;

public class Eightmoves extends ThreeSpecialMoves{

    public int[] _upgradesArray;
    public int _envirmomentChosen;
    

    public Eightmoves(int[] upgradesArray, int envirmomentChosen) {
       
        super(upgradesArray, envirmomentChosen);            //TODO Auto-generated constructor stub
        this._upgradesArray = upgradesArray;
        
        this._envirmomentChosen = envirmomentChosen;
      
    }

    public int Strike(int roundsPlayed){ // each method should be cutomized based on how the user upgrades it, how many rounds have passed
int upgradesToStrike = this._upgradesArray[0];
if(upgradesToStrike > 4 ){
    return (30 * upgradesToStrike * 1/2) + (30 * roundsPlayed);
}
return (30 * upgradesToStrike) + (30 * roundsPlayed);

    }
    
    public int block(){
        return 5; 
    }

    public int heal(){
        return 4;
    }
    public int knifeThrow(){
        return 5;
    }
    public int staminaBuild(){
        return 6; 
    }
        
}
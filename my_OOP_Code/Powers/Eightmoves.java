package my_OOP_Code.Powers;

public class Eightmoves extends ThreeSpecialMoves{

    public int[] _upgradesArray;
    public int _envirmomentChosen;
    public int health;
    
    

    public Eightmoves(int[] upgradesArray, int envirmomentChosen) {
       
        super(upgradesArray, envirmomentChosen);           
        this._upgradesArray = upgradesArray;
        
        this._envirmomentChosen = envirmomentChosen;
      
    }

    public int Strike(){ // 
        if(stamina < 10){
            return 0;
        }
        stamina=+ 10; 
return _upgradesArray[0] * 20;

}
    public int block(){
        int block = 40;
        if(this._upgradesArray[1] > 3){
            block = 20;
        }
            
             int blockAmount =  this._upgradesArray[1] * block;
        
        return blockAmount; 
    }

    public int heal(){
        return 50 * this._upgradesArray[2];
    }

    public int knifeThrow(){
        return 15 * this._upgradesArray[3] ;
    }

    public int staminaBuild(){
        int staminaAmount = 5;
        if(this._upgradesArray[3] > 3){
            staminaAmount = 3;
        }
this.health = staminaAmount * this._upgradesArray[3] * 20;
        return staminaAmount * this._upgradesArray[3];

    }
    public int GethealthChange(){
return this.health;
    }

        
}
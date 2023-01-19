package my_OOP_Code.Powers;

public class ThreeSpecialMoves extends Enviroment{
    


    public int _envirmomentChosen;
    public int damageReduce;



    public ThreeSpecialMoves(int[] upgradesArray, int envirmomentChosen) {
        super(upgradesArray, envirmomentChosen );

    }
    public int rasengan(){  //Special 3 special moves each, special moves are morepowerfull by enviroment, cost different stamina, 
        //more upgrades make moves exponentiallly powerfull
        int enviromentBoost = 1;
        if(_envirmomentChosen == 1){
             enviromentBoost = 40;
        }
        return _upgradesArray[4] * 60 + enviromentBoost;
    }

   public int shadowClone(){ // allo0ws for the next next x attacks to be missed
   return _upgradesArray[5] ;
   }


   public int nineTailsStamina(){
       return 10 + 3 * _upgradesArray[6];
   }


public int summoning(int character){ // enviroment will effect
// frog defends attacks by reducing damage only if enviroment is 1
// also does damagage at the same time 

if(character == 1){
    //how much damage it does
    if(_enviroment == 1){ //naruto
        damageReduce = 20 * _upgradesArray[7];
    }
    return 70 * _upgradesArray[7];
}

if(character == 2){ //sauske
    return 100 * _upgradesArray[8];

}
if(character == 3){ //sakura
if(_enviroment == 1){
    return 150* _upgradesArray[9]; //heal amount
}
 return 100* _upgradesArray[9];
}
return 0;

}
public int megaHeal(){
    return 10;
    }
public int waterPrisonShark(){ // enviroment will effect
    return 10;
    }
    public int waterBall(){ // enviroment will effect
        return 10;
        }
public int sandArmour(){ // enviroment will effect
            return 10;}

 public int quicksand(){ // enviroment will effect
                return 10;
                }
public int amaterasu(){
                    return 10;
                    }
public int dimensioncreation(){ 
                        return 10;
                        }

    
    







}
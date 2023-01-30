package my_OOP_Code.Powers;

abstract class ThreeSpecialMoves implements Gaara, Kisame, naruto, Sauske{
    


    public int _envirmomentChosen;

    public int stamina;
public int[] nextAttackReduce;


    public ThreeSpecialMoves(int[] upgradesArray, int envirmomentChosen) {
        super(upgradesArray, envirmomentChosen );

    }
    //Special 3 special moves each, special moves are morepowerfull by enviroment, cost different stamina, 
        //more upgrades make moves exponentiallly powerfull

    
    public int summoning(int character){  // takes in the character and returns 

        if(character == 1){   // naruto's frog, upgrades and enviroment will effect how much how many rounds it will atack for you and reduce damage done
            if(_enviroment == 1){ 
                damageReduce = 20 * _upgradesArray[7];
            }
            return 70 * _upgradesArray[7];
        }
        
        if(character == 2){ //sauske's snake, this will do a lot of damage but a water eniroment makes it a 50/50 chance of working
            return 100 * _upgradesArray[7];
        
        }
        
        
        
        if(character == 3){// gaara stamina increase for x rounds depepdning on upgrades
            roundStaminaIncrease = 2 * 10;
            return _upgradesArray[7]; //x rounds
        }
        if(character == 4){
            if(_enviroment == 3){ // kisame's shark// make's the oppnent imoble for the next few rounds depending on upgrades
        return 300;
            }
            return 0;
        }
        return 0;
        
        }

   public int shadowClone(){ // this attack will return the number of attacks it will blocks from oponent, takes in account upgrades and amount of stamina decreased will depend on upgrades
    //this can be used by anyone
   return _upgradesArray[5] ;
   }



   public int rasengan(){  //this is a attack, it returns the amount of damage and lowers stamina, 
    //enviroment, rounds, upgrades used have an effect on damage but not amount of stamina used
    // this attack can only be used by naruto
    int enviromentBoost = 1;
    if(_envirmomentChosen == 1){
    enviromentBoost = 2;
    }

    return _upgradesArray[4] * 60 + enviromentBoost;
}


   public int nineTailsStamina(){ // can be used by naruto only, will lower the stamina and is upgrades with upgrades and as rounds go by, it get's less usefull

       return 10 + 3 * _upgradesArray[6];
   }





public int waterPrisonShark(){ // kisame's attack, bigger upgrade, bigger random number damage, enviroment allows for more sharks attacking
return 5;
}
    public int waterBall(){ //kisame's attack, takes less stamina in water, make's user healing for the next x moves not work at all
        return 30 * _upgradesArray[11];
        }
public int sandArmour(){ // gaara, protection for the next few rounds, takes less stamina if sand enviroment
            return 10;}

 public int quicksand(){ // emore damage when in sand, depends on upgrades
                return 10;
                }
public int amaterasu(){ //does damage, random amount of stamina used
                    return 10;
                    }
public int dimensioncreation(){  // user can't do anything for next x rounds
                        return 10;
                        }

    
    







}
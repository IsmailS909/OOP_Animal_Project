package my_OOP_Code.Players;
import my_OOP_Code.Powers.Eightmoves;

public interface Sauske extends allCharacter{

    public Sauske(int []upgradesArray, int envirmomentChosen) {
        super(upgradesArray, envirmomentChosen);            //TODO Auto-generated constructor stub
    }
    public String toString(){
        return "THese are my special powers: sandArmour and quicksand";
    }
}

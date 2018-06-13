import java.util.Random;
public class Deck{
  int numDealt = 0;
  int dealtCard;
  int[] dealtCards = new int[52];
  boolean numGenSuccess = false;
  Random rand = new Random();
  public Deck(){

  }

  public int dealCard(){
    while(!numGenSuccess){
      dealtCard = rand.nextInt(52) + 1;
      numGenSuccess = true;
      if(numDealt > 0){
        for(int i = 0; i < numDealt; i++){
          if(dealtCards[i] == dealtCard){
            numGenSuccess = false;
          }
        }
      }
    }
    return dealtCard;
  }
}

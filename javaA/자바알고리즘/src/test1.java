import java.util.ArrayList;
import java.util.Collections;


class Blackjack{
  final static int  MAXSIZE=52;
  public static String[] deck={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
  public static String[] shape={"S","H","C","D"};
  public static int playerScore;
  public static int dealerScore;
  public static String[] playerDeck;
  public static String[] dealerDeck;
  public static String[] card=new String[MAXSIZE];

  public String[] makeDeck(){
    for(int i=0; i<MAXSIZE; i++) {
      int rand=(int)(Math.random()*deck.length);
      String temp=deck[rand];
      int rand2=(int)(Math.random()*deck.length);
      String temp2=deck[rand2];
      deck[rand]=temp2;
      deck[rand2]=temp;
      for(int j=0;j<4;j++){
        card[i]=deck[i]+shape[j];
        System.out.print(card[i]+" ");
      }
    }
  }

  // public String[] getPlayerDeck(){
  //   String[] get=
  // }

}


public class test1 extends Blackjack{
  public static void main(String[] args) throws Exception {
      

      



    }
  }


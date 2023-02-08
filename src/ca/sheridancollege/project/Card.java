/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * author @gabrielamoniz Feb 8, 2023
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public abstract class Card {
    //default modifier for child classes
    
    private int value;
    private String suit;
    
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public String getSuit(){
        return this.suit;
    }
    public void setSuit(String suit){
        this.suit = suit;
    }
    

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
  public abstract String toString();

}

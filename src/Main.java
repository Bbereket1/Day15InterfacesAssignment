public class Main {
    /*

    If you have ever played a 2-player fighting game like Street Fighter or Mortal Kombat
    (games where two players select a character and then fight against each other)
    you probably already know that there are certain fighting moves (methods)
    that are available for all characters in the game. For example, a kick and a punch.

    Let's take this concept and apply it to a fantasy game. In this game, there are three
    different kinds of characters: mages, rogues, and knights. Create an Character interface
     with the following methods:

    void rangedAttack() -- an attack your character can perform on an enemy that's far away
    void closeAttack() -- an attack your character can perform on an enemy that's close up
    void specialAttack() -- a special attack your character can perform
    Create the following classes that implement the Character interface

    Mage
    Rogue
    Knight
    Each class should have the following fields along with a constructor and getters/setters

    String name
    String characterType (this should either be Mage, Rogue, or Knight)
    Implement the interface methods to do the following for each character class

    Mage
    rangedAttack() -- print this.name + " firing magic"
    closeAttack() -- print this.name + " staff attack"
    specialAttack() -- print this.name + " magic attack"
    Rogue
    rangedAttack() -- print this.name + " throwing knife"
    closeAttack() -- print this.name + " stabbing with knife"
    specialAttack() -- print this.name + " turning invisible"
    Knight
    rangedAttack() -- print this.name + " throwing shield"
    closeAttack() -- print this.name + " attacking with sword"
    specialAttack() -- print this.name + " stabbing with sword"

     */
    public static void main(String[] args) {
    Knight characterKnight = new Knight("Cammy", "Knight");
    Mage characterMage = new Mage("Ryu", "Mage");
    Rogue characterRogue = new Rogue("Asuka", "Rogue");

    characterKnight.closeAttack();
    characterKnight.rangedAttack();
    characterKnight.specialAttack();
    characterMage.closeAttack();
    characterMage.specialAttack();
    characterMage.rangedAttack();
    characterRogue.specialAttack();
    characterRogue.closeAttack();
    characterRogue.rangedAttack();
    }
}

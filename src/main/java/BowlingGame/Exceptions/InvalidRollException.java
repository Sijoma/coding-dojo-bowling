package BowlingGame.Exceptions;

public class InvalidRollException extends Exception {

    public InvalidRollException(){
        super("That many pins are not in the game! Lousy Cheater!");
    }
}

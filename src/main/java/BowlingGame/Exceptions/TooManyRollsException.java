package BowlingGame.Exceptions;

public class TooManyRollsException extends RuntimeException {
    public TooManyRollsException(){
        super("BowlingGame.Game is already over!");
    }

}

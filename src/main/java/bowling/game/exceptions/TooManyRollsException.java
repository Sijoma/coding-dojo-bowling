package bowling.game.exceptions;

public class TooManyRollsException extends RuntimeException {
    public TooManyRollsException(){
        super("Game is already over!");
    }

}

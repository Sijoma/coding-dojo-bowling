package bowling.game.exceptions;

public class TooManyRollsException extends RuntimeException {
    public TooManyRollsException(){
        super("bowling_game.Game is already over!");
    }

}

import java.util.Arrays;
import java.util.LinkedList;

public class Game {
    private final LinkedList<Frame> frames = new LinkedList<>(Arrays.asList(new Frame()));
    private boolean gameOver = false;
    private final int maxFrames = 10;

    public int getTotalScore() {
        return summariseScore();
    }

    public int summariseScore() {
        int score = 0;
        for (Frame frame : frames) {
           score += frame.getScore();
        }
        return score;
    };


    public void addRoll(int rolledPins) throws Exception{
        Frame currentFrame = this.frames.getLast();
        if(currentFrame.isFinished()){
            currentFrame = this.incrementFrame();
        }

        if(frames.size() < 2) {
            currentFrame.addRoll(rolledPins, null);
        } else {
            Frame previousFrame = frames.get(frames.size() - 2);
            currentFrame.addRoll(rolledPins, previousFrame);
        }

        tooManyRollsCheck();
        gameOverCheck();

    }

    private void gameOverCheck(){
        this.gameOver = this.frames.size() == maxFrames;
    }

    private void tooManyRollsCheck() throws Exception{
        if(this.frames.size() > maxFrames){
            throw new Exception("Game is already over!");
        }
    }

    private Frame incrementFrame(){
        Frame frame;
        if(frames.size() < maxFrames - 1){
            frame = new Frame();
        } else {
            frame = new Frame(true);
        }
        this.frames.add(frame);
        return frame;
    }

    public boolean isOver(){
        return gameOver;
    }

}

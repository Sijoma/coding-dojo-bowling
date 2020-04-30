package bowling.game;

import bowling.game.exceptions.TooManyRollsException;
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


    public void addRoll(int rolledPins) throws TooManyRollsException {
        Frame currentFrame = this.frames.getLast();
        if(currentFrame.isFinished()){
            currentFrame = this.incrementFrame();
        }
        try {
            if (frames.size() < 2) {
                currentFrame.addRoll(rolledPins, null);
            } else {
                Frame previousFrame = frames.get(frames.size() - 2);
                currentFrame.addRoll(rolledPins, previousFrame);
            }
        } catch (Exception e){
            System.out.println("error" + e);
        }

        tooManyRollsCheck();
        gameOverCheck();

    }

    public boolean isOver(){
        return gameOver;
    }

    private void gameOverCheck(){
        this.gameOver = this.frames.size() == maxFrames;
    }

    private void tooManyRollsCheck() throws TooManyRollsException{
        if(this.frames.size() > maxFrames){
            throw new TooManyRollsException();
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



}

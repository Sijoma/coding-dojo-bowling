package bowling.game;

import bowling.game.exceptions.InvalidRollException;

public class Frame {
    private final int[] pinsRolled;
    private int rollCount = 0;
    private int score = 0;
    private int maxPins = 10;
    private boolean lastFrame = false;

    public Frame(){
        this.pinsRolled = new int[2];
    }

    public Frame(boolean lastFrame){
            this.pinsRolled = new int[3];
            this.lastFrame = lastFrame;
    }

    public boolean isFinished(){
        return  (allPinsCleared() && !this.lastFrame) || outOfRolls();
    }

    public void addRoll(int rolledPins, Frame previousFrame) throws InvalidRollException{
        invalidRollCheck(rolledPins);

        if(previousFrame != null){
            calculateBonusPoints(rolledPins, previousFrame);
        }

        setPinsRolled(rolledPins);
    }

    public int getScore(){
        return score;
    }

    private void setPinsRolled(int rolledPins){
        pinsRolled[rollCount] = rolledPins;
        score += rolledPins;
        rollCount +=1;
    }

    private boolean allPinsCleared(){
        return this.pinsRolled[0] + this.pinsRolled[1] == 10;
    }

    private boolean outOfRolls(){
        int maxRolls = 2;
        if(this.lastFrame && allPinsCleared()){
            maxRolls += 1;
        }
        return this.rollCount == maxRolls;
    }

    private void calculateBonusPoints(int rolledPins, Frame previousFrame){
        if(previousFrame.isStrike() && !(rollCount == 2)) {
            previousFrame.score += rolledPins;
        } else if(previousFrame.isSpare() && rollCount == 0 && !lastFrame){
            previousFrame.score += rolledPins;
        }
    }

    private void invalidRollCheck(int rolledPins) throws InvalidRollException{
        if(rolledPins > this.maxPins || (this.rollCount == 1 && pinsRolled[0] + rolledPins > maxPins)){
            throw new InvalidRollException();
        }
    }

    private boolean isStrike(){
        return pinsRolled[0] == 10 && pinsRolled[1] == 0;
    }

    private boolean isSpare(){
        return pinsRolled[0] + pinsRolled[1] == 10;
    }
}

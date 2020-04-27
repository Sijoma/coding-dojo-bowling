import java.util.LinkedList;

public class Game {
    int totalScore = 0;
    private LinkedList<Frame> frames = new LinkedList<>();
    boolean gameOver = false;

    public int getTotalScore() {
        return totalScore;
    }

    public int summariseScore() {
        int score = 0;
        for (Frame frame : frames) {
           score += frame.score;
        }
        return score;
    };


    void addRoll(int rolledPins) throws Exception{
        if(this.frames.isEmpty()){
            this.frames.add(new Frame());
        };

        Frame currentFrame = this.frames.getLast();

        if(currentFrame.isFinished()){
            currentFrame = this.incrementFrame();
        }

        currentFrame.addRoll(rolledPins);
        this.totalScore += addScore(rolledPins);

        if(this.frames.size() > 10){
            throw new Exception("Game is already over!");
        }

        if(this.frames.size() == 10){
            this.gameOver = true;
        }

    }

    int addScore(int rolledPins){
        int totalScoreToAdd = 0;
        if(frames.size() > 1){
            totalScoreToAdd += calculateBonusPoints(rolledPins);
        }
        totalScoreToAdd += rolledPins;
        return totalScoreToAdd;
    }

    int calculateBonusPoints(int rolledPins){
        int bonusPoints = 0;
        Frame currentFrame = frames.getLast();
        Frame previousFrame = frames.get(frames.size() - 2);
        // if the previous Frame was a strike we add the pins
        // to the previous frames score
        if(isStrike(previousFrame) && !(currentFrame.rollCount == 3)) {
            previousFrame.score += rolledPins;
            bonusPoints += rolledPins;
        } else if(isSpare(previousFrame) && currentFrame.rollCount == 1 && !currentFrame.lastFrame){
            // if the previous frame was a spare and its the first roll we add the pins
            previousFrame.score += rolledPins;
            bonusPoints += rolledPins;

        }

        return bonusPoints;
    }

    boolean isStrike(Frame frame){
        return frame.pinsRolled[0] == 10 && frame.pinsRolled[1] == 0;
    }

    boolean isSpare(Frame frame){
        return frame.pinsRolled[0] + frame.pinsRolled[1] == 10;
    }

    Frame incrementFrame(){
        Frame frame;
        if(frames.size() == 9){
            frame = new Frame(true);
        } else {
            frame = new Frame();
        }
        this.frames.add(frame);
        return frame;
    }

    boolean isOver(){
        return gameOver;
    }

}

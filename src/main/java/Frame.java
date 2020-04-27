public class Frame {
    int[] pinsRolled;
    int rollCount = 0;
    int score = 0;
    int maxPins = 10;
    boolean lastFrame = false;

    public Frame(){
        this.pinsRolled = new int[2];
    }

    public Frame(boolean lastFrame){
            this.pinsRolled = new int[3];
            this.lastFrame = true;
    }

    boolean isFinished(){
        return  (allPinsCleared() && !this.lastFrame) || outOfRolls();
    }

    boolean allPinsCleared(){
        return this.pinsRolled[0] + this.pinsRolled[1] == 10;
    }

    boolean outOfRolls(){
        int maxRolls = 2;
        if(this.lastFrame && allPinsCleared()){
            maxRolls += 1;
        }
        return this.rollCount == maxRolls;
    }

    public void addRoll(int pinsRolled) throws Exception{
        if(pinsRolled > this.maxPins || (this.rollCount == 1 && this.pinsRolled[0] + pinsRolled > this.maxPins)){
            throw new Exception("That many pins are not in the game! Lousy Cheater!");
        }
        this.pinsRolled[rollCount] = pinsRolled;
        this.score += pinsRolled;
        this.rollCount +=1;
    }
}

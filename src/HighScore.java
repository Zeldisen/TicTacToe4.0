public class HighScore {
    int point1;
    int point2;

    public HighScore() {
        this.point1 = 0;
        this.point2 = 0;
    }

    /**
     * counts for player 1 score for every winn.
     */
    public void highScore1(){
        point1 = getPoint1()+1;
    }

    /**
     * counts score for player 2 for every winn.
     */
    public void highScore2(){
        point2 = getPoint2()+1;
    }

    /**
     * Prints highscore for player1 and player 2.
     */
    public void highScore(){
        System.out.println("Player 1 highScore: " + getPoint1());
         highScore1();
        System.out.println("Player 2 highScore: " + getPoint2());
        highScore2();
    }


    public int getPoint1() {
        return point1;
    }

    public void setPoint1(int point1) {
        this.point1 = point1;
    }

    public int getPoint2() {
        return point2;
    }

    public void setPoint2(int point2) {
        this.point2 = point2;
    }
}

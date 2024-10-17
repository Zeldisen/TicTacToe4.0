import java.util.Scanner;

public class Meny {
    Scanner scanner = new Scanner(System.in);

    public void backToMeny(){
        menyChoise();
    }
    public void menyChoise(){
        System.out.println("Press 1 to PLAY .");
        System.out.println("Press 2 for game Rules.");
        System.out.println("Press 3 HighScore");
        System.out.println("Press 4 to Qiut ");

        String choise = scanner.nextLine();

        switch (choise){
            case "1":

                Game newGame = new Game("","","","","","","","","");
                newGame.gamePlay();
                break;
            case "2":
                Rules myRules = new Rules();
                  myRules.gameRules();
                  menyChoise();
                break;
            case "3":
                HighScore newHighScore = new HighScore();
                newHighScore.highScore();
                menyChoise();
                break;
            case "4":

                System.out.println("Thanks for checking in! welcome back anytime!");
                
                break;
        }
    }
}

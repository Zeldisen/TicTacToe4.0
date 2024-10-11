public class Rules {
    /**
     * Method prints rules for the game.
     */
    public void gameRules(){
        System.out.println("Rules for the game:");
        System.out.println("The game has 9 places to place game pieces on.");
        System.out.println("Game pieces player 1 =  X player 2 =  O.");
        System.out.println("If a place is already taken, you are not allowed to place your game piece on that space.");
        System.out.println("Only numbers between 1-9 are allowed, if you press a letter have you used your turn and the turn goes to the next player.");
        System.out.println("Only numbers between 1-9 are allowed, if you press a higher number have you used your turn and the turn goes to the next player.");
        System.out.println("When a player winns, you can restart the game by the meny.");
        System.out.println("If no player winn, you can restart the game by the meny");
        System.out.println("possible winns , showes 8 diffrent scenarios how to winn");
        possibleWinns();
    }

    /**
     * Prints diffrents winner scenarios
     */
    public void possibleWinns(){
        System.out.println("| 1 | 1 | 1 | ");
        System.out.println("-------------");
        System.out.println("| 2 | 2 | 2 | ");
        System.out.println("-------------");
        System.out.println("| 3 | 3 | 3 | ");
        System.out.println("-------------");
        System.out.println();
        System.out.println("| 4 | 5 | 6 | ");
        System.out.println("-------------");
        System.out.println("| 4 | 5 | 6 | ");
        System.out.println("-------------");
        System.out.println("| 4 | 5 | 6 | ");
        System.out.println("-------------");
        System.out.println();
        System.out.println("| 7 |   | 8 | ");
        System.out.println("-------------");
        System.out.println("|  | 7/8 |  | ");
        System.out.println("-------------");
        System.out.println("| 8 |   | 7 | ");
        System.out.println("-------------");
        System.out.println();

    }
}

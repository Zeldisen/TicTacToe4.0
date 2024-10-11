import java.util.Scanner;

public class Game {
    String index1 = "1";
    String index2 = "2";
    String index3 = "3";
    String index4 = "4";
    String index5 = "5";
    String index6 = "6";
    String index7 = "7";
    String index8 = "8";
    String index9 = "9";
    String player1;
    String player2;
    String player1Name;
    String player2Name;
    String winner;


    public Game(String index1, String index2, String index3, String index4,
                String index5, String index6, String index7, String index8, String index9) {
        this.index1 = index1;
        this.index2 = index2;
        this.index3 = index3;
        this.index4 = index4;
        this.index5 = index5;
        this.index6 = index6;
        this.index7 = index7;
        this.index8 = index8;
        this.index9 = index9;
        this.player1 = "X";
        this.player2 = "O";
        this.winner = "losers";


    }
    HighScore myHighscore = new HighScore(0,0);

    public Game(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    /**
     * Method for the game board
     */

    public void newGameBoard() {

        System.out.println("| " + index1 + " | " + index2 + " | " + index3 + " | ");
        System.out.println("-------------");
        System.out.println("| " + index4 + " | " + index5 + " | " + index6 + " | ");
        System.out.println("-------------");
        System.out.println("| " + index7 + " | " + index8 + " | " + index9 + " | ");
        System.out.println("-------------");
        System.out.println();


    }

    /**
     * Mehtod to reset game board after somone winns
     */
    public void setGameBoard() {
        setIndex1("");
        setIndex2("");
        setIndex3("");
        setIndex4("");
        setIndex5("");
        setIndex6("");
        setIndex7("");
        setIndex8("");
        setIndex9("");


    }

    private void setIndex1(String s) {
    }


    /**
     * Method for the hole game
     */
    public void gamePlay() {

        Scanner scanner = new Scanner(System.in);

        int count = 0;  // Variable for count number of turns of the loop.
        for (int i = 0; i < 5; i++) {
            checkWinner();

            String input = "1";

            if (input.matches("\\d+")) {
                int intvalue = Integer.parseInt(input);
                System.out.println(intvalue);
            } else {
                System.out.println("wrong");
                gamePlay();
            }

            System.out.println(player1Name + " place your gamepiece " + player1 + " between the numbers 1-9: ");
            input = scanner.nextLine();

            player1 = "X";

// bunch of ifs that copmares inputs with index, and controls that it i`nt already taken.
            if (input.equals("1")) {
                getIndex1();
                if (index1.equals("O")) {
                    System.out.println("invalid choise! ");
                    setIndex1(player2);
                } else
                    setIndex1(getPlayer1());

                newGameBoard();
            } else if (input.equals("2")) {
                getIndex2();
                if (index2.equals("O")) {
                    System.out.println("invalid choise! ");
                    setIndex2(player2);
                } else
                    setIndex2(getPlayer1());

                newGameBoard();

            } else if (input.equals("3")) {
                getIndex3();
                if (index3.equals("O")) {
                    System.out.println("invalid choise! ");
                    setIndex3(player2);
                } else
                    setIndex3(getPlayer1());

                newGameBoard();
            } else if (input.equals("4")) {
                getIndex4();
                if (index4.equals("O")) {
                    System.out.println("invalid choise! ");
                    setIndex4(player2);
                } else
                    setIndex4(getPlayer1());

                newGameBoard();
            } else if (input.equals("5")) {
                getIndex5();
                if (index5.equals("O")) {
                    System.out.println("invalid choise! ");
                    setIndex5(player2);
                } else
                    setIndex5(getPlayer1());

                newGameBoard();
            } else if (input.equals("6")) {
                getIndex6();
                if (index6.equals("O")) {
                    System.out.println("invalid choise! ");
                    setIndex6(player2);
                } else
                    setIndex6(getPlayer1());

                newGameBoard();
            } else if (input.equals("7")) {
                if (index7.equals("O")) {
                    System.out.println("invalid choise! ");
                    setIndex7(player2);
                } else
                    setIndex7(getPlayer1());

                newGameBoard();
            } else if (input.equals("8")) {
                if (index8.equals("O")) {
                    System.out.println("invalid choise! ");
                    setIndex8(player2);
                } else
                    setIndex8(getPlayer1());

                newGameBoard();
            } else if (input.equals("9")) {
                if (index9.equals("O")) {
                    System.out.println("invalid choise! ");
                    setIndex9(player2);
                } else
                    setIndex9(getPlayer1());

                newGameBoard();
            }

            System.out.println(player2Name + " place your gamepiece " + getPlayer2() + " between the numbers 1-9: ");
            input = scanner.nextLine();
            player2 = "O";
            if (input.equals("1")) {
                getIndex1();
                if (index1.equals("X")) {
                    System.out.println("invalid choise! ");
                    setIndex1(player1);
                } else
                    setIndex1(getPlayer2());

                newGameBoard();
            } else if (input.equals("2")) {
                getIndex2();
                if (index2.equals("X")) {
                    System.out.println("invalid choise! ");
                    setIndex2(player1);
                } else
                    setIndex2(getPlayer2());

                newGameBoard();
            } else if (input.equals("3")) {
                getIndex3();
                if (index3.equals("X")) {
                    System.out.println("invalid choise! ");
                    setIndex3(player1);
                } else
                    setIndex3(getPlayer2());

                newGameBoard();
            } else if (input.equals("4")) {
                getIndex4();
                if (index4.equals("X")) {
                    System.out.println("invalid choise! ");
                    setIndex4(player1);
                } else
                    setIndex4(getPlayer2());

                newGameBoard();
            } else if (input.equals("5")) {
                getIndex5();
                if (index5.equals("X")) {
                    System.out.println("invalid choise! ");
                    setIndex5(player1);
                } else
                    setIndex5(getPlayer2());

                newGameBoard();
            } else if (input.equals("6")) {
                getIndex6();
                if (index6.equals("X")) {
                    System.out.println("invalid choise! ");
                    setIndex6(player1);
                } else
                    setIndex6(getPlayer2());

                newGameBoard();
            } else if (input.equals("7")) {
                getIndex7();
                if (index7.equals("X")) {
                    System.out.println("invalid choise! ");
                    setIndex7(player1);
                } else
                    setIndex7(getPlayer2());

                newGameBoard();
            } else if (input.equals("8")) {
                getIndex8();
                if (index8.equals("X")) {
                    System.out.println("invalid choise! ");
                    setIndex8(player1);
                } else
                    setIndex8(getPlayer2());

                newGameBoard();
            } else if (input.equals("9")) {
                getIndex9();
                if (index9.equals("X")) {
                    System.out.println("invalid choise! ");
                    setIndex9(player1);
                } else
                    setIndex9(getPlayer2());

                newGameBoard();
            }
            if (input.equals("10")) {
                System.out.println("Invalid choise, the number is to big! Only 1-9");
            }


            count = count + 1;//counts loop to check the gamebord for method losers.
            if (count == 5) {
                losers();

            }
        }




    }

    /**
     * Method that checks and prints if nobody winns.
     */
    public void losers() {

        if (winner == player1 || winner == player2) {
            System.out.println("Winner is player1");
            //myHighscore.highScore();
            getWinner();
        } else {
            System.out.println("Nobody winns, try again!");
            setGameBoard();
            gamePlay();
        }


    }

    /**
     * Method to check winner scenario, when it`s finds a winner you go back to meny.
     */
    public void checkWinner() {

        if (index1 == "X" && index2 == "X" && index3 == "X") {
            getIndex1();
            getIndex2();
            getIndex3();
            setWinner(player1);
            System.out.println("Player 1 winns! Congrats!!");
            myHighscore.highScore1();
            setGameBoard();
            gamePlay();
        } else if (index1 == "X" && index5 == "X" && index9 == "X") {
            getIndex1();
            getIndex5();
            getIndex9();
            setWinner(player1);
            System.out.println("Player 1 winns! Congrats!!");
            myHighscore.highScore1();
            setGameBoard();
            gamePlay();
        } else if (index3 == "X" && index5 == "X" && index7 == "X") {
            getIndex3();
            getIndex5();
            getIndex7();
            setWinner(player1);
            System.out.println("Player 1 winns! Congrats!!");
            myHighscore.highScore1();
            setGameBoard();
            gamePlay();
        } else if (index1 == "X" && index4 == "X" && index7 == "X") {
            getIndex1();
            getIndex4();
            getIndex7();
            setWinner(player1);
            System.out.println("Player 1 winns! Congrats!!");
            myHighscore.highScore1();
            setGameBoard();
            gamePlay();
        } else if (index3 == "X" && index6 == "X" && index9 == "X") {
            getIndex3();
            getIndex6();
            getIndex9();
            setWinner(player1);
            System.out.println("Player 1 winns! Congrats!!");
            myHighscore.highScore1();
            setGameBoard();
            gamePlay();
        } else if (index4 == "X" && index5 == "X" && index6 == "X") {
            getIndex4();
            getIndex5();
            getIndex6();
            setWinner(player1);
            System.out.println("Player 1 winns! Congrats!!");
            myHighscore.highScore1();
            setGameBoard();
            gamePlay();
        } else if (index2 == "X" && index5 == "X" && index8 == "X") {
            getIndex2();
            getIndex5();
            getIndex8();
            setWinner(player1);
            System.out.println("Player 1 winns! Congrats!!");
            myHighscore.highScore1();
            setGameBoard();
            gamePlay();
        } else if (index7 == "X" && index8 == "X" && index9 == "X") {
            getIndex7();
            getIndex8();
            getIndex9();
            setWinner(player1);
            System.out.println("Player 1 winns! Congrats!!");
            myHighscore.highScore1();
            setGameBoard();
            gamePlay();
        }
        if (index1 == "O" && index2 == "O" && index3 == "O") {
            getIndex1();
            getIndex2();
            getIndex3();
            setWinner(player2);
            System.out.println("Player 2 winns! Congrats!!");
            myHighscore.highScore2();
            setGameBoard();
            gamePlay();
        } else if (index1 == "O" && index5 == "O" && index9 == "O") {
            getIndex1();
            getIndex5();
            getIndex9();
            setWinner(player2);
            System.out.println("Player 2 winns! Congrats!!");
            myHighscore.highScore2();
            setGameBoard();
            gamePlay();
        } else if (index3 == "O" && index5 == "O" && index7 == "O") {
            getIndex3();
            getIndex5();
            getIndex7();
            setWinner(player2);
            System.out.println("Player 2 winns! Congrats!!");
            myHighscore.highScore2();
            setGameBoard();
            gamePlay();

        } else if (index1 == "O" && index4 == "O" && index7 == "O") {
            getIndex1();
            getIndex4();
            getIndex7();
            setWinner(player2);
            System.out.println("Player 2 winns! Congrats!!");
            myHighscore.highScore2();
            setGameBoard();
            gamePlay();
        } else if (index3 == "O" && index6 == "O" && index9 == "O") {
            getIndex3();
            getIndex6();
            getIndex9();
            setWinner(player2);
            System.out.println(player1Name + " winns! Congrats!!");
            myHighscore.highScore2();
            setGameBoard();
            gamePlay();
        } else if (index4 == "O" && index5 == "O" && index6 == "O") {
            getIndex4();
            getIndex5();
            getIndex6();
            setWinner(player2);
            System.out.println("Player 2 winns! Congrats!!");
            myHighscore.highScore2();
            setGameBoard();
            gamePlay();
        } else if (index2 == "O" && index5 == "O" && index8 == "O") {
            getIndex2();
            getIndex5();
            getIndex8();
            setWinner(player2);
            System.out.println("Player 2 winns! Congrats!!");
            myHighscore.highScore2();
            setGameBoard();
            gamePlay();
        } else if (index7 == "O" && index8 == "O" && index9 == "O") {
            getIndex7();
            getIndex8();
            getIndex9();
            setWinner(player2);
            System.out.println(player2Name + " winns! Congrats!!");
            myHighscore.highScore2();
            setGameBoard();
            gamePlay();
        }



















    }

    public String getIndex1() {
        return index1;
    }

    public HighScore getMyHighscore() {
        return myHighscore;
    }

    public void setMyHighscore(HighScore myHighscore) {
        this.myHighscore = myHighscore;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }
    public String getPlayer1() {
        return "X";
    }

    public String getPlayer2() {
        return "O";
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getIndex9() {
        return index9;
    }

    public void setIndex9(String index9) {
        this.index9 = index9;
    }

    public String getIndex8() {
        return index8;
    }

    public void setIndex8(String index8) {
        this.index8 = index8;
    }

    public String getIndex7() {
        return index7;
    }

    public void setIndex7(String index7) {
        this.index7 = index7;
    }

    public String getIndex6() {
        return index6;
    }

    public void setIndex6(String index6) {
        this.index6 = index6;
    }

    public String getIndex5() {
        return index5;
    }

    public void setIndex5(String index5) {
        this.index5 = index5;
    }

    public String getIndex4() {
        return index4;
    }

    public void setIndex4(String index4) {
        this.index4 = index4;
    }

    public String getIndex3() {
        return index3;
    }

    public void setIndex3(String index3) {
        this.index3 = index3;
    }

    public String getIndex2() {
        return index2;
    }

    public void setIndex2(String index2) {
        this.index2 = index2;
    }
}


import java.util.Scanner;

public class Players extends Game{
    public Players(String player1Name, String player2Name) {
        super(player1Name,player2Name);
    }
    public void namePlayers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1 please enter your name: ");
        player1Name = sc.nextLine();
        System.out.println("Player 2 please enter your name: ");
        player2Name = sc.nextLine();
        System.out.println();
        gamePlay();
    }
}

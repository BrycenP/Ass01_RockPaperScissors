import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String cont = "Y";

        do {
            System.out.print("Player A, what is your move [please use R,P,or S]");
            playerA = in.next();

            System.out.print("Player B, what is your move [please use R,P,or S]");
            playerB = in.next();

            if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("r")) {
                System.out.println("Rock vs Rock is a tie");
            } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("r")) {
                System.out.println("Paper covers Rock, Player A wins");
            } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("r")) {
                System.out.println("Rock breaks Scissors, Player B wins");
            } else if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("p")) {
                System.out.println("Paper covers Rock, Player B wins");
            } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("p")) {
                System.out.println("Paper vs Paper is a tie");
            } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("p")) {
                System.out.println("Scissors cut Paper, player A wins");
            } else if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("s")) {
                System.out.println("Rock breaks Scissors, Player A wins");
            } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("s")) {
                System.out.println("Scissors cut Paper, Player B wins");
            } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("s")) {
                System.out.println("Scissors vs Scissors is a tie");
            } else {
                System.out.println("Someone gave an invalid answer please use 'R', 'P', or 'S'");
            }
            System.out.print("Would you like to play again? [chose Y for yes and N for no]");
            cont = in.next();
        } while (cont.equalsIgnoreCase("y"));
    }
}
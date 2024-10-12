public class Main {
    public static void main(String[] args) {
        String playerA = ""
        String playerB = ""
        String continue = "Y"

        do
        {
            System.out.println( "Player A, what is your move [please use R,P,or S]");
        input playerA
        OUTPUT "Player B, what is your move [please use R,P, or S]
        input playerB

        if playerA == "R" AND playerB == "R" then
        OUTPUT "Rock vs Rock is a tie"
			else if playerA == "P" AND playerB == "R" then
        OUTPUT "Paper beats Rock, Player A wins"
			else if playerA == "S" AND playerB == "R" then
        OUTPUT "Rock breaks Scissors, Player B wins"
			else if playerA == "R" AND playerA == "P" then
        OUTPUT "Paper beats Rock, Player B wins"
			else if playerA == "P" AND playerB == "P" then
        OUTPUT "Paper vs Paper is a tie"
			else if playerA == "S" AND playerB == "P" then
        OUTPUT "Scissors cut Paper, player A wins"
			else if playerA == "R" AND playerB == "S" then
        OUTPUT "Rock breaks Scissors, Player A wins"
			else if playerA == "P" AND playerB == "S" then
        OUTPUT "Scissors cut Paper, Player B wins"
			else if playerA == "S" AND playerB == "S" then
        OUTPUT "Scissors vs Scissors is a tie"
			else
        OUTPUT "Someone gave an ivalid answer please use 'R', 'P', or 'S'"
        OUTPUT "Would you like to play again? [chose Y for yes and N for no]"
        INPUT continue
        while (continue.equals "Y")
    }
}
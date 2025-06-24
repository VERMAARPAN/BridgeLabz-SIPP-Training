import java.util.Scanner;

class RockPaperScissors {
    public static String getComputerChoice() {
        int rand = (int) (Math.random() * 3); // 0,1,2
        switch (rand) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "rock";
        }
    }

    public static String findWinner(String playerChoice, String computerChoice) {
        playerChoice = playerChoice.toLowerCase();
        computerChoice = computerChoice.toLowerCase();

        if (playerChoice.equals(computerChoice)) {
            return "Draw";
        }
        if (playerChoice.equals("rock") && computerChoice.equals("scissors")) return "Player";
        if (playerChoice.equals("scissors") && computerChoice.equals("rock")) return "Computer";
        if (playerChoice.equals("paper") && computerChoice.equals("rock")) return "Player";
        if (playerChoice.equals("rock") && computerChoice.equals("paper")) return "Computer";

        if (playerChoice.equals("scissors") && computerChoice.equals("paper")) return "Player";
        if (playerChoice.equals("paper") && computerChoice.equals("scissors")) return "Computer";

        return "Draw";
    }
    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        int draws = totalGames - playerWins - computerWins;

        double playerWinPercent = totalGames > 0 ? (playerWins * 100.0) / totalGames : 0;
        double computerWinPercent = totalGames > 0 ? (computerWins * 100.0) / totalGames : 0;
        double drawPercent = totalGames > 0 ? (draws * 100.0) / totalGames : 0;

        String[][] stats = new String[5][2];
        stats[0][0] = "Total Games";
        stats[0][1] = Integer.toString(totalGames);

        stats[1][0] = "Player Wins";
        stats[1][1] = playerWins + " (" + String.format("%.2f", playerWinPercent) + "%)";

        stats[2][0] = "Computer Wins";
        stats[2][1] = computerWins + " (" + String.format("%.2f", computerWinPercent) + "%)";

        stats[3][0] = "Draws";
        stats[3][1] = draws + " (" + String.format("%.2f", drawPercent) + "%)";

        stats[4][0] = "Winning Percentage Difference";
        stats[4][1] = String.format("%.2f", Math.abs(playerWinPercent - computerWinPercent)) + "%";

        return stats;
    }
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame\tPlayer Choice\tComputer Choice\tWinner");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\n",
                    (i + 1),
                    capitalize(gameResults[i][0]),
                    capitalize(gameResults[i][1]),
                    gameResults[i][2]);
        }

        System.out.println("\nStatistics:");
        System.out.println("-------------------------");
        for (String[] stat : stats) {
            System.out.printf("%-25s : %s\n", stat[0], stat[1]);
        }
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine();

        String[][] gameResults = new String[numGames][3]; 

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < numGames; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (rock, paper, scissors): ");
            String playerChoice = scanner.nextLine().trim().toLowerCase();
            while (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.print("Invalid choice! Please enter rock, paper, or scissors: ");
                playerChoice = scanner.nextLine().trim().toLowerCase();
            }

            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;

            gameResults[i][0] = playerChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(playerWins, computerWins, numGames);

        displayResults(gameResults, stats);
    }
}

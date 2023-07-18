public class MainInterface {
    public void gameTitle() {
        System.out.println("\t\t   _____ _        _____            _____          ");
        System.out.println("\t\t  |_   _(_)      |_   _|          |_   _|         ");
        System.out.println("\t\t    | |  _  ___    | | __ _  ___    | | ___   ___  ");
        System.out.println("\t\t    | | | |/ __|   | |/ _` |/ __|   | |/ _ \\ / _ \\ ");
        System.out.println("\t\t    | | | | (__    | | (_| | (__    | | (_) |  __/");
        System.out.println("\t\t    \\_/ |_|\\___|   \\_/\\__,_|\\___|   \\_/\\___/ \\___|\n");
        for (int i = 0; i < 21; i++) {
            System.out.print("****");
        }
        System.out.println();
    }

    public void mainMenu() {
        System.out.println("\n[1]\tPlay against Human");
        System.out.println("[2]\tPlay against CPU");
        System.out.println("[3]\tExit");
        System.out.print("\nEnter Number: ");
    }

    public void matchHuman() {
        whiteSpace();
        System.out.println("Player 1: " + TicTacToe.player1Score);
        System.out.println("Player 2: " + TicTacToe.player2Score);
        table();
    }

    public void matchCpu() {
        whiteSpace();
        System.out.println("Player 1: " + TicTacToe.player1Score);
        System.out.println("[CPU] AL: " + TicTacToe.player2Score);
        table();
    }

    public void table() {
        System.out.println("\n[ " + TicTacToe.gameTable[0][0] + " ]\t" + "[ " + TicTacToe.gameTable[0][1] + " ]\t" + "[ " + TicTacToe.gameTable[0][2] + " ]  ");
        System.out.println("\n[ " + TicTacToe.gameTable[1][0] + " ]\t" + "[ " + TicTacToe.gameTable[1][1] + " ]\t" + "[ " + TicTacToe.gameTable[1][2] + " ]  ");
        System.out.println("\n[ " + TicTacToe.gameTable[2][0] + " ]\t" + "[ " + TicTacToe.gameTable[2][1] + " ]\t" + "[ " + TicTacToe.gameTable[2][2] + " ]  ");
        
        if (TicTacToe.error) {
            System.out.println("\n\nERROR: That place already has a value.");
            System.out.print("Enter coordinate (i.e. A1): ");
        } else {
            System.out.print("\n\nEnter coordinate (i.e. A1): ");
        }
        TicTacToe.error = false;
    }

    public void whiteSpace() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    }
}

import java.util.Scanner;

public class TicTacToe {
    Scanner sc = new Scanner(System.in);
    public static String[][] gameTable = {  {"_","_","_"},
                                            {"_","_","_"},
                                            {"_","_","_"}};

    public static boolean firstCondition = false;
    public static boolean secondCondition = false;

    public static byte menuSelection;
    public static int player1Score = 0;
    public static int player2Score = 0;
    private static byte turns = 2;
    public static boolean error = false;
    
    public void menuFail() {
        MainInterface mainInterface = new MainInterface();
        Brain brain = new Brain();


        mainInterface.gameTitle();
        System.out.println("ERROR: Not in the selection.");
        mainInterface.mainMenu();
        brain.menuSelection();
    }

    public void matchHuman() {
        MainInterface mainInterface = new MainInterface();
        mainInterface.matchHuman();
    }

    public void matchCpu() {
        MainInterface mainInterface = new MainInterface();
        mainInterface.matchCpu();
    }

    public void coordinate(int x, int y) {
        MainInterface mainInterface = new MainInterface();
        Brain brain = new Brain();
        Result result = new Result();

        x=x-1;
        y=y-1;

        if (gameTable[x][y] == "_") {
            if (turns%2==0) {
                gameTable[x][y] = "O";
            } else if (turns%2==1) {
                gameTable[x][y] = "X";
            }
            result.main(x, y);

            continuation();
        } else {
            error = true;
            mainInterface.table();
            brain.human();
        }
    }

    public void cpuCoord(int x, int y) {
        MainInterface mainInterface = new MainInterface();
        Brain brain = new Brain();
        Result result = new Result();
        Cpu cpu = new Cpu();

        x=x-1;
        y=y-1;

        if (gameTable[x][y] == "_") {
            gameTable[x][y] = "O";
            result.main(x, y);

            cpu.notHuman();
            result.main(x, y);
            continuationCpu();
        } else {
            error = true;
            mainInterface.table();
            brain.cpu();
        }
    }

    public static void continuation() {
        turns++;
        Brain brain = new Brain();
        while (!firstCondition && !secondCondition) {
            brain.human();
        }
    }

    public static void continuationCpu() {
        Brain brain = new Brain();
        while (!firstCondition && !secondCondition) {
            brain.cpu();
        }
    }

    public void win() {
        Brain brain = new Brain();
        if (turns%2==0) {
            player1Score = player1Score + 1;
            System.out.println("\nPlayer 1 Wins!");
        } else if (turns%2==1) {
            player2Score = player2Score + 1;
            System.out.println("\nPlayer 2 Wins!");
        }

        System.out.print("\n\nContinue? [Y/N]: ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            for (int i = 0; i < gameTable.length; i++) {
                for (int j = 0; j < gameTable[i].length; j++) {
                    gameTable[i][j] = "_";
                }
            }
            reset();
            brain.human();
        } else {
            System.out.println("Thanks for Playing!");
        }
    }

    public void winCpu() {
        Brain brain = new Brain();
        if (turns%2==0) {
            player1Score = player1Score + 1;
            System.out.println("\nPlayer 1 Wins!");
        } else if (turns%2==1) {
            player2Score = player2Score + 1;
            System.out.println("\nPlayer 2 Wins!");
        }

        System.out.print("\n\nContinue? [Y/N]: ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            for (int i = 0; i < gameTable.length; i++) {
                for (int j = 0; j < gameTable[i].length; j++) {
                    gameTable[i][j] = "_";
                }
            }
            reset();
            brain.cpu();
        } else {
            System.out.println("Thanks for Playing!");
            System.exit(0);
        }
    }

    private void draw() {
        Brain brain = new Brain();
        System.out.print("\n\nDraw! Continue? [Y/N]: ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            for (int i = 0; i < gameTable.length; i++) {
                for (int j = 0; j < gameTable[i].length; j++) {
                    gameTable[i][j] = "_";
                }
            }
            reset();
            if (menuSelection==1) {
                brain.human();
            } else if (menuSelection==2) {
                brain.cpu();
            }
        } else {
            System.out.println("Thanks for Playing!");
            System.exit(0);
        }
    }

    private void reset() {
        firstCondition = false;
        secondCondition = false;
        turns = 2;
        error = false;
    }

    public static void main(String[] args) {
        MainInterface mainInterface = new MainInterface();
        mainInterface.gameTitle();
        mainInterface.mainMenu();
        
        Brain brain = new Brain();
        brain.menuSelection();
    }
}
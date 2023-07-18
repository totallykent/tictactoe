import java.util.Scanner;

public class Brain extends TicTacToe {
    Scanner sc = new Scanner(System.in);
    TicTacToe tictactoe = new TicTacToe();

    public void menuSelection() {
        menuSelection = sc.nextByte();
        sc.nextLine();
        if (menuSelection > 3 || menuSelection <= 0) {
            tictactoe.menuFail();
        } else if (menuSelection == 1) {
            human();
        } else if (menuSelection == 2) {
            cpu();
        } else if (menuSelection == 3) {
            System.out.println("\nGoodbye...");
            System.exit(0);
        }
    }

    public void human() {
        tictactoe.matchHuman();

        String input = sc.nextLine();
        char letter = input.toUpperCase().charAt(0);
        int number = Integer.parseInt(input.substring(1));
        tictactoe.coordinate(conversion(letter), number);
    }

    public void cpu() {
        tictactoe.matchCpu();
    
        String input = sc.nextLine();
        char letter = input.toUpperCase().charAt(0);
        int number = Integer.parseInt(input.substring(1));
        tictactoe.cpuCoord(conversion(letter), number);
    }

    public static int conversion(char character) {
        int numericValue;
        switch (character) {
            case 'A':
                numericValue = 1;
                break;
            case 'B':
                numericValue = 2;
                break;
            case 'C':
                numericValue = 3;
                break;
            default:
                numericValue = -1;
                break;
        }
        return numericValue;
    }
}

public class Result extends TicTacToe{

    public void main(int x, int y) {
        for (int row = 0; row < 3; row++) {
            if (gameTable[row][0] == gameTable[x][y] && gameTable[row][1] == gameTable[x][y] && gameTable[row][2] == gameTable[x][y]) {
                firstCondition=true;
                secondCondition=true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (gameTable[0][col] == gameTable[x][y] && gameTable[1][col] == gameTable[x][y] && gameTable[2][col] == gameTable[x][y]) {
                firstCondition=true;
                secondCondition=true;
            }
        }

        // Check diagonals
        if (gameTable[0][0] == gameTable[x][y] && gameTable[1][1] == gameTable[x][y] && gameTable[2][2] == gameTable[x][y]) {
            firstCondition=true;
            secondCondition=true;
        } else if (gameTable[0][2] == gameTable[x][y] && gameTable[1][1] == gameTable[x][y] && gameTable[2][0] == gameTable[x][y]) {
            firstCondition=true;
            secondCondition=true;
        }

        if (firstCondition&&secondCondition) {
            System.out.println("\n[ " + TicTacToe.gameTable[0][0] + " ]\t" + "[ " + TicTacToe.gameTable[0][1] + " ]\t" + "[ " + TicTacToe.gameTable[0][2] + " ]  ");
            System.out.println("\n[ " + TicTacToe.gameTable[1][0] + " ]\t" + "[ " + TicTacToe.gameTable[1][1] + " ]\t" + "[ " + TicTacToe.gameTable[1][2] + " ]  ");
            System.out.println("\n[ " + TicTacToe.gameTable[2][0] + " ]\t" + "[ " + TicTacToe.gameTable[2][1] + " ]\t" + "[ " + TicTacToe.gameTable[2][2] + " ]  ");
            if (TicTacToe.menuSelection==1) {
                win();
            } else if (TicTacToe.menuSelection==2) {
                winCpu();
            }
        } else {
            firstCondition = false;
            secondCondition = false;
        }
    }
}

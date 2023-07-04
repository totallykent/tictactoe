public class Result extends TicTacToe{
    public void main(int row, int column) {
        Checker checker = new Checker(row, column);
        // Cross Checking: up, down, left, right
        if (row == 0) {
            checker.down();
            if (column == 0) {
                checker.right();
                checker.bottomRight();
                checker.bottomRightCorner();
            } else if (column == 2) {
                checker.left();
                checker.bottomLeft();
                checker.bottomLeftCorner();
            } else {
                checker.bottomLeft();
                checker.bottomRight();
                checker.right();
                checker.left();
            }

        } else if (row == 1) {
            checker.up();
            checker.down();
            if (column == 0) {
                checker.right();
                checker.bottomRight();
            } else if (column == 2) {
                checker.left();
                checker.bottomLeft();
            } else {
                checker.bottomLeft();
                checker.bottomRight();
                checker.right();
                checker.left();
            }

        } else if (row == 2) {
            checker.up();
            if (column == 0) {
                checker.right();
                checker.topRight();
                checker.topRightCorner();
            } else if (column == 2) {
                checker.left();
                checker.topLeft();
                checker.topLeftCorner();
            } else {
                checker.topLeft();
                checker.topRight();
                checker.right();
                checker.left();
            }
        }

        if (firstCondition&&secondCondition) {
            System.out.println("Totallykent note: This move won the game, let the player know that they won the game. Any method work as long as it takes the player to the menu screen asking if they want to play again. It is okay to change some of the code in here, like create new method to alert");
        } else {
            firstCondition = false;
            secondCondition = false;
        }
    }
}

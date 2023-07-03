public class Result extends TicTacToe{
    public void main(int row, int column) {
        System.out.println(row);
        
        Checker checker = new Checker(row, column);
        if (row == 0) {
            if (column == 0) {
                checker.right();
                checker.down();
            } else if (column == 2) {
                checker.left();
                checker.down();
            }
        } else if (row == 2) {
            if (column == 0) {
                checker.right();
                checker.up();
            } else if (column == 2) {
                checker.left();
                checker.up();
            }
        } else {
            checker.up();
            checker.down();
            checker.left();
            checker.right();
        }
    }
}

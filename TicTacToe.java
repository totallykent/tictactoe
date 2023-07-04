public class TicTacToe {
    public static String[][] gameTable = {  {"O","_","X"},
                                            {"O","X","_"},
                                            {"X","_","_"}}; // You change the table to the default

    public static boolean firstCondition = false;
    public static boolean secondCondition = false;  // if these two conditions become true, a winner is decided

    public static void main(String[] args) {
        Result result = new Result();

        // Must receive in this format: (0,1). Convert it from A1 or B3
        // Remove this test codes and replace with user input
        result.main(0,0);
        result.main(1,1);
        result.main(1,0);
        result.main(0,2);
        result.main(2,0);
    }
}
public class TicTacToe {
    public static String[][] gameTable = {{"A","0","0"},{"B","0","0"},{"C","0","0"}};
    public static void main(String[] args) {
        Result result = new Result();

        // Dapat ang madawat nako kay mga (0,1), ikaw convert ana from A1
        result.main(0,1);
        result.main(0,2);
        result.main(0,3);
    }
}
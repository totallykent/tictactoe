public class TicTacToe {
    public static void main(String[] args) {
        String[][] gameTable = {{"0","0","0"},{"0","0","0"},{"0","0","0"}};
        MainMenu mainMenu = new MainMenu();

        mainMenu.main(gameTable);
    }
}
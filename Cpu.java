import java.util.Random;

public class Cpu extends TicTacToe {
    public void notHuman() {
        Random random = new Random();
        int x = random.nextInt(3);
        int y = random.nextInt(3);

        while (gameTable[x][y] != "_") {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }

        gameTable[x][y] = "X";
    }
}

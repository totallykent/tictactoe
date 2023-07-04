public class Checker extends Result{
    private static int x;
    private static int y;

    public Checker(int row, int column) {
        this.y = row;
        this.x = column;
    }
    
    public static void connected() {
        if (!firstCondition) {
            firstCondition = true;
        } else if (firstCondition) {
            secondCondition = true;
        }
    }

    public void left() {
        if (gameTable[y][x-1] == gameTable[y][x]) {
            connected();
        }
    }

    public void right() {
        if (gameTable[y][x+1] == gameTable[y][x]) {
            connected();
        }
    }

    public void up() {
        if (gameTable[y-1][x] == gameTable[y][x]) {
            connected();
        }
    }

    public void down() {
        if (gameTable[y+1][x] == gameTable[y][x]) {
            connected();
        }
    }

    public void topLeft() {
        if (gameTable[y-1][x-1] == gameTable[y][x]) {
            connected();
        }
    }

    public void topRight() {
        if (gameTable[y-1][x+1] == gameTable[y][x]) {
            connected();
        }
    }

    public void bottomLeft() {
        if (gameTable[y+1][x-1] == gameTable[y][x]) {
            connected();
        }
    }

    public void bottomRight() {
        if (gameTable[y+1][x+1] == gameTable[y][x]) {
            connected();
        }
    }

    public void bottomRightCorner() {
        if (gameTable[y+2][x+2] == gameTable[y][x]) {
            connected();
        }
    }

    public void bottomLeftCorner() {
        if (gameTable[y+2][x-2] == gameTable[y][x]) {
            connected();
        }
    }
    
    public void topRightCorner() {
        if (gameTable[y-2][x+2] == gameTable[y][x]) {
            connected();
        }
    }

    public void topLeftCorner() {
        if (gameTable[y-2][x-2] == gameTable[y][x]) {
            connected();
        }
    }
}

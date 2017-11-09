package core.zuul;

import core.zuul.character.CharacterType;

public class Board {

    private final CharacterType[][] matrix;
    private final int maxX;
    private final int maxY;

    public Board(int x, int y) {
        this.matrix = new CharacterType[x][y];
        this.maxX = x;
        this.maxY = y;
    }

    public int getX() {
        return maxX;
    }

    public int getY() {
        return maxY;
    }

    public int getRows() {
        return maxY;
    }

    public CharacterType getPieceAt(int x, int y) {
        return matrix[x][y];
    }

    public Board setPieceAt(int x, int y, CharacterType value) {
        matrix[x][y] = value;
        return this;
    }
}

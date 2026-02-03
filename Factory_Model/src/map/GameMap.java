package map;

import tiles.Tile;

public abstract class GameMap {
    private final int COLS;
    private final int ROWS;
    protected Tile[][] tiles;

    protected GameMap(int cols, int rows) {
        if (cols <= 0 || rows <= 0) {
            throw new IllegalArgumentException("Map dimensions must be positive integers.");
        }

        this.COLS = cols;
        this.ROWS = rows;
        this.tiles = new Tile[rows][cols];
    }

    abstract Tile createTile();

    public void display() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
                if (j == COLS - 1) {
                    System.out.print("\n");
                }
            }
            System.out.println();
        }
    }

    public void generate() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                tiles[i][j] = createTile();
            }
        }
    }
}

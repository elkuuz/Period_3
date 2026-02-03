// File: GameMap.java
package map;

import tiles.Tile;

public abstract class GameMap {
    protected Tile[][] tiles;
    protected int width;
    protected int height;

    public GameMap(int width, int height) {
        this.width = width;
        this.height = height;
        // allocate the grid so indexes are valid; subclasses should populate entries
        this.tiles = new Tile[height][width];
    }

    // subclasses fill tiles[][] during construction or via a generate method
    public abstract void generate();

    // Safe display: guard against null tiles
    public void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Tile t = tiles[i][j];
                char ch = (t == null) ? '.' : t.getCharacter();
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // helper to set a tile
    public void setTile(int row, int col, Tile tile) {
        if (row >= 0 && row < height && col >= 0 && col < width) {
            tiles[row][col] = tile;
        }
    }

    public Tile getTile(int row, int col) {
        if (row >= 0 && row < height && col >= 0 && col < width) {
            return tiles[row][col];
        }
        return null;
    }
}

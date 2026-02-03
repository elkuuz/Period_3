// java
package map;

import tiles.*;

import java.util.Random;

public class WildernessMap extends GameMap {
    private final Random random = new Random();

    public WildernessMap(int cols, int rows) {
        super(cols, rows);
        generate();
    }

    @Override
    public void generate() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    Tile createTile() {
        int tile = random.nextInt(3);
        return switch (tile) {
            case 0 -> new Forest();
            case 1 -> new Swamp();
            case 2 -> new Water();
            default -> throw new IllegalStateException("Unexpected value: " + tile);
        };
    }
}

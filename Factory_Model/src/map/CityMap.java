// java
package map;

import tiles.Building;
import tiles.Road;
import tiles.Tile;
import tiles.Forest;

import java.util.Random;

public class CityMap extends GameMap {
    private final Random rand = new Random();

    public CityMap(int cols, int rows) {
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
        int tile = rand.nextInt(3);
        return switch (tile) {
            case 0 -> new Forest();
            case 1 -> new Building();
            case 2 -> new Road();
            default -> throw new IllegalStateException("Unexpected value: " + tile);
        };
    }
}

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
    }

    @Override
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

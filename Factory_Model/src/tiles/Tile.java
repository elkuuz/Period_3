package tiles;

public interface Tile {
    char getCharacter();
    String getType();
    default void action() {
        // Default action does nothing
    }
}

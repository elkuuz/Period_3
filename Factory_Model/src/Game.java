import java.util.Scanner;

import map.CityMap;
import map.GameMap;
import map.WildernessMap;


public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose map type (city / wilderness): ");
        String choice = scanner.nextLine();

        GameMap map = createMap(choice);
        map.display();

        scanner.close();
    }

    // Factory method that decides which Map to create
    public static GameMap createMap(String type) {
        if ("city".equalsIgnoreCase(type)) {
            return new CityMap(10, 6);
        } else if ("wilderness".equalsIgnoreCase(type)) {
            return new WildernessMap(10, 6);
        } else {
            System.out.println("Unknown map type, defaulting to wilderness.");
            return new WildernessMap(10, 6);
        }
    }
}

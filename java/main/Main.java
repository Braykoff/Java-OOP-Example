package java.main;

import java.main.House;

public class Main {
    public static void main(String[] args) {
        House house1 = new House("Brendan", 3, 1000);
        House house2 = new House("Unowned", 7, 12000);

        // Use it
        house1.setDoorOpen(true);
        house2.openWindows();
    }
}

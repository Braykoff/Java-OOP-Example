public class House {
    // Properties
    private String owner;
    private int numOfDoors;
    private int size; // sq ft

    // Constructor
    public House(String owner, int numOfDoors, int size) {
        this.owner = owner;
        this.numOfDoors = numOfDoors;
        this.size = size;
        System.out.println("House has been initialized!");
    }

    // Owner setter/getter
    public String getOwner() { return owner; }
    public void setOwner(String newOwner) { owner = newOwner; }

    // Methods
    public void setDoorOpen(boolean open) {
        if (open) {
            System.out.printf("The doors of %s's house are open\n", owner);
        } else {
            System.out.printf("The doors of %s's house are closed\n", owner);
        }
    }

    public void openWindows() {
        System.out.printf("The windows of the house owned by %s were opened!\n", owner);
    }

    public String getString() {
        return String.format("House owned by %s with %d doors\n", owner, numOfDoors);
    }
}


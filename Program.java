class Shop {
    private String name;
    private String location;
    private int itemsAvailable;

    public Shop() {
        this("Grocery Shop", "Bengaluru", 10); 
    }
    public Shop(String name) {
        this(name, "Mangalore", 20); 
    }
    public Shop(String name, String location) {
        this(name, location, 40); 
    }
    public Shop(String name, String location, int itemsAvailable) {
        this.name = name;
        this.location = location;
        this.itemsAvailable = itemsAvailable;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getItemsAvailable() {
        return itemsAvailable;
    }
    public void setItemsAvailable(int itemsAvailable) {
        this.itemsAvailable = itemsAvailable;
    }

    public void displayInfo() {
        System.out.println("Shop Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Items Available: " + itemsAvailable);
    }
}

public class Program {
    public static void main(String[] args) {
        Shop shop1 = new Shop();
        Shop shop2 = new Shop("Grocery World");
        Shop shop3 = new Shop("Tech Zone", "Downtown");
        Shop shop4 = new Shop("Book Hub", "City Center", 150);

        shop1.displayInfo();
        System.out.println();

        shop2.displayInfo();
        System.out.println();

        shop3.displayInfo();
        System.out.println();

        shop4.displayInfo();
    }
}


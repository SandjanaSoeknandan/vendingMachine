package sr.unasat.beverage;

public class Beverages {

    private String name;
    private String price;

    public Beverages(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}

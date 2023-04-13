import java.util.*;

class Supplier {
    private String name;
    private int id;
    private String date;
    private String location;
    private long contact;

    public Supplier(String name, int id,long contact, String location) {
        this.name = name;                              
        this.id = id;
        this.contact = contact;
        this.location = location;
        this.order_placed = new ArrayList<String>();
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public long getContact() {
        return contact;
    }

    public void Place_order(String order) {
        order_placed.add(order);
    }

    public ArrayList<String> Order_placed() {
        return order_placed;
    }
}
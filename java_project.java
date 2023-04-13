import java.util.*;

class Supplier {
     String name;
     int id;
     String date;
     String location;
     long contact;

    public Supplier(String name, int id,long contact, String location) {
        name = name;                              
        id = id;
        contact = contact;
        location = location;
        
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

    
}
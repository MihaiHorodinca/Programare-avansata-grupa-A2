package laborator2;

import sun.security.krb5.internal.crypto.Des;

enum DestinationType{
    CUSTOMER, SHOP;
}

public class Destination {

    private String name;
    private DestinationType type;

    public Destination () {                                         // basic constructor
        this.type = DestinationType.CUSTOMER;
    }

    public Destination (String name){                               // constructor with name
        this.name = name;
    }

    public Destination (DestinationType type){                      // constructor with type
        this.type = type;
    }

    public Destination (String name, DestinationType type){         // full constructor
        this.name = name;
        this.type = type;
    }


    // --Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(DestinationType type) {
        this.type = type;
    }


    // --Getters
    public String getName() {
        return name;
    }

    public DestinationType getType() {
        return type;
    }


    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}

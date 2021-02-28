package laborator2;

enum SourceType {
    WAREHOUSE, FACTORY;
}

public class Source {

    private String name;
    private SourceType type;

    public Source (){                   // basic constructor
        type = SourceType.WAREHOUSE;
    }

    public Source(String name){         // constructor with name
        this.name = name;
    }

    public Source(SourceType type){     // constructor with type
        this.type = type;
    }

    public Source(String name, SourceType type){    // full constructor
        this.name = name;
        this.type = type;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setType(SourceType type) {
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public SourceType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + getName()+ '\'' +
                ", type=" + getType() +
                '}';
    }
}

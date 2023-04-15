package Shapes;

public class Cone extends Shape {
    private final String name;
    public Cone() {
        this.name= "Cone";
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "This Shape is a " + this.name;
    }
}


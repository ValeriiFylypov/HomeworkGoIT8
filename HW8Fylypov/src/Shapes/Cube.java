package Shapes;

public class Cube extends Shape {
    private final String name;
    public Cube() {
        this.name= "Cone";
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "This is a " + this.name;
    }
}

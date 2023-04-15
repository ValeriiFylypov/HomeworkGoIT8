package Shapes;

public class Hexagon extends Shape {
    private final String name;
    public Hexagon() {
        this.name= "Hexagon";
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "This is a  " + this.name;
    }
}

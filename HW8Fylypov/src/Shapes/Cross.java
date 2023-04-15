package Shapes;

public class Cross extends Shape {
    private final String name;
    public Cross() {
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

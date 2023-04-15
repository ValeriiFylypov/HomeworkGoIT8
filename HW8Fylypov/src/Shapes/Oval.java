package Shapes;

public class Oval extends Shape{
    private final String name;
    public Oval() {
        this.name= "Oval";
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "This Shape is an " + this.name;
    }
}
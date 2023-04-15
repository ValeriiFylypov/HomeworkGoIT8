package Shapes;

public class Pentagon extends Shape{
    private final String name;
    public Pentagon() {
        this.name= "Pentagon";
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
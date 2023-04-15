package ShapeGetter;


import Shapes.Shape;

public class ShapesNameGetter {
    public ShapesNameGetter(Shape shape){
        System.out.println(shape.getName());
    }
    public ShapesNameGetter(){

    }
    public String toString(Shape shape){
        return "This is a " + shape.getName();
    }

    public String toString (Shape[] shape){
        StringBuilder shapeArray = new StringBuilder("Shape name is: ");
        for(Shape s : shape){
            shapeArray.append("[").
                    append(s.getName())
                    .append("]");

        }
        return shapeArray.toString();
    }
}

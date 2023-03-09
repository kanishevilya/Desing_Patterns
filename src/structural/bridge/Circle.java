package structural.bridge;

public class Circle implements IShape_BP {

    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the public class Circle");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the public class Circle, int the method -> shapeColor_IShape");
    }
}

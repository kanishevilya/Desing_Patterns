package structural.bridge;

public class Rectangle implements IShape_BP {

    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the public class Rectangle");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the public class Rectangle, int the method -> shapeColor_IShape");
    }
}

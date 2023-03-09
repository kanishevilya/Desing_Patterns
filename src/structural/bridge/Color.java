package structural.bridge;

public class Color extends ShapeBridge{


    protected Color(IShape_BP shapeBp) {
        super(shapeBp);
    }

    @Override
    void drawShape_ShapeBridge() {
      //Do-nothing
    }

    @Override
    void fillColor_ShapeBridge() {
      System.out.println("Inside the public class Color, which "+ "extends ShapeBridge...");
      shapeBp.shapeType_IShape();
    }
}

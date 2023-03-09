package structural.decorator;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(IShape ishape) {
        super(ishape);
    }

    @Override
    public void drawShape() {
        iShape.drawShape();
    }

    public void setRedBorder(){
        System.out.println("Border color: Red");
    }
}

package structural.decorator;

public class BlueShapeDecorator  extends ShapeDecorator{

    public BlueShapeDecorator(IShape ishape) {
        super(ishape);
    }

    @Override
    public void drawShape() {
        iShape.drawShape();
    }

    public void setBlueBorder(){
        System.out.println("Border color: Blue");
    }
}

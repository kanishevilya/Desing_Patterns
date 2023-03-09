package structural.decorator;

public class ShapeDecorator implements IShape{
    protected IShape iShape;

    public ShapeDecorator(IShape ishape){
        iShape=ishape;
    }

    @Override
    public void drawShape() {
       iShape.drawShape();
    }
}

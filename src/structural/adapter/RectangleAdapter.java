package structural.adapter;

public class RectangleAdapter implements Shape {

    private Rectangle rectangleAdapter;

    public RectangleAdapter(Rectangle rectangleAdapter) {
        this.rectangleAdapter = rectangleAdapter;
    }


    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int width=Math.abs(x2-x1);
        int height=Math.abs(y2-y1);

        rectangleAdapter.draw(x,y, width, height);

    }
}

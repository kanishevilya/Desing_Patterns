package structural.decorator;

public class Main {
    public static void main(String[] args){
        IShape circle = new Circle();
        IShape redCircle=new RedShapeDecorator(new Circle());



        IShape square=new Square();
        IShape blueSquare=new BlueShapeDecorator(new Square());

        System.out.println("Circle with normal border...");
        circle.drawShape();
//
        System.out.println("Circle with red border...");
        redCircle.drawShape();
        System.out.println("******************");
        System.out.println("Square with normal border...");
        square.drawShape();

        System.out.println("Square with blue border...");
        blueSquare.drawShape();
    }
}

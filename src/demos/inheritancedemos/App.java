package demos.inheritancedemos;

public class App {


    void diaplayArea(Shape s){
//        System.out.println("area is calculted");
        s.calculateArea();
    }
    void diaplayArea(Circle s){
//        System.out.println("area is calculted");
        s.calculateArea();
    }


    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.calculateArea();
        rectangle.calculateArea();
        Triangle triangle = new Triangle();

        App app = new App();
        app.diaplayArea(triangle);

    }
}

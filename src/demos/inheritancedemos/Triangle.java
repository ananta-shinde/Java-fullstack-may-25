package demos.inheritancedemos;

public class Triangle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("area of triangle is calculated");
    }
}

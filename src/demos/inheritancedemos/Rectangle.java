package demos.inheritancedemos;

public class Rectangle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("area of rectangle is calculated");
    }
}

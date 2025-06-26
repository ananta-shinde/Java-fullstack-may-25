package demos.inheritancedemos;

public class Circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("area of circle is calculated");
    }
}

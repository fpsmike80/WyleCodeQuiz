/*
    WyleCodeQuiz1
    Michael Bejaniance
 */
package wylecodequiz;

public class TestTriangle {

    public static void main(String[] args) {
        Triangle Triangle = new Triangle(5.0, 3.2, 4.4);
        System.out.println("The Area of the triangle is " + Triangle.getArea());
        System.out.println("The Perimeter of the triangle is " + Triangle.getPerimeter());
    }
}

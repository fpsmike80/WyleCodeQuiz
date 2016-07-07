/*
    WyleCodeQuiz1
    Michael Bejaniance
 */
package wylecodequiz;

class Circle implements WyleCodeQuiz.Shape {

    private double radius = 1.0;

    public Circle(double r1) {
        radius = r1;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

}

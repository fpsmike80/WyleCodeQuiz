/*
    WyleCodeQuiz1
    Michael Bejaniance
 */
package wylecodequiz;

class Rectangle implements WyleCodeQuiz.Shape {

    private double width = 1.0;
    private double height = 1.0;

    public Rectangle(double w1, double h1) {
        width = w1;
        height = h1;
    }

    public double getArea() {
        return ((width * height) / 2);
    }

    public double getPerimeter() {
        return ((width * 2) + (height * 2));
    }

}

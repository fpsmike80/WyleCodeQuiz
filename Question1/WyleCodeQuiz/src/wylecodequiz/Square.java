/*
    WyleCodeQuiz1
    Michael Bejaniance
 */
package wylecodequiz;

class Square implements WyleCodeQuiz.Shape {

    private double side1 = 1.0;

    public Square(double s1) {
        side1 = s1;
    }

    public double getArea() {
        return (side1 * side1);
    }

    public double getPerimeter() {
        return (side1 * 4);
    }

}

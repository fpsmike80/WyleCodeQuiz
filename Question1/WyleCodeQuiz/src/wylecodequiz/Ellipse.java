/*
    WyleCodeQuiz1
    Michael Bejaniance
 */
package wylecodequiz;



class Ellipse implements WyleCodeQuiz.Shape {

    private double radius1 = 1.0;
    private double radius2 = 1.0;

    public Ellipse(double r1, double r2) {
        radius1 = r1;
        radius2 = r2;
    }

    public double getArea() {
        return (Math.PI*radius1 * radius2);
    }

    public double getPerimeter() {
        return 2*Math.PI*Math.sqrt((Math.pow(radius1,2)+Math.pow(radius2,2))/2);
    }

}
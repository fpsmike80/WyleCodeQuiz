/*
    WyleCodeQuiz1
    Michael Bejaniance
 */
package wylecodequiz;

class Triangle implements WyleCodeQuiz.Shape {

        private double side1 = 1.0;
        private double side2 = 1.0;
        private double side3 = 1.0;

        public Triangle(double s1, double s2, double s3) {

            side1 = s1;
            side2 = s2;
            side3 = s3;
        }

        public double getArea() {
            return ((side1 + side2 + side3) / 2);
        }

        public double getPerimeter() {
            return (side1 + side2 + side3);
        }

    }
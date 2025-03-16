package WorksheetThree_3167638;

public class Rhombus extends Shape {
    private double side;// Rhombus has equal sides
    private double angle;// has an internal angle in degrees and not height

    public Rhombus(String name, double side, double angle){
            super(name);
            this.side = side;//wrong math method. we have to use side and angle to mesure a Rhombus
            this.angle = angle; //To measure the Rhombus, you do not use height, but angle.
}

    @Override
    public double area() {
        return side * side * Math.sin(Math.toRadians(angle));
    }

    @Override
    public double perimeter() { //Pythagorean theorem
        return 4 * side;
    }

    @Override
    public String toString() {
        return super.toString() + ", side" + side + ", angle" + angle;
    }
}

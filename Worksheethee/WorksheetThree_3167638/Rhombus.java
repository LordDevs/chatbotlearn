package WorksheetThree_3167638;


public class Rhombus extends Shape {
    private double base;
    private double height;

    public Rhombus(String name, double base, double height){
            super(name);
            this.base = base;//wrong math method. we have to use side and angle to mesure a Rhombus
            this.height = height; //To measure the Rhombus, you do not use height, but angle.
}

    @Override
    public double area() {
        return (base * height);
    }

    @Override
    public double perimeter() { //Pythagorean theorem
        double side = Math.sqrt((base / 2) * (base / 2) + (height / 2) * (height / 2));
        return 4 * side;
    }
}

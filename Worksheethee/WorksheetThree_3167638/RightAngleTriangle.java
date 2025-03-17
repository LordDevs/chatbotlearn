package WorksheetThree_3167638;

public class RightAngleTriangle extends Shape {
    private double base;
    private double height;

    public RightAngleTriangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area(){
        return (base * height) / 2;
    }

    @Override
    public double perimeter(){
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Base" + base + ", height" + height;
    }
}

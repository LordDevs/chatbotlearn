package WorksheetThree_3167638;

//Area = PI * r^2

public class Circle extends Shape{
   private double radius;

   public Circle(String name, double radius){
      super(name);
      this.radius = radius;
   }

   //get an set

   @Override
   public double area(){
      return Math.PI * radius * radius;// area calculation with PI ~3,1416
   }

   @Override
   public double perimeter(){
      return 2 * Math.PI * radius;//PI is the same as ~3,1416
   }

   @Override
   public String toString(){
      return super.toString() + ", Radius:" + radius + ", Area" + area() + ", Perimeter" + perimeter();
   }
}
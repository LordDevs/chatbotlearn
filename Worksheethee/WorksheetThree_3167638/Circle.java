package WorksheetThree_3167638;

public class Circle extends Shape{
   private double radius;

   public Circle(String name, doule radius){
      super(name);
      this.radius = radius;
   }

   //get an set

   @Override
   public double area(){
      return Math.PI * radius * radius;// area calculation with PI ~3,14
   }

   @Override
   public double perimeter(){
      return 2 * Math.PI * radius;
   }

   public static void main(String[] args) {
      
   }
}
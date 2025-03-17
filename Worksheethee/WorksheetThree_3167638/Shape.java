package WorksheetThree_3167638;

//part one. create an abstract class Shape
// add a constructor that sets name
// Main class for testing purposes


public abstract class Shape {// abstract class
    private String name;// name of shape


public Shape(String name) {// constructor
    this.name = name; //set name
}

public String getName() {// get name
    return name;
    }
public void setName(String name) {// set name
    this.name = name;
    }
public abstract double area();
public abstract double perimeter();

@Override
public String toString(){
    return "Shape:"+name;
}
public class Main {
    public static void main(String[] args) {
    }
}
}

//create three subclasses that extend from shape: cirle, Rhombus, and rightangletriangle
//for each class add any needed attribute, and contructrs e.g radius for circle.
//override the toString to include the new attributes o In each sub class you will need to override the abstract methods with the appropriate behaviours 
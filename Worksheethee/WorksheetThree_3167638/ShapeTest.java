package WorksheetThree_3167638;

import org.junit.jupiter.api.Test;//properly imprtantion for junit test
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ShapeTest {

    private Circle circle;
    private Rhombus rhombus;

    @BeforeEach
    public void setup() {
        circle = new Circle("Circle", 3.0);
        rhombus = new Rhombus("Rhombus", 4.0, 60.0);
    }

    // Circle test
    @Test
    public void testCircleArea() {
        assertEquals(28.2743, circle.area(), 0.0001); // Epsilon
    }

    @Test
    public void testCirclePerimeter() {
        assertEquals(18.8496, circle.perimeter(), 0.0001); // 
    }

    //  losango
    @Test
    public void testRhombus() {
        assertEquals(13.856406460551018, rhombus.area(), 0.0001);
    }

    // Integration
    @Test
    public void integrationTest() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Circle", 3.0));
        shapes.add(new Rhombus("Rhombus", 4.0, 60.0)); 

        for (Shape shape : shapes) {
            assertTrue(shape.area() > 0); // area test
            assertTrue(shape.perimeter() > 0); // Perimeter test
        }
    }
}

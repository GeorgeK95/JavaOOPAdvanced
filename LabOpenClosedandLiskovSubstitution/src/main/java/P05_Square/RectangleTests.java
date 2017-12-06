package P05_Square;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTests {
    @Test
    public void getSidesTest() {
        Rectangle rect = new Rectangle(10, 5);
        Assert.assertEquals(10, rect.getWidth());
        Assert.assertEquals(5, rect.getHeight());
    }

    @Test
    public void getAreaTest() {
        Rectangle rect = new Rectangle(5, 10);
        Assert.assertEquals(50, rect.getArea());
    }

    @Test
    public void getSquareTest() {
        Rectangle rect = new Square(10);
        Assert.assertEquals(100, rect.getArea());
    }
}

import org.assigment.storage.RectangleObject;
import org.assigment.storage.RectangleStorage;
import org.junit.Assert;
import org.junit.Test;

public class StorageTests {

    @Test
    public void sanityTest(){
        RectangleStorage rectangleStorage = new RectangleStorage(4,3);
        Assert.assertTrue(rectangleStorage.insertRectangleObject(new RectangleObject(1,1)));
        Assert.assertTrue(rectangleStorage.insertRectangleObject(new RectangleObject(1,1)));
        Assert.assertTrue(rectangleStorage.insertRectangleObject(new RectangleObject(1,1)));
        Assert.assertTrue(rectangleStorage.insertRectangleObject(new RectangleObject(1,1)));
        Assert.assertTrue(rectangleStorage.insertRectangleObject(new RectangleObject(1,1)));
        Assert.assertTrue(rectangleStorage.insertRectangleObject(new RectangleObject(1,1)));
        Assert.assertTrue(rectangleStorage.insertRectangleObject(new RectangleObject(1,1)));
        Assert.assertTrue(rectangleStorage.insertRectangleObject(new RectangleObject(1,1)));
        Assert.assertTrue(rectangleStorage.insertRectangleObject(new RectangleObject(1,1)));
        Assert.assertTrue(rectangleStorage.insertRectangleObject(new RectangleObject(1,1)));
        Assert.assertTrue(rectangleStorage.insertRectangleObject(new RectangleObject(1,1)));
        Assert.assertTrue(rectangleStorage.insertRectangleObject(new RectangleObject(1,1)));
        Assert.assertFalse(rectangleStorage.insertRectangleObject(new RectangleObject(1,1)));
    }

}

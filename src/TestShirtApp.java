import ShirtApp.Shirt;
import org.junit.Assert;
import org.junit.Test;


public class TestShirtApp {
    @Test
    public void constructorTest(){
        String expectedShirtColor = "Red";
        Shirt sh = new Shirt("Pink",'M',"Bangladesh",10.23);
        Shirt sh1 = new Shirt("Blue");
        Shirt sh2 = new Shirt('S',4.56);
    }

    @Test
    public void putOnTest(){
        String expectedMessage = "You put on your shirt";
        String actualResutlMessage = Shirt.putOn();
        Assert.assertEquals("Test Fail",expectedMessage,actualResutlMessage);

    }
    @Test
    public void takeOffTest(){

    }
}

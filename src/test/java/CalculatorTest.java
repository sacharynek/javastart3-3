import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {


    @Test
    public void TestIsEven(){
        Assert.assertFalse(Calculator.isEven(3));
        Assert.assertTrue(Calculator.isEven(2));
    }

    @Test
    public void TestIsOdd(){
        Assert.assertFalse(Calculator.isOdd(2));
        Assert.assertTrue(Calculator.isOdd(3));
    }

    @Test
    public void TestPower(){
        Assert.assertEquals(Calculator.power(2), 4);
        Assert.assertEquals(Calculator.power(-2), 4);
        Assert.assertEquals(Calculator.power(0), 0);
    }

    @Test
    public void TestCircleField(){
        Assert.assertEquals(Calculator.circleField(0), 0.0);
        Assert.assertEquals(Calculator.circleField(1), Math.PI);
        Assert.assertEquals(Calculator.circleField(2), 2*2*Math.PI);
    }


}

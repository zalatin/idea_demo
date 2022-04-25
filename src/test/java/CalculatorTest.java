import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void shouldReturn2When1Plus1() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, '+');
        int expectResult = 2;
        Assert.assertEquals(actualResult, expectResult);

    }

}
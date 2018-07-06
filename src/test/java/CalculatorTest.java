import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void Sum (){
        assertEquals(5,calc.Sum(2,3));
    }

    @Test
    public void Sub (){
            assertEquals(3, calc.Sub(5, 2));
    }

    @Test
    public void Mul() {
        assertEquals(6, calc.Mul(2,3));
    }

    @Test
    public void Div() {
        assertEquals(5,calc.Div(10,2),0.001);
    }
}

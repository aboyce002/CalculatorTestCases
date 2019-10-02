import calculator.Calculator;
import org.junit.Test;
import org.junit.Assert;
public class CalcTest {

    @Test
    public void addTest(){
        Calculator calc = new Calculator();

        int x = 1;
        int y = 2;

        int expected = 3;

        int actual = calc.add(x,y);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void subtractTest(){
        Calculator calc = new Calculator();

        int x = 5;
        int y = 3;

        int expected = 2;

        int actual = calc.subtract(x,y);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void multiplyTest(){
        Calculator calc = new Calculator();

        double x = 2;
        double y = 4;

        double expected = 8;

        double actual = calc.multiply(x,y);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void divideTest(){
        Calculator calc = new Calculator();

        double x = 8;
        double y = 2;

        double expected = 4;

        double actual = calc.divide(x,y);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void squareTest(){
        Calculator calc = new Calculator();

        int x = 3;

        int expected = 9;

        int actual = calc.square(x);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void squareRootTest(){
        Calculator calc = new Calculator();

        double x = 9;

        double expected = 3;

        double actual = calc.squareRoot(x);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void exponentsTest(){
        Calculator calc = new Calculator();

        double x = 9;
        double y = 3;

        double expected = 729;

        double actual = calc.exponents(x,y);

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void sineMethodTest(){
        Calculator calc = new Calculator();

        double x = 45;

        double expected = 0.85090352453;

        double actual = calc.sineMethod(x);

        Assert.assertEquals(expected,actual,0.001);
    }

}

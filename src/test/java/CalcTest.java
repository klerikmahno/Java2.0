import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Юнит тесты на калькулятор (Calc)
 * @author Pavlenko Sergey
 */
public class CalcTest {

    //тест проверки функции сложения
    @Test
    public void testCalcAddition() throws Exception {
        Calc calc = new Calc((double)1,2.2,"+");
        Assertions.assertEquals(3.2,calc.calculate(),0);
    }

    //тест проверки функции вычитания
    @Test
    public void testCalcSubtraction() throws Exception{
        Calc calc = new Calc(10.4234,18.2,"-");
        Assertions.assertEquals(-7.7766,calc.calculate(),0);
    }

    //тест проверки функции умножения
    @Test
    public void testCalcMultiplication()throws Exception {
        Calc calc = new Calc((double)10,2.2,"*");
        Assertions.assertEquals(22,calc.calculate(),0);
    }

    //тест проверки функции деления
    @Test
    public void testCalcDivision()throws Exception {
        Calc calc = new Calc(10.2,(double)2,"/");
        Assertions.assertEquals(5.1,calc.calculate(),0);
    }

    //тест проверки деления на 0, ожидаем исключение ArithmeticException
    @Test(expected = ArithmeticException.class)
    public void testCalcDivisionByZero() throws Exception{
        Calc calc = new Calc(10.2,(double)0,"/");
        calc.calculate();
    }

    //тест проверки не корректного значения, ожидаем исключение Calc.SelectNotFoundException
    @Test(expected = Calc.SelectNotFoundException.class)
    public void testCalcNotFoundSelect()throws Exception{
        Calc calc = new Calc(10.2,(double)0,"i");
        calc.calculate();
    }
}

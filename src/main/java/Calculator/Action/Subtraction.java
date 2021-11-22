package Calculator.Action;

public class Subtraction extends Action{
    /**
     * функция вычитания
     * @param a first number
     * @param b second number
     * @return subtraction result (double)
     * @see Action
     * @author Pavlenko Sergey
     */

    @Override
    public double action(double a, double b) {
        return a - b;
    }
}

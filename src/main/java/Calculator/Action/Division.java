package Calculator.Action;

public class Division extends Action{
    /**
     * функция деления
     * @param a first number
     * @param b second number
     * @return division result (double)
     * @see Action
     * @author Pavlenko Sergey
     */

    @Override
    public double action(double a, double b) {
        return a / b;
    }
}

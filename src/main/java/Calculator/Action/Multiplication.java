package Calculator.Action;

public class Multiplication extends Action {
    /**
     * функция умножения
     * @param a first number
     * @param b second number
     * @return multiplication result (double)
     * @see Action
     * @author Pavlenko Sergey
     */

     @Override
    public double action(double a, double b) {
        return a * b;
    }
}

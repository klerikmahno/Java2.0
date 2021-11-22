package Calculator.Action;

public class Addition extends Action {
    /**
     * функция сложения
     * @param a first number
     * @param b second number
     * @return addition result (double)
     * @see Action
     * @author Pavlenko Sergey
     */
    @Override
    public double action(double a, double b) {
        return a + b;
    }
}

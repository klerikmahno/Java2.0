/**
 * Создаём калькулятор
 *
 * @author Pavlenko Sergey
 * @see #addition(Double a, Double b)
 * @see #subtraction(Double a, Double b)
 * @see #multiplication(Double a, Double b)
 * @see #division(Double a, Double b)
 * @see SelectNotFoundException
 */

public class Calc  {
    Double a;
    Double b;
    String x;

    public Calc(Double a,Double b,String x) { //консруктор класса
        this.a = a;
        this.b = b;
        this.x = x;
    }
    public Double calculate(){ //метот расчёта
        try{
            if (x.equals("+")) { //проверка на сложение
                return addition(a, b);
            } else if (x.equals("-")) { //проверка на
                return subtraction(a, b);
            } else if (x.equals("*")) { //проверка на вычитание
                return multiplication(a, b); //проверка на умножение
            } else if (x.equals("/")) {
                return division(a, b); //проверка на деление
            }else{
                throw new SelectNotFoundException(); //если операция не корректная создаём исключение на этот случай
            }
        }catch(SelectNotFoundException e) { //обрабатываем выброшеное исключение
            System.out.println("Selected operation not found"); //сообщение об ошибке. Думал сделать лог фаил, надо ли?
            return 0.0; //возвращаем 0
        }
    }

    /**
     * функция сложения
     * @param a first number
     * @param b second number
     * @return addition result (double)
     */
    private static double addition(Double a, Double b) {
        return a + b;
    }

    /**
     * функция вычитания
     * @param a first number
     * @param b second number
     * @return subtraction result (double)
     */
    private static double subtraction(Double a, Double b) {
        return a - b;
    }

    /**
     * функция умножения
     * @param a first number
     * @param b second number
     * @return multiplication result (double)
     */
    private static double multiplication(Double a, Double b) {
        return a * b;
    }

    /**
     * функция деления
     * @param a first number
     * @param b second number
     * @return division result (double)
     */
    private static double division(Double a, Double b){
        try {
            //проверяем что Double b не 0.0, для этого делем 1 на него и проверяем, что система не выдаст infinity(+/-)
            if (1.0 / b == Double.POSITIVE_INFINITY ||
                    1.0 / b == Double.NEGATIVE_INFINITY) {
                throw new ArithmeticException(); //если да, делаем арифмитическое исключение

            }else return a/b; //возвращаем ответ если b !=0.0
        }catch (ArithmeticException e) { //обрабатываем выброшеное исключение
            System.out.println("Деление на ноль невозможно!"); //сообщение об ошибке. Думал сделать лог фаил, надо ли?
            return 0.0; //возвращаем 0
        }

    }
    //собственное исключение, для проверки операции
    public class SelectNotFoundException extends Exception {

        public SelectNotFoundException () {
            super();
        }
    }

}

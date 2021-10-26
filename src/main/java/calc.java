/**
 * Создаём калькулятор
 *
 * @author Pavlenko Sergey
 * @see #addition(double a, double b)
 * @see #subtraction(double a, double b)
 * @see #multiplication(double a, double b)
 * @see #division(double a, double b)
 */

import java.io.BufferedReader; //импорт BufferedReader
import java.io.InputStreamReader; //импорт InputStreamReader

public class calc {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in)); //Создаём bufferedReader для считывания строк
        System.out.println("Enter the first number:"); //выводим текст для пользователя
        double a = Double.parseDouble(cs.readLine()); //вызываем bufferedReader, преобразуем к типу double и заносим в переменную введённое значение
        System.out.println("Enter the second number:"); //выводим текст для пользователя
        double b = Double.parseDouble(cs.readLine()); //вызываем bufferedReader, преобразуем к типу double и заносим в переменную введённое значение
        System.out.println("Select operation( + / - / * / / ):"); //выводим текст для пользователя с вариантами значений
        String x = cs.readLine(); //вызываем bufferedReader и заносим в переменную string введённое значение
        if (x.equals("+")) { //проверка на сложение
            System.out.print("Result is : "); //выводим текст для пользователя без переноса строки
            System.out.printf("%.4f", addition(a, b)); //выводим ответ функции сложения в формате 0.0000
        } else if (x.equals("-")) {
            System.out.print("Result is : "); //выводим текст для пользователя без переноса строки
            System.out.printf("%.4f", subtraction(a, b)); //выводим ответ функции вычитания в формате 0.0000
        } else if (x.equals("*")) {
            System.out.print("Result is : "); //выводим текст для пользователя без переноса строки
            System.out.printf("%.4f", multiplication(a, b)); //выводим ответ функции умножения в формате 0.0000
        } else if (x.equals("/")) {
            System.out.print("Result is : "); //выводим текст для пользователя без переноса строки
            System.out.printf("%.4f", division(a, b)); //выводим ответ функции деления в формате 0.0000
        } else {
            System.out.println("Selected operation not found"); //выводим текст для пользователя о неверном символе
        }

    }

    /**
     * функция сложения
     * @param a first number
     * @param b second number
     * @return addition result (double)
     */
    private static double addition(double a, double b) {
        return a + b;
    }

    /**
     * функция вычитания
     * @param a first number
     * @param b second number
     * @return subtraction result (double)
     */
    private static double subtraction(double a, double b) {
        return a - b;
    }

    /**
     * функция умножения
     * @param a first number
     * @param b second number
     * @return multiplication result (double)
     */
    private static double multiplication(double a, double b) {
        return a * b;
    }

    /**
     * функция деления
     * @param a first number
     * @param b second number
     * @return division result (double)
     */
    private static double division(double a, double b) {
        return a / b;
    }

}

package Calculator;

import Calculator.Action.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Класс выбора действия
 * @see SelectAction
 * @author Pavlenko Sergey
 */


public class SelectAction  {
    public SelectAction(double a, double b) throws Exception{ //метод выбора действия, на вход получает 2 числа типа double
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in)); //создаём BufferedReader для считывани символа
        System.out.println("Select operation( + / - / * / / ):"); //выводим текст для пользователя с вариантами значений
        String x = cs.readLine(); //вызываем bufferedReader и заносим в переменную string введённое значение
        if (x.equals("+")) { //проверка на сложение
            Addition c = new Addition();; //создаём новый объект расчёта сложения
            System.out.print("Result is : "); //выводим текст для пользователя без переноса строки
            System.out.printf("%.4f",c.action(a,b)); //выводим ответ функции сложения в формате 0.0000
        } else if (x.equals("-")) {
            Subtraction c = new Subtraction();//создаём новый объект расчёта вычитания
            System.out.print("Result is : "); //выводим текст для пользователя без переноса строки
            System.out.printf("%.4f", c.action(a,b)); //выводим ответ функции вычитания в формате 0.0000
        } else if (x.equals("*")) {
            Multiplication c = new Multiplication(); //создаём новый объект расчёта умножения
            System.out.print("Result is : "); //выводим текст для пользователя без переноса строки
            System.out.printf("%.4f", c.action(a,b)); //выводим ответ функции умножения в формате 0.0000
        } else if (x.equals("/")) {
            Division c = new Division(); //создаём новый объект расчёта деления
            System.out.print("Result is : "); //выводим текст для пользователя без переноса строки
            System.out.printf("%.4f", c.action(a,b)); //выводим ответ функции деления в формате 0.0000
        } else {
            System.out.println("Selected operation not found"); //выводим текст для пользователя о неверном символе
        }

    }
}

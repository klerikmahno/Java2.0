/**
 * This is our first Java class
 * @author Pavlenko Sergey
 * @see Calc
 * @see MaxInArray
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Base {
    public static void main(String[] args) throws Exception{
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));  //Создаём bufferedReader для считывания строк
        // Выберите программу (1 - калькулятор / 2 - Максимальное слово в массиве)
        System.out.println("Select program (1 - calculator / 2- Maximum length word):");
        String select = cs.readLine(); //вызываем bufferedReader и заносим в переменную string введённое значение
        if(select.equals("1")) {
            System.out.println("Enter the first number:"); //выводим текст для пользователя
            double a = Double.parseDouble(cs.readLine()); //вызываем bufferedReader, преобразуем к типу double и заносим в переменную введённое значение
            System.out.println("Enter the second number:"); //выводим текст для пользователя
            double b = Double.parseDouble(cs.readLine()); //вызываем bufferedReader, преобразуем к типу double и заносим в переменную введённое значение
            System.out.println("Select operation( + / - / * / / ):"); //выводим текст для пользователя с вариантами значений
            String x = cs.readLine(); //вызываем bufferedReader и заносим в переменную string введённое значение
            ;//проверка выбора калькулятора и вызов при успехе
            System.out.println(new Calc(a,b,x).calculate());
        }
        else if(select.equals("2")) MaxInArray.game(); //проверка выбора максимальной длины слова и вызов при успехе
        else System.out.println("Incorrect value"); //сообщение при неверном значении


    }
}

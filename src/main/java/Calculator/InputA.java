package Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Класс ввода цифры
 * Класс имеет метод получения цифры с консоли
 * @see SelectAction
 * @author Pavlenko Sergey
 */

public class InputA {
    double input() throws Exception{ //метод ввода цифры, тип возвращаемого параметра double
    BufferedReader cs = new BufferedReader(new InputStreamReader(System.in)); //Создаём bufferedReader для считывания строк
    System.out.println("Enter the number:"); //выводим текст для пользователя
    return Double.parseDouble(cs.readLine()); //возвращаем цифру в формета double
    }
}

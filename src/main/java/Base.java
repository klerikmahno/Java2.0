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
        String a = cs.readLine(); //вызываем bufferedReader и заносим в переменную string введённое значение
        if(a.equals("1")) Calc.game(); //проверка выбора калькулятора и вызов при успехе
        else if(a.equals("2")) MaxInArray.game(); //проверка выбора максимальной длины слова и вызов при успехе
        else System.out.println("Incorrect value"); //сообщение при неверном значении


    }
}

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
        String error = "";
        String select = "";
        try{
            System.out.println("Select program (1 - calculator / 2- Maximum length word):");
            select = cs.readLine(); //вызываем bufferedReader и заносим в переменную string введённое значение
            if(select.equals("1") || select.equals("2")){
            }else{
                throw new Calc.SelectNotFoundException("Selected operation not found");
            }
        }catch (Calc.SelectNotFoundException e){
            error += e.getMessage();
        }
        if(select.equals("1")) {
            double a = 0;
            double b = 0;
            try{
                System.out.println("Enter the first number:"); //выводим текст для пользователя
                a = Double.parseDouble(cs.readLine()); //вызываем bufferedReader, преобразуем к типу double и заносим в переменную введённое значение
                System.out.println("Enter the second number:"); //выводим текст для пользователя
                b = Double.parseDouble(cs.readLine()); //вызываем bufferedReader, преобразуем к типу double и заносим в переменную введённое значение
            }catch(Exception e){
                error += e.getMessage();

            }
            System.out.println("Select operation( + / - / * / / ):"); //выводим текст для пользователя с вариантами значений
            String x = cs.readLine(); //вызываем bufferedReader и заносим в переменную string введённое значение

            try{
                System.out.println(new Calc(a,b,x).calculate());
            }catch(Calc.SelectNotFoundException e1){
                error += e1.getMessage();
            }catch (ArithmeticException e2){
                error += e2.getMessage();
            };
        }
        else if(select.equals("2")) MaxInArray.game(); //проверка выбора максимальной длины слова и вызов при успехе
        else System.out.println(error); //сообщение при неверном значении

    }
}

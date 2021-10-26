/**
 * Max length word in array
 * @author Pavlenko Sergey
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxInArray {
    public static void main(String[] args) throws Exception{
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in)); //Создаём bufferedReader для считывания строк
        System.out.println("Array length: "); //выводим текст для пользователя
        int x = Integer.parseInt(cs.readLine()); //вызываем bufferedReader, преобразуем к типу int и заносим в переменную введённое значение
        String[] arr = new String[x]; //создаём массив введённой длинны
        System.out.println("Enter words: "); //выводим текст для пользователя
        for(int i = 0;i<arr.length;i++){ //циклом заполняем массив
            arr[i] = cs.readLine(); //вызываем bufferedReader и заносим в переменную string введённое значение
        }
        String max = arr[0];//заносим в переменную максимального слова первое из слов
        for(String s : arr){
            if(s.length()>max.length()){ //сравниваем длинну слова из массива с длинной слова в переменной max
                max = s; //если длина больше заносим новое слово в переменную max
            }
        }
        System.out.println("Maximum length word: "+max); //выводим текст и самое длинное слово
    }
}

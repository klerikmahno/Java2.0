import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.*;

/**
 * Есть входной файл с набором слов, написанных через пробел
 * Необходимо:
 * Прочитать слова из файла.
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль
 * Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 * @author Pavlenko Sergey
 */
public class Collect {
    public static void main(String[] args) throws Exception{
        //создаём FileInputStream для считывания файла
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/test.txt");
        //создаём BufferedInputStream для считывания в буффер по 200 байт
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
        int i; //переменная для считывания
        String sb = ""; //инициализируем строку для выгрузки в неё содержимого файла
        while((i = bufferedInputStream.read())!= -1){ //считываем пока не вернётся "-1" - конец файла
            sb += (char)i; //приводим значения к символам и кладём в строку sb
        }
        if(!sb.isEmpty()){ //проверяем что строка не пустая
            while (true){ //убираем все пробелы вначале файла
                if(sb.startsWith(" ")){ //если первый символ пробел
                    sb = sb.substring(1, sb.length()); //перезаписываем строку без первого пробела
                }else break; //выходим из цикла когда находим первый символ не пробел
            }
        }else{
            System.out.println("Фаил пуст!"); //если фаил пуст выводим сообщение
            System.exit(-1); //останавливаем программу с статускодом -1
        }
        String[] inputs = sb.split(" ");


        List<String> in = Arrays.asList(inputs); //создаём лист из массива, для сортировки
        Collections.sort(in, String.CASE_INSENSITIVE_ORDER); //сортируем по алфавиту методами интерфейса коллекций

        Map<String,Integer> map = new HashMap<String,Integer>(); //сздаём мап для хварения уникальных слов и количества их повторейни

        for(String s : inputs){ //проходим по массиву слов
            if(!map.containsKey(s)){ //если слова нет в мапе
                map.put(s,1); //заносим слово в мап(ключ), количество повторений(значение) устанавливаем 1
            }else{ //если слово уже в мап
                map.put(s,map.get(s)+1); //прибовляем к значению, найденому по ключу, единицу
            }
        }
        List<Integer> mapValues = new ArrayList<Integer>(map.values()); //создаём список значений из мапы
        Collections.sort(mapValues,Collections.reverseOrder()); //сортируем список по убываню методом коллекций
        Set<String> keys = new HashSet<String>(); //создаём сет для хранения ключей из мапы с максимальным значением
        for (Map.Entry<String, Integer> entry : map.entrySet()) { //проходим по мапе
            if (mapValues.get(0).equals(entry.getValue())) { //сравниваем максимальное значение(первое в отсортированном списке) с значением в мап
                keys.add(entry.getKey()); //заносим найденные ключи в сет
            }
        }
        //печатаем слова чаще всего встречающиеся в файле
        for (String s : keys){ //берём список ключей и печатаем вместе со значением
            System.out.println("Слово с максимальным количеством повторений : " + s + ", количество повторений : " + map.get(s));
        }
        System.out.println(); //отступ
        System.out.println("Статистика, сколько раз каждое слово встречается в файле:"); //заголовок для статистики по словам
        for (Map.Entry<String, Integer> pair : map.entrySet()) { //проходимся по мапе
            //печатаем информаци. о парах
            System.out.println("Слово "+ pair.getKey() + " встречается " + pair.getValue() + " раз(а).");
        }
    }
}
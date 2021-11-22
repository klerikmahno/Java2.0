package Calculator;

import Calculator.Action.Action;

/**
 * Класс расчётов, каждый образец - запуск расчёта
 * Класс создаёт новый выбор действия
 * @see SelectAction
 * @author Pavlenko Sergey
 */

public class Calculator {

       public Calculator() throws Exception{ //консруктор с запуском расчёта
           //запускаем выбор расчёта, входные параметры - новые объекты класса ввода цифры
        new SelectAction(new InputA().input(),new InputA().input());
    }
}

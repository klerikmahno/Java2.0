/**
 * Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 * @author Pavlenko Sergey
 * @see Sweets абстрактный класс сладостей
 */
public class Present {
    public static void main(String[] args) {
        Sweets[] present = new Sweets[6]; //создаём подарок (массив с шестью сладостями)
        //заполняем массив разными сладостями
        present[0] = new Candy();
        present[1] = new Jellybean();
        present[2] = new Cupcake();
        present[3] = new KitKat();
        present[4] = new Lollypop();
        present[5] = new Marshmallow();

        //выводим информацию пользователю о всех сладостях
        System.out.println("Информация о всех сладостях в подарке:"+ "\n");
        int allWeight = 0; //общий вес
        int allPrice = 0; //общая стоимость
        for(Sweets i : present){ // цикл по массиву (печатаем информацию и находим общий вес и стоимость)
            i.printInfo(); //вызываем метод печати информации каждой сладости
            allWeight += i.weight; //считаем общий вес
            allPrice += i.price; //считаем общую стоимость
        }
        //выводим информацию пользователю о общих весе и стоимости
        System.out.println("Общий вес подарка: "+ allWeight + " грамм.");
        System.out.println("Общая стоимость подарка "+ allPrice + " рублей.");

    }
    private static abstract class Sweets{ //абстрактный класс сладостей
        String name; //имя сладости
        int weight; //вес сладости
        int price; //цена сладости

        public void printInfo(){ } //общий метод вывода информации по сладости

    }
    public static class Candy extends Sweets{ //класс конфеты

        private String wrapper = "Красивый"; //фантик (уникальный параметр)

        public Candy(){ //конструктор класса без входных параметров, все объекты у нас будут одинаковые
            //заполняем переменные из родительского класса
            this.name = "Конфета";
            this.weight = 10;
            this.price = 7;
        }

        @Override
        public void printInfo() { //переопределяем метод печати информации из родительского класса
            //выводим информацию о сладости для пользователя
            System.out.println("Вид сладости: "+this.name);
            System.out.println("Вес конфеты: "+ this.weight + " грамм");
            System.out.println("Цена конфеты: "+ this.price + " рублей");
            System.out.println("Фантик конфеты: "+ this.wrapper + "\n");
        }

    }
    public static class Jellybean extends Sweets{ //драже
        private int packageQuantity = 50;//кол-во в упаковке (уникальный параметр)
        public Jellybean( ){ //конструктор класса без входных параметров, все объекты у нас будут одинаковые
            //заполняем переменные из родительского класса
            this.name = "Драже";
            this.weight = 40;
            this.price = 12;
        }

        @Override
        public void printInfo() { //переопределяем метод печати информации из родительского класса
            //выводим информацию о сладости для пользователя
            System.out.println("Вид сладости: "+this.name);
            System.out.println("Вес драже: "+ this.weight + " грамм");
            System.out.println("Цена драже: "+ this.price + " рублей");
            System.out.println("Количество в упаковке : "+ this.packageQuantity + "\n");
        }
    }
    public static class Cupcake extends Sweets{ //кекс
        private String filling = "Черника"; //вкус начинки кекса (уникальный параметр)
        public Cupcake( ){ //конструктор класса без входных параметров, все объекты у нас будут одинаковые
            //заполняем переменные из родительского класса
            this.name = "Кекс";
            this.weight = 25;
            this.price = 40;
        }

        @Override
        public void printInfo() { //переопределяем метод печати информации из родительского класса
            //выводим информацию о сладости для пользователя
            System.out.println("Вид сладости: "+this.name);
            System.out.println("Вес кекса: "+ this.weight + " грамм");
            System.out.println("Цена кекса: "+ this.price + " рублей");
            System.out.println("Вкус начинки : "+ this.filling + "\n");
        }
    }
    public static class KitKat extends Sweets{ //киткат
        private String taste = "Оригинальный"; //вкус (уникальный параметр)
        public KitKat( ){ //конструктор класса без входных параметров, все объекты у нас будут одинаковые
            //заполняем переменные из родительского класса
            this.name = "Киткат";
            this.weight = 17;
            this.price = 55;
        }

        @Override
        public void printInfo() { //переопределяем метод печати информации из родительского класса
            //выводим информацию о сладости для пользователя
            System.out.println("Вид сладости: "+this.name);
            System.out.println("Вес киткат: "+ this.weight + " грамм");
            System.out.println("Цена киткат: "+ this.price);
            System.out.println("Вкус : "+ this.taste + "\n");
        }
    }
    public static class Lollypop extends Sweets{ // леденец
        private String form = "Петушок";//форма леденца (уникальный параметр)
        public Lollypop( ){ //конструктор класса без входных параметров, все объекты у нас будут одинаковые
            //заполняем переменные из родительского класса
            this.name = "Леденец";
            this.weight = 13;
            this.price = 19;
        }

        @Override
        public void printInfo() { //переопределяем метод печати информации из родительского класса
            //выводим информацию о сладости для пользователя
            System.out.println("Вид сладости: "+this.name);
            System.out.println("Вес леденца: "+ this.weight + " грамм");
            System.out.println("Цена леденца: "+ this.price + " рублей");
            System.out.println("Форма леденца : "+ this.form + "\n");
        }
    }
    public static class Marshmallow  extends Sweets{ //зифирки
        private String color = "Розовый"; //цвет (уникальный параметр)
        public Marshmallow( ){ //конструктор класса без входных параметров, все объекты у нас будут одинаковые
            //заполняем переменные из родительского класса
            this.name = "Зифирки";
            this.weight = 100;
            this.price = 77;
        }

        @Override
        public void printInfo() { //переопределяем метод печати информации из родительского класса
            //выводим информацию о сладости для пользователя
            System.out.println("Вид сладости: "+this.name);
            System.out.println("Вес зифирок: "+ this.weight + " грамм");
            System.out.println("Цена зифирок: "+ this.price + " рублей");
            System.out.println("Цвет зифирок : "+ this.color + "\n");
        }
    }
}
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * В учебном центре есть программы обучения, которые состоят из различных курсов.
 * У каждой программы есть дата начала и длительность, которая считается как сумма длительности курсов программы с учетом 8-ми часового рабочего дня.
 * У курса есть название и его продолжительность в часах. Студенты записываются на программы обучения.
 * Хотим получать отчет о текущем курсе для студента. Есть два типа отчетов.
 * Короткий отчет: в нем предоставляется информация о студенте, дате старта его программы обучения, длительности программы в часах и статусе программы (еще не началась, уже закончилась, в процессе)
 * Развернутый отчет: в нем предоставляется информация о студенте, его программе, дате старта программы, длительности программы в часах, курсах программы
 * @author Pavlenko Sergey
 */

public class Education {
    
    public static void main(String[] args){
        //Создаём трёх студентов с разными программами обучения
        Student st1 = new Student("Сергей",new Engineer());
        Student st2 = new Student("Владимир",new Manager());
        Student st3 = new Student("Юлианна",new Doctor());
        //короткие отчёты по студентам
        shortReport(st1);
        shortReport(st2);
        shortReport(st3);
        //развернутые отчёты по студентам
        longReport(st1);
        longReport(st2);
        longReport(st1);
    }

    public static void shortReport(Student st){ //метод короткого отчёта
        System.out.println("Имя студента: "+ st.name);
        st.prog.getInfo(); //вызываем метод получения информации из класса программ
        st.prog.dateCheck(); //вызываем метод проверки статуса программы
    }

    public static void longReport(Student st){ //метод развёрнутого отчёта
        System.out.println("Развёрнутый отчёт по студенту: "); //добавил для удобства чтения, когда все сразу отчёты вызываешь (как в main сейчас)
        shortReport(st); //вызываем короткий отчёт
        st.prog.getInfoCourse(); //вызываем информацию по курсам программы
    }

    public static class Student{ //студент
        private String name; //имя студента
        private Program prog; //программа студента
        public Student(String name, Program prog){ //коструктор в зависимости от программы обучения
            this.name = name;
            this.prog = prog; //записываем программу обучения студенту в зависимости от переданного параметра
        }
    }

    public static abstract class Program { //абстрактный класс программы обучения
        String name; //название программы обучения
        Calendar startDate; //дата начала курса, использывал календарь для удобства
        int progDuration; //длительность в часах, как указано в задании
        Course[] prog = new Course[4]; //создаём массив курсов, не стал делать ArrayList, так как у меня все программы по 4 курса
        public void getInfo(){ //метод вывода информации о программе
            System.out.println("Называние программы обучения: "+ name);
            //не стал использовать дататрансформ, так как только в этом методе вывод даты
            System.out.println("Дата начала программы обучения: "+ startDate.get(Calendar.DAY_OF_MONTH)+"/"+ startDate.get(Calendar.MONTH)+"/"+ startDate.get(Calendar.YEAR));
            System.out.println("Длительность программы обучения: "+ progDuration * 8 + " часов"); //умнажаем на 8 дни для вывода в часах, как указано в программе
        }
        public void getInfoCourse() { //метод вывода информации о курсах в программе
            System.out.println("Информация о курсах:");
            for (Course c : prog){
                c.getInfo(); //вызываем информацию о каждом курсе
            }
        }
        public void dateCheck(){ //проверка статуса программы
            if(startDate.before(Calendar.getInstance())) { //сравниваем дату начала курса с сегодняшней датой
                // если дата в прошлом
                Calendar c = (Calendar) startDate.clone();//создаём переменную каледарь из клона даты начала программы и приводим к типу Календарь
                c.add(Calendar.DAY_OF_MONTH,progDuration); //прибавляем длительность программы в днях
                if(c.before(Calendar.getInstance())) { //сравниваем дату начала курса+длтельность с сегодняшней датой
                    System.out.println("Программа уже закончилась");
                }else System.out.println("Программа в процессе");
            }else System.out.println("Программа еще не началась"); //если начало курса в будущем
        }
    }
    public static abstract class Course{ //абстрактный класс курса
        String name; //имя курса
        int courseDuration; //длительность курса в часах
        public void getInfo(){ //метод получения информации о курсе
            System.out.println("Называние курса: " + name);
            System.out.println("Длительность курса: " + courseDuration + " часов");
        }
    }

    public static class Engineer extends Program{ //программа обучения для инжинера
        public Engineer(){ //конструктор создаёт одинаковые программы обучения для инженера
            name = "Инжинер";
            prog[0] = new Math(); //курс математики
            prog[1] = new Physics(); //курс физики
            prog[2] = new Mechanics(); //курс механики
            prog[3] = new ForeignLanguage(); //курс инастранного языка
            for(Course c : prog){ //считаем длительность программы
                progDuration += c.courseDuration / 8; //часы курсов переводим в дни
            }
            startDate = new GregorianCalendar(2021, 8 , 1); //дата начала курса
        }

    }
    public static class Manager extends Program{ //программа обучения для менеджера
        public Manager(){ //конструктор создаёт одинаковые программы обучения для инженера
            name = "Менеджер";
            prog[0] = new Math(); //курс математики
            prog[1] = new Marketing(); //курс маркетинга
            prog[2] = new Advertising(); //курс рекламы
            prog[3] = new ForeignLanguage(); //курс инастранного языка
            for(Course c : prog){ //считаем длительность программы
                progDuration += c.courseDuration / 8; //часы курсов переводим в дни
            }
            startDate = new GregorianCalendar(2021, 10 , 1); //дата начала курса
        }
    }
    public static class Doctor extends Program{ //программа обучения для врача
        public Doctor(){
            name = "Врач"; //конструктор создаёт одинаковые программы обучения для инженера
            prog[0] = new Chemistry(); //курс химии
            prog[1] = new Latin(); //курс латыни
            prog[2] = new Biology(); //курс биологии
            prog[3] = new ForeignLanguage(); //курс инастранного языка
            for(Course c : prog){ //считаем длительность программы
                progDuration += c.courseDuration / 8; //часы курсов переводим в дни
            }
            startDate = new GregorianCalendar(2022, 3 , 1); //дата начала курса
        }
    }
    public static class Math extends Course{ //курс матиматика
        public Math(){ //конструктор класса
            name = "Высшая математика";
            courseDuration = 144; //длтельность курса в часах
        }
    }
    public static class Physics extends Course{ //курс физика
        public Physics(){ //конструктор класса
            name = "Физика";
            courseDuration = 112; //длтельность курса в часах
        }
    }
    public static class Mechanics extends Course{ //курс механика
        public Mechanics(){ //конструктор класса
            name = "Механика";
            courseDuration = 72; //длтельность курса в часах
        }
    }
    public static class Chemistry extends Course{ //курс химия
        public Chemistry(){ //конструктор класса
            name = "Химия";
            courseDuration = 136; //длтельность курса в часах
        }
    }
    public static class Latin extends Course{ //курс латынь
        public Latin(){ //конструктор класса
            name = "Латынь";
            courseDuration = 56; //длтельность курса в часах
        }
    }
    public static class Biology extends Course{ //курс биология
        public Biology(){ //конструктор класса
            name = "Биология";
            courseDuration = 120; //длтельность курса в часах
        }
    }
    public static class Marketing extends Course{ //курс маркетинг
        public Marketing(){ //конструктор класса
            name = "Маркетинг";
            courseDuration = 72; //длтельность курса в часах
        }
    }
    public static class ForeignLanguage extends Course{ //курс иностранный язык
        public ForeignLanguage(){ //конструктор класса
            name = "Иностранный язык";
            courseDuration = 56; //длтельность курса в часах
        }
    }
    public static class Advertising extends Course{ //курс реклама
        public Advertising(){ //конструктор класса
            name = "Курс рекламы";
            courseDuration = 72; //длтельность курса в часах
        }
    }
}

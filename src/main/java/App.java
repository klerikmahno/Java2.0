import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> res = new LinkedList<>();
        res.add("Света");res.add("Антон"); res.add("ДимаС");res.add("ДимаБ");
        res.add("Митя");res.add("Витя"); res.add("Артём");res.add("Юра");
        res.add("Валера");res.add("Серёжа"); res.add("Никита");res.add("Сурен");
        Collections.shuffle(res);
        System.out.println("Нытики: "+ res.get(0)+", "+res.get(4)+", "+res.get(8));
        System.out.println("Голосовальщик: "+ res.get(1)+", "+res.get(5));
        System.out.println("Позитивчик: "+ res.get(2)+", "+res.get(6)+", "+res.get(10));
        System.out.println("Решала: "+ res.get(3)+", "+res.get(7)+", "+res.get(9));
    }
}

package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Starter {
    public static void main(String[] args) {

        boolean b = Starter.checkBalance("{khkh{khkk[knk]kj}}");
        System.out.println(b);

    }

    //проверка баланса скобок
    static boolean checkBalance(String s) {

        //убираю лишние символы
        Predicate<String> predicate = x -> x.equals("{") || x.equals("}") || x.equals("[") || x.equals("]") || x.equals("(") || x.equals(")");
        List<String> filtered = new ArrayList<>(Arrays.asList(s.split("")))
                .stream()
                .filter(predicate)
                .collect(Collectors.toList());

        //проверка критичных случаев на входе
        if (!filtered.isEmpty() && filtered.size() % 2 > 0) {
            return false;
        } else if (filtered.get(0).equals("}") || filtered.get(0).equals("]") || filtered.get(0).equals(")")) {
            return false;
        } else {

            //проход из середины к краю и попарное удаление
            for (int i = filtered.size() / 2 - 1; i >= 0; i--) {

                if (filtered.get(i).equals("{") && filtered.get(i + 1).equals("}")) {
                    filtered.remove(i + 1);
                    filtered.remove(i);
                } else if (filtered.get(i).equals("[") && filtered.get(i + 1).equals("]")) {
                    filtered.remove(i + 1);
                    filtered.remove(i);
                } else if (filtered.get(i).equals("(") && filtered.get(i + 1).equals(")")) {
                    filtered.remove(i + 1);
                    filtered.remove(i);
                }
            }
            return filtered.isEmpty(); //если всем нашлась пара, в конце получаю пустую коллекцию
        }
    }
}

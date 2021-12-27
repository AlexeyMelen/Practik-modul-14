import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class StreamAPI {

    public static void Stream() {

        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("Введите Имя: ");
        while (true) {
            System.out.print("Имя = ");
            s = scanner.nextLine();
            if (s.equals("") == true)
                break;
            list.add(s);
        }
        System.out.println();

        System.out.println("Список = " + list);

        Predicate<String> fn;

        fn = (str) -> {
            if (str.charAt(0) == 'А')
                return true;
            return false;
        };

        Stream<String> stream = list.stream();
        Stream<String> resStream = stream.filter(fn);
        System.out.println("Количество = " + resStream.count());
    }

    public static void main(String[] args) {
        Stream();
    }
}
import java.util.Arrays;
import java.util.List;

public class Java8Learn2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "hello world");

        list.stream().mapToInt(String::length).filter(item -> item == 5).findFirst().ifPresent(System.out::println);

    }


}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = numbers.stream();

        /*
        int[] arr = {1, 3, 4, 5, 6};
        IntStream intStream = Arrays.stream(arr);
        */

        numbers.stream().filter((n) -> n % 2 == 0 );

    }
}
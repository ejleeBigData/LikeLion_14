import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box {
    public static <T> void displayArray(List<T> array) {
        for(T element: array) {
            System.out.println(element);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        //numbers.add(8); numbers.remove(5);

        List<String> words = new ArrayList<>(Arrays.asList("Red", "Yellow", "Orange"));
        words.add("Green");
        words.sort(null);

        Box.displayArray(numbers);
        Box.displayArray(words);

    }
}
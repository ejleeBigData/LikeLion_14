import java.util.Arrays;
import java.util.List;

public class Main {

    public static double sumList(List<? extends Number> list) {
        double sum = 0;

        for(Number n: list) {
            sum += n.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2, 3, 2, 5, 1);
        List<Double> doubleList = Arrays.asList(2.1, 3.44, 5.121, 7.1212);

        System.out.println(sumList(intList));
        System.out.println(sumList(doubleList));
    }
}
class Box {
    public static <T> void displayArray(T[] array) {
        for(T element: array) {
            System.out.println(element);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = { 11, 22, 33, 44, 55 };
        String[] words = {"Spring", "Summer", "Fall"};

        Box.displayArray(numbers);
        Box.displayArray(words);

    }
}
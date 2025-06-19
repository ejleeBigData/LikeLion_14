import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> gamePrices = new HashMap<>();

        gamePrices.put("테트리스", 500);
        gamePrices.put("오징어", 1000);
        gamePrices.put("헥사", 3500);
        gamePrices.put("고스톱", 2500);
        gamePrices.put("포커", 1500);

        System.out.println(gamePrices.containsKey("오징어"));
        System.out.println(gamePrices.containsValue("20000"));
    }
}
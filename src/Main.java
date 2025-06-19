import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> gamePrices = new TreeMap<>();

        gamePrices.put("테트리스", 500);
        gamePrices.put("오징어", 1000);
        gamePrices.put("헥사", 3500);
        gamePrices.put("고스톱", 2500);
        gamePrices.put("포커", 1500);

        System.out.println(gamePrices.containsKey("오징어"));
        System.out.println(gamePrices.containsValue("20000"));
        System.out.println(gamePrices.getOrDefault("포커", 2000));

        gamePrices.replace("고스톱", 1200);
        gamePrices.remove("포커");

        for(Map.Entry<String, Integer> entry : gamePrices.entrySet() ) {
            System.out.println(entry.getKey() + " 값 : " + entry.getValue() + " 원");
        }


}
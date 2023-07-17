package Testcases;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStoragePractice {

    public static void main(String[] args) {
        int[] array = new int[3];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        System.out.println(array.length);
        String[] cars = new String[2];
        cars[0] = "BMW";
        cars[1] = "Ford";
        System.out.println(cars[1]);
        System.out.println(cars[0]);

        List<Object> shoppingList = new ArrayList<>();
        shoppingList.add("Apple");
        shoppingList.add("Bananas");
        shoppingList.add("Pinapple");
        System.out.println(shoppingList);

        List<Object> abc = new ArrayList<>();
        abc.add("String");
        abc.add(100);
        abc.add(false);
        System.out.println(abc);
        System.out.println(abc.size());
        abc.remove(1);
        System.out.println(abc);
        System.out.println(abc.get(0));
        System.out.println(abc.contains(false));
        System.out.println(abc.contains(100));

        Map<String,String> friendsWithProfessions = new HashMap<>();
        friendsWithProfessions.put("Adam","Plumber");
        friendsWithProfessions.put("Alice","Driver");
        friendsWithProfessions.put("Dylan","Painter");
        System.out.println(friendsWithProfessions);
        System.out.println(friendsWithProfessions.get("Dylan"));
        System.out.println(friendsWithProfessions.size());
        friendsWithProfessions.remove("Adam");
        System.out.println(friendsWithProfessions);
        System.out.println(friendsWithProfessions.size());

    }
}

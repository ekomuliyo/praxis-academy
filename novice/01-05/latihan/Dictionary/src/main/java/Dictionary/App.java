/*
 * belajar dictionary menggunakan hashMap()
 */
package Dictionary;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("Zara", "10");
        map.put("Mahnaz", "31");
        map.put("Ayan", "12");
        map.put("Daisy", "14");

        System.out.println();
        System.out.println(" Map Elements");
        System.out.println(map);
    }
}

package colecciones;

import java.util.concurrent.ConcurrentSkipListMap;

public class SkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> mapa = new ConcurrentSkipListMap<>();

        mapa.put(3, "C");
        mapa.put(1, "A");
        mapa.put(2, "B");
        mapa.put(5, "E");

        System.out.println("Elementos en orden:");
        mapa.forEach((k, v) -> System.out.println(k + " → " + v));

        System.out.println("Primer elemento: " + mapa.firstEntry());
        System.out.println("Último elemento: " + mapa.lastEntry());
    }
}

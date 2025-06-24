package colecciones;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> inventario = new LinkedHashMap<>();

        inventario.put("Martillo", 10);
        inventario.put("Destornillador", 15);
        inventario.put("Llave inglesa", 5);

        for (Map.Entry<String, Integer> entrada : inventario.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }
    }
}


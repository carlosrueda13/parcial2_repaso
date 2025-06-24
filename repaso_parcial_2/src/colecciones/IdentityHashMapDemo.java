package colecciones;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<String, String> mapa = new IdentityHashMap<>();

        String clave1 = new String("clave");
        String clave2 = new String("clave");

        mapa.put(clave1, "valor1");
        mapa.put(clave2, "valor2");

        System.out.println("Tamaño del mapa: " + mapa.size()); // 2, porque son claves distintas por referencia

        mapa.forEach((k, v) -> System.out.println(k + " → " + v));
    }
}


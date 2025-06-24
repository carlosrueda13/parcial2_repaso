package colecciones;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {
    public static void main(String[] args) {
        List<String> lista = new CopyOnWriteArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");

        for (String item : lista) {
            System.out.println("Leyendo: " + item);
            lista.add("Nuevo-" + item); // No lanza error
        }

        System.out.println("Tamaño final: " + lista.size());
        System.out.println("Contenido: " + lista);
    }
}


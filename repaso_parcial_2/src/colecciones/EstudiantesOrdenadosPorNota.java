package colecciones;

import java.util.*;

public class EstudiantesOrdenadosPorNota {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();

        // Paso 1: Agregar estudiantes (nombres desordenados alfabéticamente)
        notas.put("Carlos", 85);
        notas.put("Ana", 92);
        notas.put("Luis", 78);
        notas.put("Beatriz", 90);

        // Paso 2: Convertir a lista de entradas
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(notas.entrySet());

        // Paso 3: Ordenar por valor (nota), de mayor a menor
        lista.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Paso 4: Imprimir resultados
        System.out.println("Estudiantes ordenados por nota (mayor a menor):");
        for (Map.Entry<String, Integer> entry : lista) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}


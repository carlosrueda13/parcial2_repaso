package colecciones;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> colores = new LinkedHashSet<>();

        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Rojo"); // Duplicado, será ignorado

        for (String color : colores) {
            System.out.println(color);
        }
    }
}


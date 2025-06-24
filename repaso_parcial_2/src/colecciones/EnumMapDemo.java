package colecciones;

import java.util.EnumMap;

public class EnumMapDemo {

    enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES
    }

    public static void main(String[] args) {
        EnumMap<DiaSemana, String> horarios = new EnumMap<>(DiaSemana.class);

        horarios.put(DiaSemana.LUNES, "8:00 - 17:00");
        horarios.put(DiaSemana.MARTES, "8:00 - 17:00");
        horarios.put(DiaSemana.VIERNES, "8:00 - 15:00");

        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia + ": " + horarios.getOrDefault(dia, "No definido"));
        }
    }
}

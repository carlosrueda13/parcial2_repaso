package colecciones;
import java.util.*;

public class TreeSetPractice {

    final TreeSet<String> nombres;

    public TreeSetPractice(TreeSet<String> nombres) {
        this.nombres = nombres;
    }
    public void addName(String name) {
        nombres.add(name);
        System.out.println("Nombre Agregado");
    }
    public TreeSet<String> getNombres() {
        return nombres;
    }
    public static void main(String[] args) {
        TreeSetPractice app = new TreeSetPractice(new TreeSet<>());
        System.out.println("Ingrese un nombre:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        app.addName(name);
        System.out.println("Ingrese un nombre:");
        name = scanner.nextLine();
        app.addName(name);
        System.out.println("Ingrese un nombre:");
        name = scanner.nextLine();
        app.addName(name);
        System.out.println("Ingrese un nombre:");
        name = scanner.nextLine();
        app.addName(name);
        System.out.println("Ingrese un nombre:");
        name = scanner.nextLine();
        app.addName(name);
        System.out.println("Ingrese un nombre:");
        name = scanner.nextLine();
        app.addName(name);
        System.out.println("Nombres ingresados: " + app.getNombres());
    }
}

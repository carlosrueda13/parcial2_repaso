package swing;

import javax.swing.*;
import java.awt.event.*;

public class DemoMenu extends JFrame {
    public DemoMenu() {
        setTitle("Demo JMenu y JOptionPane");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear barra de menú
        JMenuBar barra = new JMenuBar();

        // Menú "Archivo"
        JMenu menuArchivo = new JMenu("Archivo");

        // Ítems de menú
        JMenuItem itemSaludar = new JMenuItem("Saludar");
        JMenuItem itemSalir = new JMenuItem("Salir");

        itemSaludar.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "¡Hola desde Swing!")
        );

        itemSalir.addActionListener(e ->
                System.exit(0)
        );

        // Armar menú
        menuArchivo.add(itemSaludar);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);
        barra.add(menuArchivo);

        // Asignar barra a ventana
        setJMenuBar(barra);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DemoMenu().setVisible(true));
    }
}


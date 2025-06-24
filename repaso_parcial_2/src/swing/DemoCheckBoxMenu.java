package swing;

import javax.swing.*;
import java.awt.event.*;

public class DemoCheckBoxMenu extends JFrame {
    private JLabel etiqueta;

    public DemoCheckBoxMenu() {
        setTitle("JMenuBar + JCheckBoxMenuItem");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        etiqueta = new JLabel("Texto visible");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        add(etiqueta);

        // Barra de menú
        JMenuBar barra = new JMenuBar();

        // Menú "Ver"
        JMenu menuVer = new JMenu("Ver");
        JCheckBoxMenuItem itemMostrar = new JCheckBoxMenuItem("Mostrar texto");
        itemMostrar.setSelected(true);

        itemMostrar.addActionListener(e -> {
            etiqueta.setVisible(itemMostrar.isSelected());
        });

        menuVer.add(itemMostrar);
        barra.add(menuVer);

        setJMenuBar(barra);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DemoCheckBoxMenu().setVisible(true));
    }
}


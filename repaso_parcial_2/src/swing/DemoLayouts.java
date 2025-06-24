package swing;

import javax.swing.*;
import java.awt.*;

public class DemoLayouts extends JFrame {
    public DemoLayouts() {
        setTitle("Paneles y Layouts");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal con BorderLayout
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Panel superior (NORTH)
        JPanel panelSuperior = new JPanel();
        panelSuperior.add(new JLabel("Encabezado"));

        // Panel central con botones en GridLayout
        JPanel panelCentral = new JPanel(new GridLayout(2, 2, 10, 10));
        panelCentral.add(new JButton("1"));
        panelCentral.add(new JButton("2"));
        panelCentral.add(new JButton("3"));
        panelCentral.add(new JButton("4"));

        // Panel inferior (SOUTH)
        JPanel panelInferior = new JPanel();
        panelInferior.add(new JButton("Aceptar"));

        // Armar layout
        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);
        panelPrincipal.add(panelInferior, BorderLayout.SOUTH);

        setContentPane(panelPrincipal);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DemoLayouts().setVisible(true));
    }
}


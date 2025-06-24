package swing;

import javax.swing.*;

public class DemoTabbedPane extends JFrame {
    public DemoTabbedPane() {
        setTitle("Demo JTabbedPane y JPanel");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane pestañas = new JTabbedPane();

        // Panel 1: Datos del usuario
        JPanel panelUsuario = new JPanel();
        panelUsuario.add(new JLabel("Nombre:"));
        panelUsuario.add(new JTextField(15));

        // Panel 2: Configuración
        JPanel panelConfig = new JPanel();
        panelConfig.add(new JCheckBox("Activar sonido"));
        panelConfig.add(new JCheckBox("Modo oscuro"));

        // Añadir paneles como pestañas
        pestañas.addTab("Usuario", panelUsuario);
        pestañas.addTab("Configuración", panelConfig);

        add(pestañas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DemoTabbedPane().setVisible(true));
    }
}

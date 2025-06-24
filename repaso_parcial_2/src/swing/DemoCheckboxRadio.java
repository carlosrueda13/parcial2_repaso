package swing;

import javax.swing.*;

public class DemoCheckboxRadio extends JFrame {
    public DemoCheckboxRadio() {
        setTitle("CheckBox y RadioButton");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        // JCheckBox
        JCheckBox notificaciones = new JCheckBox("Recibir notificaciones");
        notificaciones.setBounds(30, 20, 200, 30);

        // JRadioButton
        JRadioButton claro = new JRadioButton("Tema claro");
        JRadioButton oscuro = new JRadioButton("Tema oscuro");
        claro.setBounds(30, 60, 120, 30);
        oscuro.setBounds(30, 90, 120, 30);

        ButtonGroup grupoTemas = new ButtonGroup();
        grupoTemas.add(claro);
        grupoTemas.add(oscuro);

        // Botón para mostrar selección
        JButton mostrar = new JButton("Mostrar selección");
        mostrar.setBounds(30, 130, 200, 30);

        mostrar.addActionListener(e -> {
            String msg = "Notificaciones: " + (notificaciones.isSelected() ? "Sí" : "No") + "\n";
            msg += "Tema: " + (claro.isSelected() ? "Claro" : oscuro.isSelected() ? "Oscuro" : "Ninguno");
            JOptionPane.showMessageDialog(this, msg);
        });

        add(notificaciones);
        add(claro);
        add(oscuro);
        add(mostrar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DemoCheckboxRadio().setVisible(true));
    }
}


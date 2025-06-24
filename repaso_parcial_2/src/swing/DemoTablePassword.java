package swing;

import javax.swing.*;
import java.awt.*;

public class DemoTablePassword extends JFrame {
    public DemoTablePassword() {
        setTitle("JTable y JPasswordField");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel usuarioLbl = new JLabel("Usuario:");
        usuarioLbl.setBounds(20, 20, 100, 25);
        JTextField usuarioField = new JTextField();
        usuarioField.setBounds(90, 20, 150, 25);

        JLabel claveLbl = new JLabel("Clave:");
        claveLbl.setBounds(20, 55, 100, 25);
        JPasswordField claveField = new JPasswordField();
        claveField.setBounds(90, 55, 150, 25);

        JButton ingresarBtn = new JButton("Ingresar");
        ingresarBtn.setBounds(260, 35, 100, 30);

        String[][] usuarios = {
                { "Juan", "Administrador" },
                { "Ana", "Operador" },
                { "Carlos", "Invitado" }
        };
        String[] columnas = { "Nombre", "Rol" };

        JTable tabla = new JTable(usuarios, columnas);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(20, 100, 440, 130);

        ingresarBtn.addActionListener(e -> {
            String usuario = usuarioField.getText();
            String clave = new String(claveField.getPassword());
            JOptionPane.showMessageDialog(this, "Usuario: " + usuario + "\nClave: " + clave);
        });

        add(usuarioLbl);
        add(usuarioField);
        add(claveLbl);
        add(claveField);
        add(ingresarBtn);
        add(scroll);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DemoTablePassword().setVisible(true));
    }
}

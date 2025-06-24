package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoBoton extends JFrame {
    public DemoBoton() {
        setTitle("Demo JButton");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton boton = new JButton("Haz clic");
        boton.setBounds(90, 70, 120, 30);

        JLabel etiqueta = new JLabel("Esperando clic...");
        etiqueta.setBounds(90, 30, 200, 30);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("¡Botón presionado!");
            }
        });

        add(boton);
        add(etiqueta);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DemoBoton().setVisible(true));
    }
}

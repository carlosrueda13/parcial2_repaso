package swing;

import javax.swing.*;
import java.awt.event.*;

public class DemoTeclado extends JFrame {
    public DemoTeclado() {
        setTitle("Demo KeyListener");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JTextField campo = new JTextField();
        campo.setBounds(100, 50, 200, 30);

        JLabel etiqueta = new JLabel("Presiona una tecla...");
        etiqueta.setBounds(100, 100, 250, 30);

        campo.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                etiqueta.setText("Tecla presionada: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        add(campo);
        add(etiqueta);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DemoTeclado().setVisible(true));
    }
}


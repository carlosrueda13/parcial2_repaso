package swing;

import javax.swing.*;
import java.awt.event.*;

public class DemoEventos extends JFrame {
    public DemoEventos() {
        setTitle("Eventos de Ventana y Mouse");
        setSize(400, 200);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel etiqueta = new JLabel("Haz clic aquí");
        etiqueta.setBounds(140, 70, 120, 30);

        // Listener de ventana
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(
                        DemoEventos.this,
                        "¿Estás seguro de que quieres salir?",
                        "Confirmar salida",
                        JOptionPane.YES_NO_OPTION
                );
                if (confirm == JOptionPane.YES_OPTION) {
                    dispose(); // o System.exit(0);
                }
            }
        });

        // Listener de mouse
        etiqueta.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(DemoEventos.this, "¡Etiqueta clickeada!");
            }
        });

        add(etiqueta);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DemoEventos().setVisible(true));
    }
}


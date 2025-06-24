package swing;

import javax.swing.*;

public class DemoTextArea extends JFrame {
    public DemoTextArea() {
        setTitle("JTextArea con JScrollPane");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextArea areaTexto = new JTextArea(10, 30);
        areaTexto.setLineWrap(true); // Romper líneas automáticamente
        areaTexto.setWrapStyleWord(true); // Romper por palabras

        JScrollPane scrollPane = new JScrollPane(areaTexto);
        add(scrollPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DemoTextArea().setVisible(true));
    }
}


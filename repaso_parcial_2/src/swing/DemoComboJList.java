package swing;

import javax.swing.*;
import java.awt.event.*;

public class DemoComboJList extends JFrame {
    public DemoComboJList() {
        setTitle("JComboBox y JList");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // JComboBox
        String[] colores = { "Rojo", "Verde", "Azul" };
        JComboBox<String> comboColores = new JComboBox<>(colores);
        comboColores.setBounds(30, 30, 150, 30);

        // JList
        String[] frutas = { "Manzana", "Banano", "Pera", "Mango" };
        JList<String> listaFrutas = new JList<>(frutas);
        listaFrutas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollFrutas = new JScrollPane(listaFrutas);
        scrollFrutas.setBounds(30, 70, 150, 100);

        // Botón
        JButton mostrar = new JButton("Mostrar selección");
        mostrar.setBounds(30, 190, 180, 30);

        mostrar.addActionListener(e -> {
            String color = (String) comboColores.getSelectedItem();
            java.util.List<String> frutasSel = listaFrutas.getSelectedValuesList();
            JOptionPane.showMessageDialog(this,
                    "Color: " + color + "\nFrutas: " + frutasSel);
        });

        add(comboColores);
        add(scrollFrutas);
        add(mostrar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DemoComboJList().setVisible(true));
    }
}


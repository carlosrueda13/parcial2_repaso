package swing;

import javax.swing.*;

public class DemoInternalFrame extends JFrame {
    public DemoInternalFrame() {
        setTitle("MDI con JInternalFrame");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane escritorio = new JDesktopPane();

        JInternalFrame ventana1 = new JInternalFrame("Documento 1", true, true, true, true);
        ventana1.setSize(250, 150);
        ventana1.setLocation(30, 30);
        ventana1.setVisible(true);

        JInternalFrame ventana2 = new JInternalFrame("Documento 2", true, true, true, true);
        ventana2.setSize(250, 150);
        ventana2.setLocation(300, 80);
        ventana2.setVisible(true);

        escritorio.add(ventana1);
        escritorio.add(ventana2);

        setContentPane(escritorio);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DemoInternalFrame().setVisible(true));
    }
}


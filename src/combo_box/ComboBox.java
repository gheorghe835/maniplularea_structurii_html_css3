package combo_box;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox {
    public static void main(String[] args) {
        //  ... Crearea ferestrei principale
        JFrame frame = new JFrame("ComboBox & Div");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Crearea unui JComboBox cu elemente arbitrare
        String[] items = {"Element_1", "Element_2", "Element_3", "Element_N"};
        JComboBox<String> comboBox = new JComboBox<>(items);
}
}

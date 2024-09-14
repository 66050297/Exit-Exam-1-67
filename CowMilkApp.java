import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CowMilkApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame(" Cow Milk Produck");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(444, 222);

        JLabel idLabel = new JLabel("     Enter Cow ID:");
        JTextField idField = new JTextField(8);
        JButton submitButton = new JButton("Moo");
        JLabel resultLabel = new JLabel("     Show Me The Milkky");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout( 4, 1));
        panel.add(idLabel);
        panel.add(idField);
        panel.add(submitButton);
        panel.add(resultLabel);

        frame.add(panel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cowId = idField.getText();
                if (cowId.length() == 8 && !cowId.startsWith("0")) {
                    CowMilkController.handleCowId(cowId, resultLabel);
                } else {
                    resultLabel.setText("Please enter 8 number and No 0.");
                }
            }
        });

        frame.setVisible(true);
    }
}

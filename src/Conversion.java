import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conversion extends JFrame {
    public Conversion() {
        JPanel panel = new JPanel();
        JLabel inputLabel = new JLabel("Input Value");
        JTextField inputField = new JTextField(5);
        JButton convertToFahrenheitButton = new JButton("Convert to Fahrenheit");
        JButton convertToCelsiusButton = new JButton("Convert to Celsius");
        JLabel outputLabel = new JLabel("Output Value");
        JTextField outputField = new JTextField(5);
        outputField.setEditable(false);

        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(convertToFahrenheitButton);
        panel.add(convertToCelsiusButton);
        panel.add(outputLabel);
        panel.add(outputField);
        panel.add(convertToFahrenheitButton);
        panel.add(convertToCelsiusButton);

        convertToFahrenheitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int input = Integer.parseInt(inputField.getText());
                    outputField.setText(String.valueOf ((input*9/5)+32));
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        });

        convertToCelsiusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int input = Integer.parseInt(inputField.getText());
                    outputField.setText(String.valueOf ((input-32)*5/9));
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        });

        add(panel);
        setTitle("Conversion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 100);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
    }
}

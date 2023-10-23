import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class upi_3b extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    upi_3b frame = new upi_3b();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public upi_3b() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        setUndecorated(true);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new LineBorder(new Color(192, 192, 192), 2));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblEnterUpiId = new JLabel("ENTER UPI DETAILS");
        lblEnterUpiId.setForeground(new Color(255, 255, 255));
        lblEnterUpiId.setFont(new Font("Verdana", Font.BOLD, 27));
        lblEnterUpiId.setBounds(138, 22, 316, 31);
        contentPane.add(lblEnterUpiId);

        textField = new JTextField("UPI ID");
        textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField.setColumns(10);
        textField.setBorder(new LineBorder(new Color(171, 173, 179), 2));
        textField.setBounds(76, 116, 432, 48);
        contentPane.add(textField);

        textField_1 = new JTextField("Mobile No. / UPI No.");
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField_1.setColumns(10);
        textField_1.setBorder(new LineBorder(new Color(171, 173, 179), 2));
        textField_1.setBounds(76, 223, 432, 48);
        contentPane.add(textField_1);

        // Add FocusListeners to the text fields to clear default text on focus
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals("UPI ID")) {
                    textField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText("UPI ID");
                }
            }
        });

        textField_1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField_1.getText().equals("Mobile No. / UPI No.")) {
                    textField_1.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField_1.getText().isEmpty()) {
                    textField_1.setText("Mobile No. / UPI No.");
                }
            }
        });

        JSeparator separator = new JSeparator();
        separator.setBorder(new LineBorder(new Color(192, 192, 192)));
        separator.setBounds(10, 187, 265, 2);
        contentPane.add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBorder(new LineBorder(new Color(192, 192, 192)));
        separator_1.setBounds(346, 187, 254, 2);
        contentPane.add(separator_1);

        JButton btnProceed = new JButton("Proceed");
        btnProceed.setBackground(new Color(128, 128, 255));
        btnProceed.setForeground(new Color(255, 255, 255));
        btnProceed.setFont(new Font("Verdana", Font.BOLD, 20));
        btnProceed.setBounds(221, 296, 165, 48);
        contentPane.add(btnProceed);
        
        JLabel lblNewLabel = new JLabel("OR");
        lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblNewLabel.setBounds(298, 175, 40, 37);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setOpaque(true);
        lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
        lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lblNewLabel_1.setBackground(new Color(128, 128, 255));
        lblNewLabel_1.setBounds(-25, 0, 625, 72);
        contentPane.add(lblNewLabel_1);
        setLocationRelativeTo(null);
        textField_2 = new JTextField();
        textField_2.setBounds(27, 83, 0, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        // Add an action listener to the "Proceed" button
        btnProceed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create the UPI PIN frame and make it visible
                upi_pin_4b upiPinFrame = new upi_pin_4b();
                upiPinFrame.setVisible(true);
                // Dispose of the current frame
                dispose();
            }
        });
        
        // ... rest of your code
    }
}

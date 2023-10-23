import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class upi_pin_4b extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtUpiPin;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    upi_pin_4b frame = new upi_pin_4b();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public upi_pin_4b() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnVerify = new JButton("Verify");
        btnVerify.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create the transaction complete frame and make it visible
                transaction_complete_5 transactionCompleteFrame = new transaction_complete_5();
                transactionCompleteFrame.setVisible(true);
                // Dispose of the current frame
                dispose();
            }
        });
        
        JLabel lblEnterUpiPin = new JLabel("ENTER UPI PIN");
        lblEnterUpiPin.setForeground(Color.WHITE);
        lblEnterUpiPin.setFont(new Font("Verdana", Font.BOLD, 28));
        lblEnterUpiPin.setBounds(165, 88, 249, 31);
        contentPane.add(lblEnterUpiPin);
        
        txtUpiPin = new JTextField(" UPI Pin");
        txtUpiPin.setFont(new Font("Tahoma", Font.PLAIN, 20));
        txtUpiPin.setColumns(10);
        txtUpiPin.setBorder(new LineBorder(new Color(171, 173, 179), 2));
        txtUpiPin.setBounds(145, 160, 287, 48);
        contentPane.add(txtUpiPin);
        
        // Add a FocusListener to the text field to clear default text on focus
        txtUpiPin.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtUpiPin.getText().equals(" UPI Pin")) {
                    txtUpiPin.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtUpiPin.getText().isEmpty()) {
                    txtUpiPin.setText(" UPI Pin");
                }
            }
        });
        
        btnVerify.setForeground(Color.WHITE);
        btnVerify.setFont(new Font("Tahoma", Font.PLAIN, 30));
        btnVerify.setBackground(new Color(128, 128, 255));
        btnVerify.setBounds(182, 257, 212, 64);
        contentPane.add(btnVerify);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setOpaque(true);
        lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
        lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lblNewLabel.setBackground(new Color(128, 128, 255));
        lblNewLabel.setBounds(145, 67, 287, 72);
        contentPane.add(lblNewLabel);
        setLocationRelativeTo(null);
        textField = new JTextField();
        textField.setVerifyInputWhenFocusTarget(false);
        textField.setEditable(false);
        textField.setColumns(10);
        textField.setBounds(55, 47, 0, 20);
        contentPane.add(textField);

        setUndecorated(true);
    }
}

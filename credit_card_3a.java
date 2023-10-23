import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class credit_card_3a extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtCardNumber;
    private JTextField txtExpiryValidity;
    private JTextField txtCvv;
    private JButton btnProceed;
    private JLabel lblNewLabel;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    credit_card_3a frame = new credit_card_3a();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public credit_card_3a() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        setLocationRelativeTo(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblEnterCreditOr = new JLabel("ENTER CREDIT OR DEBIT CARD DETAILS");
        lblEnterCreditOr.setForeground(new Color(255, 255, 255));
        lblEnterCreditOr.setBounds(22, 22, 538, 31);
        lblEnterCreditOr.setFont(new Font("Verdana", Font.BOLD, 23));
        contentPane.add(lblEnterCreditOr);

        txtCardNumber = new JTextField();
        txtCardNumber.setBorder(new LineBorder(new Color(171, 173, 179), 3, true));
        txtCardNumber.setFont(new Font("Verdana", Font.PLAIN, 20));
        txtCardNumber.setText(" Card Number");
        txtCardNumber.setBounds(69, 140, 432, 48);
        contentPane.add(txtCardNumber);
        txtCardNumber.setColumns(10);

        txtExpiryValidity = new JTextField();
        txtExpiryValidity.setBorder(new LineBorder(new Color(171, 173, 179), 3, true));
        txtExpiryValidity.setFont(new Font("Verdana", Font.PLAIN, 20));
        txtExpiryValidity.setText(" Expiry / Validity");
        txtExpiryValidity.setColumns(10);
        txtExpiryValidity.setBounds(69, 199, 207, 48);
        contentPane.add(txtExpiryValidity);

        txtCvv = new JTextField();
        txtCvv.setBorder(new LineBorder(new Color(171, 173, 179), 3, true));
        txtCvv.setFont(new Font("Verdana", Font.PLAIN, 20));
        txtCvv.setText(" CVV");
        txtCvv.setColumns(10);
        txtCvv.setBounds(284, 199, 217, 48);
        contentPane.add(txtCvv);

        btnProceed = new JButton("Proceed");
        btnProceed.setForeground(Color.WHITE);
        btnProceed.setFont(new Font("Verdana", Font.PLAIN, 20));
        btnProceed.setBackground(new Color(128, 128, 255));
        btnProceed.setBounds(179, 277, 192, 49);
        contentPane.add(btnProceed);

        lblNewLabel = new JLabel("");
        lblNewLabel.setBackground(new Color(128, 128, 255));
        lblNewLabel.setOpaque(true);
        lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
        lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lblNewLabel.setBounds(-13, 2, 625, 72);
        contentPane.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setVerifyInputWhenFocusTarget(false);
        textField.setEditable(false);
        textField.setColumns(10);
        textField.setBounds(69, 103, 0, 20);
        contentPane.add(textField);
        setUndecorated(true);

        // Add FocusListeners to the text fields
        txtCardNumber.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtCardNumber.getText().equals(" Card Number")) {
                    txtCardNumber.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (txtCardNumber.getText().isEmpty()) {
                    txtCardNumber.setText(" Card Number");
                }
            }
        });

        txtExpiryValidity.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtExpiryValidity.getText().equals(" Expiry / Validity")) {
                    txtExpiryValidity.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (txtExpiryValidity.getText().isEmpty()) {
                    txtExpiryValidity.setText(" Expiry / Validity");
                }
            }
        });

        txtCvv.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtCvv.getText().equals(" CVV")) {
                    txtCvv.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (txtCvv.getText().isEmpty()) {
                    txtCvv.setText(" CVV");
                }
            }
        });

        // Add an action listener to the "Proceed" button
        btnProceed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create the OTP frame and make it visible
                otp_4a otpFrame = new otp_4a();
                otpFrame.setVisible(true);
                // Dispose of the current frame
                dispose();
            }
        });
    }
}

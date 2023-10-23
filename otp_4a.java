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

public class otp_4a extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtDigitOtp;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    otp_4a frame = new otp_4a();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public otp_4a() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        setLocationRelativeTo(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblEnterOtp = new JLabel("ENTER OTP");
        lblEnterOtp.setForeground(new Color(255, 255, 255));
        lblEnterOtp.setFont(new Font("Verdana", Font.BOLD, 28));
        lblEnterOtp.setBounds(206, 67, 177, 31);
        contentPane.add(lblEnterOtp);

        JButton btnVerify = new JButton("Verify");
        btnVerify.setForeground(Color.WHITE);
        btnVerify.setFont(new Font("Tahoma", Font.PLAIN, 30));
        btnVerify.setBackground(new Color(128, 128, 255));
        btnVerify.setBounds(190, 250, 212, 64);
        contentPane.add(btnVerify);
        
                JLabel lblNewLabel = new JLabel("");
                lblNewLabel.setOpaque(true);
                lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
                lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
                lblNewLabel.setBackground(new Color(128, 128, 255));
                lblNewLabel.setBounds(190, 47, 212, 72);
                contentPane.add(lblNewLabel);
                
                        txtDigitOtp = new JTextField();
                        txtDigitOtp.setFont(new Font("Tahoma", Font.PLAIN, 20));
                        txtDigitOtp.setText(" 4-digit OTP");
                        txtDigitOtp.setColumns(10);
                        txtDigitOtp.setBorder(new LineBorder(new Color(171, 173, 179), 2));
                        txtDigitOtp.setBounds(155, 130, 287, 48);
                        contentPane.add(txtDigitOtp);
                        
                        textField = new JTextField();
                        textField.setVerifyInputWhenFocusTarget(false);
                        textField.setEditable(false);
                        textField.setBounds(30, 59, 0, 20);
                        contentPane.add(textField);
                        textField.setColumns(10);
                        
                                // Add FocusListeners to the text field
                                txtDigitOtp.addFocusListener(new FocusAdapter() {
                                    @Override
                                    public void focusGained(FocusEvent e) {
                                        if (txtDigitOtp.getText().equals(" 4-digit OTP")) {
                                            txtDigitOtp.setText("");
                                        }
                                    }
                        
                                    @Override
                                    public void focusLost(FocusEvent e) {
                                        if (txtDigitOtp.getText().isEmpty()) {
                                            txtDigitOtp.setText(" 4-digit OTP");
                                        }
                                    }
                                });

        setUndecorated(true);

        // Add an action listener to the "Verify" button
        btnVerify.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create the transaction complete frame and make it visible
                transaction_complete_5 transactionFrame = new transaction_complete_5();
                transactionFrame.setVisible(true);
                // Dispose of the current frame
                dispose();
            }
        });
    }
}

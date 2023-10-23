import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class select_method_2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    select_method_2 frame = new select_method_2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public select_method_2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        setLocationRelativeTo(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("SELECT A PAYMENT METHOD");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 25));
        lblNewLabel.setBounds(91, -5, 434, 77);
        contentPane.add(lblNewLabel);

        JButton btnCreditCard = new JButton("Credit or Debit Card");
        btnCreditCard.setBackground(new Color(128, 128, 255));
        btnCreditCard.setForeground(new Color(255, 255, 255));
        btnCreditCard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create and show the Credit Card frame
                credit_card_3a creditCardFrame = new credit_card_3a();
                creditCardFrame.setVisible(true);

                // Dispose of the current frame (select_method_2)
                dispose();
            }
        });
        btnCreditCard.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnCreditCard.setBounds(152, 123, 309, 57);
        contentPane.add(btnCreditCard);

        JButton btnUpi = new JButton("UPI");
        btnUpi.setForeground(new Color(255, 255, 255));
        btnUpi.setBackground(new Color(128, 128, 255));
        btnUpi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create and show the UPI frame
                upi_3b upiFrame = new upi_3b();
                upiFrame.setVisible(true);

                // Dispose of the current frame (select_method_2)
                dispose();
            }
        });
        btnUpi.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnUpi.setBounds(152, 195, 309, 57);
        contentPane.add(btnUpi);

        JButton btnNetbanking = new JButton("Netbanking");
        btnNetbanking.setBackground(new Color(128, 128, 255));
        btnNetbanking.setForeground(new Color(255, 255, 255));
        btnNetbanking.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create and show the Netbanking frame
                netbanking_3c netbankingFrame = new netbanking_3c();
                netbankingFrame.setVisible(true);

                // Dispose of the current frame (select_method_2)
                dispose();
            }
        });
        btnNetbanking.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNetbanking.setBounds(152, 269, 309, 57);
        contentPane.add(btnNetbanking);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setOpaque(true);
        lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
        lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lblNewLabel_1.setBackground(new Color(128, 128, 255));
        lblNewLabel_1.setBounds(-25, 0, 625, 72);
        contentPane.add(lblNewLabel_1);
        setUndecorated(true);
        setLocationRelativeTo(null);
    }
}

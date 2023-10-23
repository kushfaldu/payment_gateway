import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class transaction_complete_5 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    transaction_complete_5 frame = new transaction_complete_5();
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
    public transaction_complete_5() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        setLocationRelativeTo(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTransactionCompleted = new JLabel("Transaction Completed!");
        lblTransactionCompleted.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblTransactionCompleted.setBounds(147, 138, 327, 31);
        contentPane.add(lblTransactionCompleted);

        JButton btnMainMenu = new JButton("Home");
        btnMainMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create the shopping page frame and make it visible
                shopping_page shoppingPageFrame = new shopping_page();
                shoppingPageFrame.setVisible(true);
                // Dispose of the current frame
                dispose();
            }
        });
        btnMainMenu.setForeground(new Color(255, 255, 255));
        btnMainMenu.setFont(new Font("Verdana", Font.PLAIN, 25));
        btnMainMenu.setBackground(new Color(128, 128, 255));
        btnMainMenu.setAlignmentX(0.5f);
        btnMainMenu.setBounds(77, 191, 192, 49);
        contentPane.add(btnMainMenu);

        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Dispose of the current frame to exit the program
                dispose();
            }
        });
        btnExit.setForeground(Color.WHITE);
        btnExit.setFont(new Font("Verdana", Font.PLAIN, 20));
        btnExit.setBackground(new Color(128, 128, 255));
        btnExit.setAlignmentX(0.5f);
        btnExit.setBounds(296, 191, 192, 49);
        contentPane.add(btnExit);

        setUndecorated(true);
    }
}

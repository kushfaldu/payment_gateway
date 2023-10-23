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

public class wrongid extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    wrongid frame = new wrongid();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public wrongid() {
        setBounds(100, 100, 250, 230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        contentPane = new JPanel();
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        setLocationRelativeTo(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Wrong Username");
        lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblNewLabel.setBounds(36, 48, 182, 40);
        contentPane.add(lblNewLabel);

        JLabel lblOrPassword = new JLabel("or Password");
        lblOrPassword.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblOrPassword.setBounds(60, 61, 142, 70);
        contentPane.add(lblOrPassword);

        JButton btnNewButton = new JButton("Try Again");
        btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 16));
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current frame
            }
        });
        btnNewButton.setBounds(0, 172, 250, 58);
        contentPane.add(btnNewButton);
    }
}

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;


public class newLogin extends JFrame {

    private JPanel contentPane;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    newLogin frame = new newLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public newLogin() {
        setBounds(100, 100, 600, 400);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);
        JButton btnNewButton = new JButton("Proceed");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(128, 128, 255));
        btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 20));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputUsername = txtUsername.getText();
                String inputPassword = txtPassword.getText();

                if (checkCredentials(inputUsername, inputPassword)) {
                    dispose(); // Close the current frame
                    select_method_2 frame = new select_method_2();
                    frame.setVisible(true);
                } else {
                    //dispose(); // Close the current frame
                    wrongid frame = new wrongid();
                    frame.setVisible(true);
                }
            }
        });
        
        JLabel lblNewLabel_1 = new JLabel("LOGIN");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 25));
        lblNewLabel_1.setBounds(0, 0, 600, 72);
        contentPane.add(lblNewLabel_1);
        btnNewButton.setBounds(231, 266, 141, 44);
        contentPane.add(btnNewButton);

        txtUsername = new JTextField();
        txtUsername.setFont(new Font("Verdana", Font.PLAIN, 20));
        txtUsername.setText("Username");
        txtUsername.setBounds(231, 141, 141, 44);
        contentPane.add(txtUsername);
        txtUsername.setColumns(10);

        txtPassword = new JPasswordField();
        txtPassword.setText("Password");
        txtPassword.setFont(new Font("Verdana", Font.PLAIN, 20));
        txtPassword.setBounds(231, 196, 141, 44);
        contentPane.add(txtPassword);

        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setOpaque(true);
        lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
        lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lblNewLabel.setBackground(new Color(128, 128, 255));
        lblNewLabel.setBounds(-13, 0, 625, 72);
        contentPane.add(lblNewLabel);
        
        JLabel shoes_1 = new JLabel();
        shoes_1.setIcon(new ImageIcon(newLogin.class.getResource("/Images/login32.png")));
        shoes_1.setBounds(182, 141, 39, 49);
        contentPane.add(shoes_1);
        
        JLabel shoes = new JLabel();
        shoes.setIcon(new ImageIcon(newLogin.class.getResource("/Images/key32.png")));
        shoes.setBounds(182, 196, 39, 49);
        contentPane.add(shoes);
    }

    private boolean checkCredentials(String username, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kushf\\eclipse-workspace\\PaymentGateway\\src\\login.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String storedUsername = parts[0].trim();
                    String storedPassword = parts[1].trim();
                    if (storedUsername.equals(username) && storedPassword.equals(password)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class shopping_page extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel totalMRPLabel;
    private double totalAmount = 0;

    private JCheckBox chckbxShoes;
    private JCheckBox chckbxTshirt;
    private JCheckBox chckbxWatch;
    private JLabel shoes_1;
    private JLabel shoes_2;
    private JLabel lblNewLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    shopping_page frame = new shopping_page();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public shopping_page() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);
        JLabel lblShopping = new JLabel("SHOP");
        lblShopping.setForeground(new Color(255, 255, 255));
        lblShopping.setBounds(244, 11, 188, 40);
        lblShopping.setFont(new Font("Verdana", Font.BOLD, 33));
        contentPane.add(lblShopping);

        chckbxShoes = new JCheckBox("Shoes - MRP : ₹200");
        chckbxShoes.setBounds(215, 108, 161, 40);
        chckbxShoes.setBackground(new Color(220, 216, 248));
        chckbxShoes.setFont(new Font("Verdana", Font.PLAIN, 12));
        contentPane.add(chckbxShoes);

        chckbxTshirt = new JCheckBox("T-Shirt - MRP : ₹300");
        chckbxTshirt.setBounds(215, 169, 161, 40);
        chckbxTshirt.setFont(new Font("Verdana", Font.PLAIN, 12));
        chckbxTshirt.setBackground(new Color(220, 216, 248));
        contentPane.add(chckbxTshirt);

        chckbxWatch = new JCheckBox("Watch - MRP : ₹1200");
        chckbxWatch.setBounds(215, 228, 161, 40);
        chckbxWatch.setFont(new Font("Verdana", Font.PLAIN, 12));
        chckbxWatch.setBackground(new Color(220, 216, 248));
        contentPane.add(chckbxWatch);

        totalMRPLabel = new JLabel("Total : ₹0.00");
        totalMRPLabel.setOpaque(true);
        totalMRPLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalMRPLabel.setBackground(new Color(232, 232, 232));
        totalMRPLabel.setBounds(214, 310, 161, 40);
        totalMRPLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        contentPane.add(totalMRPLabel);

        JLabel shoes = new JLabel();
        shoes.setBounds(117, 86, 72, 72);

        // Load the image using a relative path (assuming "nikeshoes.png" is in the same directory)
        ImageIcon shoeIcon = new ImageIcon("nikeshoes.png");

        // Set the image to the "shoes" JLabel
        shoes.setIcon(new ImageIcon("C:\\Users\\kushf\\eclipse-workspace\\PaymentGateway\\bin\\Images\\nikeshoes.png"));
        contentPane.add(shoes);

        shoes_1 = new JLabel();
        shoes_1.setBounds(117, 145, 72, 72);
        shoes_1.setIcon(new ImageIcon("C:\\Users\\kushf\\eclipse-workspace\\PaymentGateway\\bin\\Images\\tshirt.png"));
        contentPane.add(shoes_1);

        shoes_2 = new JLabel();
        shoes_2.setBounds(117, 216, 72, 72);
        shoes_2.setIcon(new ImageIcon("C:\\Users\\kushf\\eclipse-workspace\\PaymentGateway\\bin\\Images\\watch.png"));
        contentPane.add(shoes_2);

        JButton btnNewButton = new JButton("Pay");
        btnNewButton.setBounds(430, 308, 105, 40);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 20));
        btnNewButton.setBackground(new Color(128, 128, 255));
        contentPane.add(btnNewButton);

        JSeparator separator = new JSeparator();
        separator.setBackground(new Color(192, 192, 192));
        separator.setForeground(new Color(0, 0, 0));
        separator.setBounds(193, 288, 198, 11);
        contentPane.add(separator);

        lblNewLabel = new JLabel("");
        lblNewLabel.setOpaque(true);
        lblNewLabel.setBackground(new Color(128, 128, 255));
        lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
        lblNewLabel.setBounds(0, 0, 625, 72);
        contentPane.add(lblNewLabel);

        ChangeListener checkboxListener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateTotalAmount();
            }
        };

        chckbxShoes.addChangeListener(checkboxListener);
        chckbxTshirt.addChangeListener(checkboxListener);
        chckbxWatch.addChangeListener(checkboxListener);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                newLogin loginFrame = new newLogin(); // Create newLogin
                loginFrame.setVisible(true); // Show newLogin
                dispose(); // Close the current frame (shopping_page)
            }
        });

        setUndecorated(true);
    }

    private void updateTotalAmount() {
        double total = 0;

        if (chckbxShoes.isSelected()) {
            total += 200;
        }
        if (chckbxTshirt.isSelected()) {
            total += 300;
        }
        if (chckbxWatch.isSelected()) {
            total += 1200;
        }

        totalAmount = total; // Update the totalAmount variable
        totalMRPLabel.setText("Total : ₹" + String.format("%.2f", total));
    }
}

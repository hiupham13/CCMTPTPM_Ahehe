import javax.swing.*;
import java.awt.*;

public class UserForm extends JFrame {
    private JLabel lblUserName;
    private JTextField txtUserName;
    
    public UserForm() {
        // Cấu hình cửa sổ chính
        setTitle("User Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Tạo panel chứa các thành phần
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        
        // Tạo Label UserName
        lblUserName = new JLabel("UserName:");
        lblUserName.setPreferredSize(new Dimension(80, 25));
        
        // Tạo TextBox UserName
        txtUserName = new JTextField();
        txtUserName.setPreferredSize(new Dimension(200, 25));
        
        // Thêm các thành phần vào panel
        panel.add(lblUserName);
        panel.add(txtUserName);
        
        // Thêm panel vào cửa sổ
        add(panel);
        
        // Hiển thị cửa sổ
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new UserForm();
    }
}

import javax.swing.*;
import java.awt.*;

public class BankFrame extends JFrame {

    public BankFrame() {
        this.setLayout(new BorderLayout(10, 5));
        banks mainShow = new banks();
        JScrollPane scroll = new JScrollPane(mainShow);
        this.add(scroll, BorderLayout.CENTER);
        this.setTitle("银行家算法");
        this.setResizable(true);
        this.setSize(1200, 900);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}

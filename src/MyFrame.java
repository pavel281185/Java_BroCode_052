import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){

        ImageIcon icon = new ImageIcon("logo.png");
        ImageIcon icon2 = new ImageIcon("logo.png");

        button = new JButton();
        button.setBounds(200,100,100,50);
        button.setText("Klikni na mě!");
        button.addActionListener(this);
        button. setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.PLAIN,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.red);
        button.setBackground(Color.blue);
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        this.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println("Yes");
            label.setVisible(true);
        }
    }
}

package CommonAdmain_Member;

import Member.Add_View;
import Admain.Admin;
import CommonAdmain_Member.Panal;
import CommonAdmain_Member.FramAll;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Sign extends FramAll implements ActionListener{
    
    private JLabel nam , pass ;
    private JTextField name_t ;
    private JPasswordField password_t ;
    private JButton sign , reset , save;
    private Panal p ;
    
    
    public Sign() {
        super(500 , 500 , "Sign  In");
        p = new Panal(500 , 500) ;
        p.setBackground(Color.LIGHT_GRAY);
        
        nam = new JLabel("FULL NAME");
        pass = new JLabel("PASSWORD");
        name_t = new JTextField();
        password_t = new JPasswordField();
        sign = new JButton("LOG IN");
        reset = new JButton("RESET");
        save = new JButton("SAVE");
        
        
        nam.setBounds(50, 50, 200, 100);
        nam.setFont(new Font("atltic", Font.LAYOUT_LEFT_TO_RIGHT, 30));
        pass.setBounds(50, 150, 200, 100);
        pass.setFont(new Font("atltic", Font.LAYOUT_LEFT_TO_RIGHT, 30));
        name_t.setBounds(230, 80, 230, 40);
        password_t.setBounds(230, 180, 230, 40);
        name_t.setFont(new Font("atltic", Font.LAYOUT_LEFT_TO_RIGHT, 25));
        password_t.setFont(new Font("atltic", Font.LAYOUT_LEFT_TO_RIGHT, 25));
        sign.setBounds(50, 300, 80, 80);
        sign.setBounds(50, 300, 120, 80);
        reset.setBounds(200, 300, 120, 80);
        save.setBounds(350, 300, 120, 80);
        
        p.add(nam);
        p.add(pass);
        p.add(name_t);
        p.add(password_t);
        p.add(sign);
        p.add(reset);
        p.add(save);
        
        add(p);
        save.addActionListener(this);
        reset.addActionListener(this);
        sign.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == save)
        {
            System.out.println("Your Name :  " + name_t.getText());
                System.out.println("Your Password : " +password_t.getText() );
                name_t.setText("");
                password_t.setText("");
        }
        else if (ae.getSource() == reset) {
                name_t.setText("");
                password_t.setText("");
            }
        else if (ae.getSource() == sign)
        {
            String n = name_t.getText() ;
            String p = password_t.getText() ;
            if ("emp".equals(n) && "emp".equals(p))
            {
                dispose();
                new Add_View();
            }
            else if ("adm".equals(name_t.getText()) && "adm".equals(password_t.getText()))
            {
                dispose();
                new Admin();
            }
            else
               System.out.println("Wrong Account Or Passwored,Please Try Again");
        }
        
    }
    
    
    
}

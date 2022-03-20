package Search;

import CommonAdmain_Member.FramAll;
import CommonAdmain_Member.Information;
import CommonAdmain_Member.Panal;
import Table_Data.TableMemberShip;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MemberShipName extends FramAll implements ActionListener {

   private Panal pan = new Panal(1000, 200);
   private JButton back, view;
   private JLabel memberShip;
    
    public static JTextField memberShip_t;

    public MemberShipName() {
        
        super(800 , 200 , "MemberShip you want");
        pan.setBackground(Color.LIGHT_GRAY);
        
        //back button
        back = new JButton("Back");
        back.setFont(new Font("Bold", 19, 19));
        back.setBounds(380, 100, 80, 30);
        pan.add(back);
        back.addActionListener(this); //action
        
        add(pan);  //add the panal

        //lable class name 
        memberShip = new JLabel("MemberShip Type");
        memberShip.setFont(new Font("Bold", 19, 19));
        memberShip.setBounds(60, 50, 200, 30);
        pan.add(memberShip);

        //text filed of class name
        memberShip_t = new JTextField();
        memberShip_t.setFont(new Font("Bold", 19, 19));
        memberShip_t.setBounds(250, 50, 240, 30);
        pan.add(memberShip_t);

        //button view
        view = new JButton("View Data");
        view.setBounds(500, 50, 140, 30);
        pan.add(view);

        view.addActionListener(this); //action
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            this.dispose();
            new Information(); //back to chose what information he want

        } else if (ae.getSource() == view) {

            this.dispose();
            try {
                new TableMemberShip(); //show information of member under same memberShip
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());

            }
        }

    }

}

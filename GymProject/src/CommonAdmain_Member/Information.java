package CommonAdmain_Member;

import CommonAdmain_Member.Panal;
import CommonAdmain_Member.FramAll;
import Search.MemberShipName;
import Search.TrainerName;
import Search.ClassName;
import Member.Add_View;
import Table_Data.FrameViewAllMember;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Information extends FramAll implements ActionListener {

    private Panal pan;
    private JButton view_all, specific, membership, back , trainer;

    public Information() {
        super(500,500 , "Information");
        pan = new Panal(500,500);
        pan.setBackground(Color.LIGHT_GRAY);
        

        //view information of all member
        view_all = new JButton("Information Of All Member");
        view_all.setBounds(80, 100, 310, 45);
        view_all.setFont(new Font("Bold", 19, 19));
        pan.add(view_all);
        
        //view information of member with same class
        specific = new JButton("Any Member in Specific Class");
        specific.setBounds(50, 180, 380, 45);
        specific.setFont(new Font("Bold", 19, 19));
        pan.add(specific);
        
        //view information of member with same memmberShip
        membership = new JButton("Members Under A Specific Type Of MemberShip");
        membership.setBounds(15, 260, 450, 45);
        membership.setFont(new Font("Bold", 19, 19));
        pan.add(membership);
        
        //button back
        back = new JButton("Back");
        back = new JButton("Back");
        back.setFont(new Font("Bold", 19, 19));
        back.setBounds(10, 10, 80, 30);
        pan.add(back) ;
        
        
        //button to choes name's trainer that you want
        trainer = new JButton("Member with any Trainer");
        trainer.setBounds(10, 335, 460, 45);
        trainer.setFont(new Font("Bold", 19, 19));
        pan.add(trainer) ;
    
        //action
        view_all.addActionListener(this);
        specific.addActionListener(this);
        membership.addActionListener(this); 
        trainer.addActionListener(this);
        back.addActionListener(this);
        
        this.add(pan); //add panal
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == view_all) {
            this.dispose();
            new FrameViewAllMember(); //table show information of all member
        }
        
       else if (ae.getSource() == back) {
            this.dispose();
            new Add_View(); // back to choes want add member or view information
        }
        else if (ae.getSource() == specific) {
            this.dispose();
            new ClassName(); // write name's class that you want
        }
        else if (ae.getSource() == membership) {
            this.dispose();
            new MemberShipName(); // write type's memberShip you want
        }
        
        else if (ae.getSource() == trainer) {
            this.dispose();
            new TrainerName(); //write name's trainer you want
        }
    }

}

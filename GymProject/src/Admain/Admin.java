package Admain;

import CommonAdmain_Member.Information;
import CommonAdmain_Member.Panal;
import CommonAdmain_Member.FramAll;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Admin extends FramAll implements ActionListener {

   private Panal p1 ,p ;
   private JButton Trainer = new JButton("Trainer");
   private JButton Classes = new JButton("Classes");
   private JButton Members = new JButton("Members");

   private JLabel l1 = new JLabel("Welcom Admin");
    

    public Admin() {
        
        super(700, 500, "Admin"); //size and name of frame
        p1 = new Panal(700, 500);  //size of Jpanal 1
        p = new Panal(700, 500);   //size of Jpanal 2
        p1.setLayout(null);
        p.setLayout(null);
        
        p.setBackground(Color.LIGHT_GRAY);

       
        l1.setBounds(30, 30, 300, 40);
        l1.setFont(new Font(" ", Font.ITALIC, 30));
        p.add(l1);
        Trainer.setBounds(250, 150, 200, 40);
        Trainer.setFont(new Font(" ", Font.ITALIC, 30));
        p.add(Trainer);
        Classes.setBounds(250, 200, 200, 40);
        Classes.setFont(new Font(" ", Font.ITALIC, 30));
        p.add(Classes);
        Members.setBounds(250, 250, 200, 40);
        Members.setFont(new Font(" ", Font.ITALIC, 30));
        p.add(Members);

        this.add(p);
        setLayout(null);
        
        //actionListener for Button
        
        Trainer.addActionListener(this);
        Classes.addActionListener(this);
        Members.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Trainer) {
            this.dispose();
            new Traier();

        } else if (e.getSource() == Classes) {
            this.dispose();
            new Classes();
        } else if (e.getSource() == Members) {

            this.dispose();
            new Information();

        }

    }

}

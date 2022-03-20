package Table_Data;

import Table_Data.FillAllMember;
import CommonAdmain_Member.Information;
import CommonAdmain_Member.Panal;
import CommonAdmain_Member.FramAll;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;



public class FrameViewAllMember extends FramAll implements ActionListener{
    private Panal pan = new Panal(100 , 50);
    private JButton back ;
    private FillAllMember view ;
    
    public FrameViewAllMember()
    {
        super(1000 , 500 , "Information Of All Member");
        
        //back button
        back = new JButton("Back");
        back.setFont(new Font("Bold", 19, 19));
        back.setBounds(10, 10, 80, 30);
        pan.add(back) ;
        back.addActionListener(this); //action 
        
        add(pan); //add panal
        
        view  = new FillAllMember() ; //table of all member
        
        add(view) ; //add table with all information of member 
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            this.dispose();
            new Information(); //choes which information you want
            
        }
    }
}

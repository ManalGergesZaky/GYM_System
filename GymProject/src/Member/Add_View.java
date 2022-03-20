package Member;

import CommonAdmain_Member.FramAll;
import CommonAdmain_Member.Information;
import CommonAdmain_Member.Panal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Add_View extends FramAll implements ActionListener{
    private Panal pan;
    private JButton b_add , b_view ;
    public Add_View()
    {
        //super belong class framAll , argument are size and title
        super(500,500 , "Employee"); 
        pan = new Panal(500 , 500); // size of panal
        pan.setBackground(Color.LIGHT_GRAY);
        
        //button of add to add or delet member
        b_add = new JButton("Add New Member");
        b_add.setFont(new Font("Bold", 19, 19));
        b_add.setBounds(150, 150, 210, 45);
        pan.add(b_add);
        b_add.addActionListener(this);
        
        
        //button of view information
        b_view = new JButton("View Information Of Members");
        b_view.setFont(new Font("Bold", 19, 19));
        b_view.setBounds(90, 220, 300, 45);
        pan.add(b_view);
        b_view.addActionListener(this);
        
        this.add(pan); //add panal 
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource()== b_view)
        {
            this.dispose();
            new Information();//to choes which information he want
        }
        else if (ae.getSource()== b_add)
        {
            this.dispose();
            new Member(); // frame to add or edit or delet any member
        }

    }
    
}

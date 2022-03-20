package Table_Data;

import Table_Data.FillMemberShip;
import CommonAdmain_Member.Panal;
import CommonAdmain_Member.FramAll;
import Search.MemberShipName;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;


public class TableMemberShip extends FramAll implements ActionListener{
    
    private FillMemberShip viewTable ;
    private JButton back ;
    private Panal pan = new Panal(100 , 50);
    public TableMemberShip() throws SQLException
    {
        super(1000 , 500 , "Table With same MemberShip");
        pan.setBackground(Color.LIGHT_GRAY);
        
        //back button
        back = new JButton("Back");
        back.setFont(new Font("Bold", 19, 19));
        back.setBounds(10, 10, 80, 30);
        pan.add(back) ;
        back.addActionListener(this);
        
        add(pan); //add panal
        
        viewTable = new FillMemberShip();
        
        
        add(viewTable); //show the table
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            this.dispose();
            new MemberShipName();
            
        }
    }
    
}

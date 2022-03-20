package Table_Data;

import Table_Data.FillTrainer;
import CommonAdmain_Member.Panal;
import CommonAdmain_Member.FramAll;
import Search.TrainerName;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;

public class FramViewTableTrainer extends FramAll implements ActionListener{
    
    private FillTrainer viewTable ;
    private JButton back ;
    private Panal pan = new Panal(100 , 50);
    public FramViewTableTrainer() throws SQLException
    {
        super(1000,500,"Trainer");
        
        //back button
        back = new JButton("Back");
        back.setFont(new Font("Bold", 19, 19));
        back.setBounds(10, 10, 80, 30);
        pan.add(back) ;
        back.addActionListener(this);
        
        //add the panal to put button of back on it 
        
        add(pan);
        
        //fill table with information of member for trainer
        
        viewTable = new FillTrainer();
        add(viewTable);   //show the table
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            this.dispose();
            new TrainerName(); //back to frame of the name of trainer
            
        }
    }
    
}

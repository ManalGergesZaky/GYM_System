
package Search;

import CommonAdmain_Member.FramAll;
import CommonAdmain_Member.Information;
import CommonAdmain_Member.Panal;
import Table_Data.tableClass;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lola
 */
public class ClassName extends FramAll implements ActionListener {

   private Panal pan = new Panal(1000 , 200);
   private JButton back , view ;
   private JLabel name_class_l ;
   public static JTextField name_class_t ;

    public ClassName()
    {
        super(800,200,"Name'S Class");
        pan.setBackground(Color.LIGHT_GRAY);
        //back button
        back = new JButton("Back");
        back.setFont(new Font("Bold", 19, 19));
        back.setBounds(380, 100, 80, 30);
        pan.add(back) ;
        back.addActionListener(this);
        
        add(pan); //add panal
        
        //lable class name 
        name_class_l = new JLabel("Name of class") ;
        name_class_l.setFont(new Font("Bold", 19, 19));
        name_class_l.setBounds(100, 50, 150, 30);
        pan.add(name_class_l) ;
        
        //text filed of class name
        
        name_class_t = new JTextField();
        name_class_t.setFont(new Font("Bold", 19, 19));
        name_class_t.setBounds(250, 50, 240, 30);
        pan.add(name_class_t);
        
        //button view
        
        view = new JButton("View Data");
        view.setBounds(500, 50, 140, 30);
        pan.add(view) ;
        
        
        view.addActionListener(this); //action
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            this.dispose();
            new Information(); //back to choes which information he want
            
        }
        else if (ae.getSource() == view) {
          
            this.dispose();
            try {
                new tableClass(); //show table of member with same class
            } catch (SQLException ex) {
                System.out.println(ex.getMessage()); 
            }
            
            
        }
    }
    
}

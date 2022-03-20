package Table_Data;

import Table_Data.FillUnderClass;
import CommonAdmain_Member.Panal;
import CommonAdmain_Member.FramAll;
import Search.ClassName;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;

public class tableClass extends FramAll implements ActionListener {

    private FillUnderClass view_under_class;
    private JButton back;
    private Panal pan = new Panal(100, 50);

    public tableClass() throws SQLException {

        super(1000, 500, "Table the same class");

        //back button
        back = new JButton("Back");
        back.setFont(new Font("Bold", 19, 19));
        back.setBounds(10, 10, 80, 30);
        pan.add(back);
        back.addActionListener(this); //action

        add(pan); //add panal 

        add(new FillUnderClass()); //show table of member which same class
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            this.dispose();
            new ClassName(); //go to frame to write name of class

        }
    }
}

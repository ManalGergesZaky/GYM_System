package Member;

import Member.Add_View;
import CommonAdmain_Member.Panal;
import CommonAdmain_Member.FramAll;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.sql.SQLException;


public class Member extends FramAll implements ActionListener {

    private Panal pan;
    private JLabel id_L, idEdet_L, name_L, age_L, phone_L, class_name_L, memberShip_L, trainer;
    public static JTextField id_t, idEdet_t, name_t, age_t, phone_t, class_name_t, com, trainer_t;

    private JButton b_add, edit, delet, back, view;

    public Member() {
        super(500, 700, "Member");

        pan = new Panal(500, 600); //panal
        pan.setBackground(Color.LIGHT_GRAY);

        //Label
        id_L = new JLabel("ID");
        name_L = new JLabel("Name");
        age_L = new JLabel("Age");
        phone_L = new JLabel("Phone");
        class_name_L = new JLabel("Name Of Class");
        memberShip_L = new JLabel("Type Of MemberShip");
        trainer = new JLabel("Name of trainer");
        idEdet_L = new JLabel("ID");

        //Text Field
        id_t = new JTextField();
        name_t = new JTextField();
        age_t = new JTextField();
        phone_t = new JTextField();
        class_name_t = new JTextField();
        trainer_t = new JTextField();
        idEdet_t = new JTextField();
        com = new JTextField();

        //size lable
        id_L.setBounds(30, 50, 100, 30);
        name_L.setBounds(30, 100, 100, 30);
        age_L.setBounds(30, 150, 70, 30);
        phone_L.setBounds(30, 200, 90, 30);
        class_name_L.setBounds(30, 250, 150, 30);
        memberShip_L.setBounds(30, 300, 190, 30);
        trainer.setBounds(30, 350, 190, 30);
        idEdet_L.setBounds(40, 480, 100, 30);

        //Font size of lable
        id_L.setFont(new Font("Bold", 19, 19));
        name_L.setFont(new Font("Bold", 19, 19));
        age_L.setFont(new Font("Bold", 19, 19));
        phone_L.setFont(new Font("Bold", 19, 19));
        class_name_L.setFont(new Font("Bold", 19, 19));
        memberShip_L.setFont(new Font("Bold", 19, 19));
        trainer.setFont(new Font("Bold", 19, 19));
        idEdet_L.setFont(new Font("Bold", 19, 19));

        //add lable to panal
        pan.add(id_L);
        pan.add(name_L);
        pan.add(age_L);
        pan.add(phone_L);
        pan.add(trainer);
        pan.add(class_name_L);
        pan.add(memberShip_L);
        pan.add(idEdet_L);

        //size of text Filed
        id_t.setBounds(100, 50, 300, 35);
        name_t.setBounds(100, 100, 300, 35);
        age_t.setBounds(100, 150, 300, 35);
        phone_t.setBounds(100, 200, 300, 35);
        class_name_t.setBounds(170, 250, 230, 35);
        trainer_t.setBounds(180, 350, 220, 30);
        com.setBounds(230, 300, 170, 35);
        idEdet_t.setBounds(120, 480, 170, 35);

        //add text Filed to panal 
        pan.add(id_t);
        pan.add(name_t);
        pan.add(trainer_t);
        pan.add(idEdet_t);
        pan.add(age_t);
        pan.add(phone_t);
        pan.add(class_name_t);
        pan.add(com);

        //button to add new member
        b_add = new JButton("ADD");
        b_add.setBounds(200, 400, 100, 35);
        b_add.setFont(new Font("Bold", 19, 19));

        //button to edit information of member
        edit = new JButton("Edit");
        edit.setFont(new Font("Bold", 19, 19));
        edit.setBounds(120, 550, 100, 35);

        //button to delet member
        delet = new JButton("Delet");
        delet.setFont(new Font("Bold", 19, 19));
        delet.setBounds(240, 550, 100, 35);

        //button to searsh for member and show his information
        view = new JButton("View Data");
        view.setFont(new Font("Bold", 19, 19));
        view.setBounds(300, 480, 150, 35);

        //button to back
        back = new JButton("Back");
        back.setFont(new Font("Bold", 19, 19));
        back.setBounds(350, 550, 100, 35);

        //add button to panal
        pan.add(back);
        pan.add(edit);
        pan.add(delet);
        pan.add(b_add);
        pan.add(view);

        //action
        b_add.addActionListener(this);
        back.addActionListener(this);
        edit.addActionListener(this);
        delet.addActionListener(this);
        view.addActionListener(this);

        add(pan); //add panal
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b_add) {
            try {
                //insert data to table's member
                database.User.insert_user(Integer.parseInt(id_t.getText()),
                        name_t.getText(), Integer.parseInt(age_t.getText()),
                        Integer.parseInt(phone_t.getText()),
                        class_name_t.getText(), com.getText(),
                        trainer_t.getText());
            } catch (SQLException ex) {

                System.out.println(ex.getMessage());
            }
        } else if (ae.getSource() == back) {
            this.dispose();
            new Add_View(); //back to choes you want add member or view information

        } else if (ae.getSource() == view) {
            try {
                database.User.Search_id(); //shearch information with id and show thim
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        } else if (ae.getSource() == edit) {
            try {
                database.User.update(); //update information
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (ae.getSource() == delet) {
            try {
                database.User.delet(); //delet member
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}

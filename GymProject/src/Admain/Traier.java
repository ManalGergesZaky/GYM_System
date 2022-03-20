package Admain;



import Admain.Common;
import Admain.Admin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Traier  extends Common implements ActionListener {
    
    private DefaultTableModel mode1=new DefaultTableModel(new Object [][]{
        {"12","Ahmad","Ali","28","PiYo ","22"}, {"15","Mona","Ahmad","33","Boot ","7"},{"13","ali","osama","28","Butts ","5"},
        {"2","merna","Ali","33","Row  ","12"}
    }, new Object[]{"Id","Frist_name","Last_name","age","className","Members"} 
    );
    private JLabel l1=new JLabel("Trainer information");
   private JLabel Id =new JLabel("Id :");
   private JLabel Frist_name =new JLabel("Frist_name :");
   private JLabel Last_name =new JLabel("Last_name :");
   private JLabel age =new JLabel("age :");
   private JLabel classes =new JLabel("classes :");
   private JLabel Members =new JLabel("Members :");
   private JTable table =new JTable(mode1){
    
    
    public boolean isCellEditable (int data,int columns){
            return false;}};
    JScrollPane s1=new JScrollPane(table);
     JButton back=new JButton("Back");
   
    
    public Traier (){
    
     s1.setBounds(0, 40, 700, 200);p.add(s1);
   table.setFont((new Font(" ",Font.PLAIN,20)));
   table.setRowHeight(30);
   back.setBounds(400, 400, 150, 25);back.setFont(new Font(" ",Font.ITALIC,20));p.add(back);
   
    Id.setBounds(10, 250, 100, 20);Id.setFont(new Font(" ",Font.ITALIC,20));p.add(Id);
    Frist_name.setBounds(10, 280, 120, 20);Frist_name.setFont(new Font(" ",Font.ITALIC,20));p.add(Frist_name);
    Last_name.setBounds(10, 310, 120, 20);Last_name.setFont(new Font(" ",Font.ITALIC,20));p.add(Last_name);
    age.setBounds(10, 340, 100, 25);age.setFont(new Font(" ",Font.ITALIC,20));p.add(age);
    classes.setBounds(10, 370, 100, 20);classes.setFont(new Font(" ",Font.ITALIC,20));p.add(classes);
    Members.setBounds(10, 400, 100, 20);Members.setFont(new Font(" ",Font.ITALIC,20));p.add(Members);
     add.setBounds(400, 250, 150, 25);add.setFont(new Font(" ",Font.ITALIC,20));p.add(add);
   
    add.addActionListener(this);
   Edit.addActionListener(this);
   Deleat.addActionListener(this);
   back.addActionListener(this);
   
    }

    @Override
    
    public void actionPerformed(ActionEvent e) {
          int num_selectrow =table.getSelectedRow();
    if (e.getSource()==add){
    row[0]=id.getText();
    row[1]=fname.getText();
    row[2]=lname.getText();
    row[3]=g.getText();
    row[4]=clas.getText();
    row[5]=member.getText();
    mode1.addRow(row);
     id.setText(" ");
    fname.setText(" ");
     lname.setText(" ");
    g.setText(" ");
     clas.setText(" ");
    member.setText(" ");
    }
    
      else if (e.getSource()==Edit){
        
       mode1.setValueAt(id.getText(), num_selectrow, 0);
       mode1.setValueAt(fname.getText(), num_selectrow, 1);
        mode1.setValueAt(lname.getText(), num_selectrow, 2);
         mode1.setValueAt(g.getText(), num_selectrow, 3);
          mode1.setValueAt(clas.getText(), num_selectrow, 4);
           mode1.setValueAt(member.getText(), num_selectrow, 5);
    
          id.setText(" ");
    fname.setText(" ");
     lname.setText(" ");
    g.setText(" ");
     clas.setText(" ");
    member.setText(" ");
     
  
             
      }
         else if (e.getSource()==Deleat){
        
         mode1.removeRow(num_selectrow);
         }
    else if (e.getSource()==back){
        this.dispose();
        Admin a=new Admin();}
    

    }
}

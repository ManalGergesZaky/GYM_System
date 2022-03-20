/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admain;



import Admain.Admin;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Classes extends Common implements ActionListener{
    
   private DefaultTableModel mode=new DefaultTableModel(new Object [][]{
        { "PiYo ","Ahmad","sunday","at3pm","Lose weight and completely transform your body","40"}, 
        { "Boot  ","mona","saturday","at5pm","Boot Camp workouts offering a variety of movements and skill development ","70"},
        { "Butts  ","ali","friday","at10am","Butts n' Guts: Does this class really need a description","90"},
        {"Row  ","merna","thursday","at3pm","This is a non-competitive team orientated class that combines","80"},
    }, new Object[]{"name","trainername","day","Time","describtion","limitmember"} 
    );
   private JTable table =new JTable(mode){
    
    
    public boolean isCellEditable (int data,int columns){
            return false;}};
   private JScrollPane s1=new JScrollPane(table);
   private JLabel l=new JLabel("classes information");
    
   private JLabel name =new JLabel("name :");
   private JLabel trainername =new JLabel("trainername :");
   private JLabel day =new JLabel("day :");
   private JLabel Time =new JLabel("Time :");
   private JLabel describtion =new JLabel("describtion :");
   private JLabel limitmember =new JLabel("limitmember :");
   private JButton back=new JButton("Back");
    
    
  public  Classes(){
  l.setBounds(12, 10, 300, 30);l.setFont(new Font(" ",Font.ITALIC,20));p.add(l);
  s1.setBounds(0, 40, 700, 200);p.add(s1);
  table.setFont((new Font(" ",Font.BOLD,15)));
   table.setRowHeight(30);
   name.setBounds(10, 250, 100, 20);name.setFont(new Font(" ",Font.ITALIC,20));p.add(name);
    trainername.setBounds(10, 280, 120, 20);trainername.setFont(new Font(" ",Font.ITALIC,20));p.add(trainername);
    day.setBounds(10, 310, 120, 20);day.setFont(new Font(" ",Font.ITALIC,20));p.add(day);
    Time.setBounds(10, 340, 100, 25);Time.setFont(new Font(" ",Font.ITALIC,20));p.add(Time);
    describtion.setBounds(10, 370, 130, 20);describtion.setFont(new Font(" ",Font.ITALIC,20));p.add(describtion);
    limitmember.setBounds(10, 400, 130, 20);limitmember.setFont(new Font(" ",Font.ITALIC,20));p.add(limitmember);
    back.setBounds(400, 400, 150, 25);back.setFont(new Font(" ",Font.ITALIC,20));p.add(back);
   add(l);
   Edit.addActionListener(this);
   Deleat.addActionListener(this);
   back.addActionListener(this);
  
  }
 @Override
    public void actionPerformed(ActionEvent e) {
        int num_selectrow =table.getSelectedRow();
      if (e.getSource()==Edit){
        if (fname.getText().toString().equals(mode.getValueAt(0, 1).toString())&&
                lname.getText().toString().equals(mode.getValueAt(0, 2).toString())&&
                g.getText().toString().equals(mode.getValueAt(0, 3).toString())||fname.getText().toString().equals(mode.getValueAt(1, 1).toString())&&
                lname.getText().toString().equals(mode.getValueAt(1, 2).toString())&&
                g.getText().toString().equals(mode.getValueAt(1, 3).toString())||
                fname.getText().toString().equals(mode.getValueAt(2, 1).toString())&&
                lname.getText().toString().equals(mode.getValueAt(2, 2).toString())&&
                g.getText().toString().equals(mode.getValueAt(2, 3).toString())||fname.getText().toString().equals(mode.getValueAt(3, 1).toString())&&
                lname.getText().toString().equals(mode.getValueAt(3, 2).toString())&&
                g.getText().toString().equals(mode.getValueAt(3, 3).toString())){
            { System.out.println("The coach was not free at this time");
       id.setText(" ");
    fname.setText(" ");
     lname.setText(" ");
    g.setText(" ");
     clas.setText(" ");
    member.setText(" ");
     
            }
        }
        else 
        {mode.setValueAt(id.getText(), num_selectrow, 0);
       mode.setValueAt(fname.getText(), num_selectrow, 1);
        mode.setValueAt(lname.getText(), num_selectrow, 2);
         mode.setValueAt(g.getText(), num_selectrow, 3);
          mode.setValueAt(clas.getText(), num_selectrow, 4);
           mode.setValueAt(member.getText(), num_selectrow, 5);
           id.setText(" ");
    fname.setText(" ");
     lname.setText(" ");
    g.setText(" ");
     clas.setText(" ");
    member.setText(" ");
     
  
       
       
       
            
        }}
    
       else if (e.getSource()==Deleat){
                 mode.removeRow(num_selectrow);
         }
    else if (e.getSource()==back){
        this.dispose();
        Admin a=new Admin();}
 
    }
    
}

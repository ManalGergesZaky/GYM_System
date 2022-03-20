package Admain;


import CommonAdmain_Member.Panal;
import CommonAdmain_Member.FramAll;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JButton;



public class Common extends FramAll {
    
    
   protected TextField id=new TextField();
   protected TextField fname=new TextField();
   protected TextField lname=new TextField();
   protected TextField g=new TextField();
   protected TextField clas=new TextField();
   protected TextField member=new TextField();
    
   protected JButton add=new JButton("Add");
   protected JButton Edit=new JButton("Edit");
   protected JButton Deleat=new JButton("Deleat");
     
   protected Object []row=new Object[6];
   protected Panal p ; 
   
   public  Common(){
       super(700 , 500 ,"Gem");
       p = new Panal(700, 500) ;
       p.setLayout(null);
       p.setBackground(Color.LIGHT_GRAY);
   
       id.setBounds(160, 250, 150, 25);id.setFont(new Font(" ",Font.BOLD,15));p.add(id);
       fname.setBounds(160, 280,150, 25);fname.setFont(new Font(" ",Font.BOLD,15));p.add(fname);
       lname.setBounds(160, 310,150, 25);lname.setFont(new Font(" ",Font.BOLD,15));p.add(lname);
       g.setBounds(160, 340, 150, 25);g.setFont(new Font(" ",Font.BOLD,15));p.add(g);
       clas.setBounds(160, 370, 150, 25);clas.setFont(new Font(" ",Font.BOLD,15));p.add(clas);
       member.setBounds(160, 400, 150, 25);member.setFont(new Font(" ",Font.BOLD,15));p.add(member);
       Edit.setBounds(400, 350, 150, 25);Edit.setFont(new Font(" ",Font.ITALIC,20));p.add(Edit);
       Deleat.setBounds(400, 300, 150, 25);Deleat.setFont(new Font(" ",Font.ITALIC,20));p.add(Deleat);
   
     add(p);
   
    }

}

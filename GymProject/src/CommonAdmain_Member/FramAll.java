package CommonAdmain_Member;

import javax.swing.JFrame;


public class FramAll extends JFrame{
    
    public FramAll (int x , int y , String title)
    {
        setSize(x, y);
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
}

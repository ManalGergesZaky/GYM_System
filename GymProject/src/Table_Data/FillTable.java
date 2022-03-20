
package Table_Data;

import java.awt.ComponentOrientation;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import sun.swing.table.DefaultTableCellHeaderRenderer;


public class FillTable extends JPanel{
    
   protected int x = 0;
   protected JTable table; 
   protected JScrollPane scrol; //make scrol in the table
   protected String line[] = {"id", " name ", " age ", " phone ",
        " class_name ", " memberShip " , "trainer"};
   protected  Object data[][];
   protected ArrayList<domainData.User_data> table_of_data;
    
    public void Show_table() {

        data = new Object[table_of_data.size()][7];

        for (int i = 0; i < table_of_data.size(); i++) {
            data[i][0] = table_of_data.get(i).getId();
            data[i][1] = table_of_data.get(i).getName();
            data[i][2] = table_of_data.get(i).getAge();
            data[i][3] = table_of_data.get(i).getPhone();
            data[i][4] = table_of_data.get(i).getName_class();
            data[i][5] = table_of_data.get(i).getMembership();
            data[i][6] = table_of_data.get(i).getTrainer();
        }

        table = new JTable(data, line);
        scrol = new JScrollPane(table);
        scrol.setBounds(0, 50, 1000, 450);

        add(scrol);

        //text in center
        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment((int) JLabel.CENTER_ALIGNMENT);

        DefaultTableCellRenderer v = new DefaultTableCellHeaderRenderer();
        v.setHorizontalAlignment(JLabel.CENTER);

        table.getColumnModel().getColumn(0).setCellRenderer(v);

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(v);

        }
        table.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

    }
}

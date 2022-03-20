
package Table_Data;


import java.sql.SQLException;

public class FillMemberShip extends FillTable{
    
    
    public FillMemberShip() throws SQLException {
        this.table_of_data = database.User.getMemberShip();
        setLayout(null);

        Show_table();
    }
 
}

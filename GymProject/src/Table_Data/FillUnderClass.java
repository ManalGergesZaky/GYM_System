package Table_Data;
import java.sql.SQLException;

public class FillUnderClass extends FillTable {

    
    public FillUnderClass() throws SQLException {
        //override  
       table_of_data = database.User.getClassName();
        setLayout(null);

        Show_table();
    }
}
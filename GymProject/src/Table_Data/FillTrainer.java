package Table_Data;

import Table_Data.FillTable;
import java.sql.SQLException;

public class FillTrainer extends FillTable{
   
    
    public FillTrainer() throws SQLException {
        this.table_of_data = database.User.getTrainer();
        setLayout(null);

        Show_table();
    }
    
}

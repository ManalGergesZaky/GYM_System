package Table_Data;

public class FillAllMember extends FillTable {

    public FillAllMember() {
        setLayout(null);

        this.table_of_data = database.User.getUser();
        Show_table();
    }

}

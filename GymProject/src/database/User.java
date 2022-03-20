package database;

import domainData.User_data;
import Member.Member;
import static Member.Member.idEdet_t;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class User {

    static Connection con = null;
    static Statement stat = null;
    static ResultSet res;
    static PreparedStatement p;

    static int resUpdate;

    // connect the database 
    //this function return connection
    public static Connection connect() throws SQLException {

        return DriverManager.getConnection("jdbc:derby://localhost:1527/member",
                "lola", "1234"); 

    }

    public static void insert_user(int id, String name, int age,
            int phone, String name_class, String mem_ship,
            String trainer) throws SQLException {
        try {
            con = connect();
            p = con.prepareStatement
        ("insert into member values (?,?,?,?,?,?,?)");
            p.setInt(1, id);
            p.setString(2, name);
            p.setInt(3, age);
            p.setInt(4, phone);
            p.setString(5, name_class);
            p.setString(6, mem_ship);
            p.setString(7, trainer);
            p.execute();

            Member.id_t.setText("");
            Member.name_t.setText("");
            Member.age_t.setText("");
            Member.phone_t.setText("");
            Member.class_name_t.setText("");
            Member.com.setText("");
            Member.trainer_t.setText("");
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

    }

    public static ArrayList<User_data> getUser() {
        ArrayList<User_data> list = new ArrayList<>();
        try {
            con = connect();
            p = con.prepareStatement("select * from member");
            res = p.executeQuery();

            while (res.next()) {
                list.add(new User_data(res.getInt("id"), 
                        res.getString("name"), res.getInt("age"),
                        res.getInt("phone"), res.getString("class_name"),
                        res.getString("mem_ship"),
                        res.getString("trainer")));

            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

        return list;

    }

    public static void Search_id() throws SQLException {

        try {
            con = connect();

            stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            String query = "select * from member";
            res = stat.executeQuery(query);

            int found = 0;
            res.absolute(0);
            while (res.next()) {
                if (Integer.parseInt(idEdet_t.getText()) == res.getInt(1)) {
                    found = 1;
                    Member.id_t.setText(res.getInt(1) + "");
                    Member.name_t.setText(res.getString(2));
                    Member.age_t.setText(res.getInt(3) + "");
                    Member.phone_t.setText(res.getInt(4) + "");
                    Member.class_name_t.setText(res.getString(5));
                    Member.com.setText(res.getString(6));
                    Member.trainer_t.setText(res.getString(7));

                    break;
                }
            }
            if (found == 0) {
                Member.id_t.setText("");
                Member.name_t.setText("");
                Member.age_t.setText("");
                Member.phone_t.setText("");
                Member.class_name_t.setText("");
                Member.com.setText("");
                Member.trainer_t.setText("");

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {

            con.close();
            stat.close();
        }

    }

    public static void update() throws SQLException {

        try {
            con = connect();

            stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            String query = "select * from member";
            res = stat.executeQuery(query);
            while (res.next()) {
                if (Integer.parseInt(idEdet_t.getText()) == res.getInt(1)) {
                    resUpdate = res.getRow();

                    if (resUpdate != 0) {
                        int id = Integer.parseInt(Member.id_t.getText());
                        String name = Member.name_t.getText();
                        int age = Integer.parseInt(Member.age_t.getText());
                        int phone = Integer.parseInt(Member.phone_t.getText());
                        String class_name = Member.class_name_t.getText();
                        String membership = Member.com.getText();
                        String trainer = Member.trainer_t.getText();

                        res.updateInt(1, id);
                        res.updateString(2, name);
                        res.updateInt(3, age);
                        res.updateInt(4, phone);
                        res.updateString(5, class_name);
                        res.updateString(6, membership);
                        res.updateString(7, trainer);

                        res.updateRow();

                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {

            con.close();
            stat.close();
        }
    }

    public static void delet() throws SQLException {

        try {
            con = connect();

            stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            String query = "select * from member";
            res = stat.executeQuery(query);
            while (res.next()) {
                if (Integer.parseInt(idEdet_t.getText()) == res.getInt(1)) {

                    res.deleteRow();
                    Member.id_t.setText("");
                    Member.name_t.setText("");
                    Member.age_t.setText("");
                    Member.phone_t.setText("");
                    Member.class_name_t.setText("");
                    Member.com.setText("");
                    Member.trainer_t.setText("");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {

            con.close();
            stat.close();
        }
    }

    public static ArrayList<User_data> getClassName() throws SQLException {
        ArrayList<User_data> list = new ArrayList<>();
        try {
            con = connect();
            p = con.prepareStatement("select * from member where"
                    + " class_name = "
                    + "('" + Search.ClassName.name_class_t.getText() + "')  ");
            res = p.executeQuery();

            while (res.next()) {
                list.add(new User_data(res.getInt("id"), res.getString("name"),
                        res.getInt("age"), res.getInt("phone"),
                        res.getString("class_name"), res.getString("mem_ship"),
                        res.getString("trainer")));

            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

        return list;

    }

    public static ArrayList<User_data> getMemberShip() throws SQLException {
        ArrayList<User_data> list = new ArrayList<>();
        try {
            con = connect();
            p = con.prepareStatement("select * from member where mem_ship = "
                    + "('" + Search.MemberShipName.memberShip_t.getText() + "')  ");
            res = p.executeQuery();
            while (res.next()) {
                list.add(new User_data(res.getInt("id"),
                        res.getString("name"), res.getInt("age"),
                        res.getInt("phone"), res.getString("class_name"),
                        res.getString("mem_ship"), res.getString("trainer")));

            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

        return list;

    }

    public static ArrayList<User_data> getTrainer() throws SQLException {
        ArrayList<User_data> list = new ArrayList<>();
        try {
            con = connect();
            p = con.prepareStatement("select * from member where trainer = "
                    + "('" + Search.TrainerName.name_trainer_t.getText() + "')  ");
            res = p.executeQuery();
            while (res.next()) {
                list.add(new User_data(res.getInt("id"),
                        res.getString("name"), res.getInt("age"),
                        res.getInt("phone"), res.getString("class_name"),
                        res.getString("mem_ship"), res.getString("trainer")));

            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

        return list;

    }
    
    
}

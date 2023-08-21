package utils;

import java.sql.*;
import java.util.Scanner;

public class DBUtils {
    static Scanner sc = new Scanner(System.in);
    static Connection connection = null;
    static Statement statement = null;

    public static void connect(){
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final","root","");
//            statement = connection.createStatement();
//            System.out.println("Koneksi ke DB berhasil");
//        } catch (SQLException e){
//            System.out.println("Koneksi ke DB gagal");
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        try {
            String dbDriver = "com.mysql.jdbc.Driver";
            String dbURL = "jdbc:mysql:// localhost:3306/";
            String dbName = "final";
            String dbUsername = "root";
            String dbPassword = "";

            Class.forName(dbDriver);
            connection = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);
            statement = connection.createStatement();
            System.out.println("Koneksi ke DB berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi ke DB gagal");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet selectUser(String email, String password) throws SQLException {
        return statement.executeQuery("select * from users where email='"+email+"' and password='"+password+"'");
    }

    public static boolean insertUsers(String email, String username, String password){
        String query =  "insert into users (email,username,password) values ('"+ email +"','" + username +"','" + password + "')";
        try {
            if (statement.executeUpdate(query)>0){
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ResultSet selectAll(String tableName) throws Exception{
        return statement.executeQuery("select * from "+tableName);
    }

    public static boolean insert(String tableName, String time, int set, int ture, String lamp, float klinFreq,
                                 float feedingFreq, int fan, int pumpCir, int tempCir, int pumpFil, int ph, int airDoor,
                                 int smog, int cooling, float ts1, float ts2, float ts3){
        String query =  "insert into " + tableName + " values ('" + time + "'," + set + ",'" + ture +"','"+ lamp +"',"+ klinFreq +","+feedingFreq+","+fan+","
                +pumpCir+","+tempCir+","+pumpFil+","+ph+","+airDoor+","+smog+","+cooling+","+ts1+","+ts2+","+ts3+")";
        try {
            if (statement.executeUpdate(query)>0){
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean update(String tableName, String time, int set, int ture, String lamp, float klinFreq,
                                 float feedingFreq, int fan, int pumpCir, int tempCir, int pumpFil, int ph, int airDoor,
                                 int smog, int cooling, float ts1, float ts2, float ts3){
        String query =  "UPDATE " + tableName + " SET set1 = " + set + ", ture = " + ture + ", lamp = '"+ lamp + "', Kiln_Freq = "+ klinFreq+
                ", Feeding_Freq = "+feedingFreq+", Fan = "+fan+", Pump_Circulation = "+pumpCir+", Temp_Circulation = "+tempCir+", Pump_Filterpress = "+pumpFil+
                ", PH_Filterpress ="+ph+", Air_Door"+ airDoor + ", Smog = "+smog+", Cooling_Elevator = "+cooling+", TS1 = "+ts1+", TS2 = "+ts2+",TS3 = "+ts3+ " where time = '"+ time+"'";
        try {
            if (statement.executeUpdate(query)>0){
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean delete(String tableName, String time){
        String query =  "delete from " + tableName + " where time = '" + time + "'";
        try {
            if (statement.executeUpdate(query)>0){
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

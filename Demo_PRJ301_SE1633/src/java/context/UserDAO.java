/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package context;

import Model.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class UserDAO {
    Connection cnn;//Kết nối đến DB
    Statement stm;//Thực thi các câu lệnh SQL
    ResultSet rs;//Lưu trữ và xử lý dữ liệu

    public UserDAO() {
        connectDB();
    }
    
    
    
    
    public boolean checLogin(String account,String pass) {
        /*
        if ("admin".equalsIgnoreCase(account) && "123".equals(pass)) {
            return true;
        }
        return false;
        */
        try {
            stm=cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String strSelect="select * from tblUser where account='"+account+"' and pass='"+pass+"'";
            rs=stm.executeQuery(strSelect);
            while (rs.next()) {                
                return true;
            }
        } catch (Exception e) {
            System.out.println("Login Error:"+e.getMessage());
        }
        return false;
    }

    private void connectDB() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("Connect successfully!");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public String getNameByAccount(String account) {
        String name = "";
        try {
            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String strSelect = "select * from tblUser where account='" + account + "'";
            rs = stm.executeQuery(strSelect);
            while (rs.next()) {                
                name=rs.getString(3);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return name;
    }

    public boolean checkAccount(String account) {
        try {
            stm=cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String strSelect="select * from tblUser where account='"+account+"'";
            rs=stm.executeQuery(strSelect);
            while (rs.next()) {                
                return true;
            }
        } catch (Exception e) {
            System.out.println("Login Error:"+e.getMessage());
        }
        return false;
    }

    public boolean checkAccountDOB(String account, String dob) {
        try {
            stm=cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String strSelect="select * from tblUser where account='"+account+"' and dateofbirth='"+dob+"'";
            rs=stm.executeQuery(strSelect);
            while (rs.next()) {                
                return true;
            }
        } catch (Exception e) {
            System.out.println("Login Error:"+e.getMessage());
        }
        return false;
    }

    public void UpdatePass(String account, String newPass) {
        try {
            stm=cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String strUpdate="update tblUser set pass='"+newPass+"' where account='"+account+"'";
            stm.execute(strUpdate);
            System.out.println("Update pas success");
        } catch (Exception e) {
            System.out.println("Login Error:"+e.getMessage());
        }
        
    }

    public ArrayList<User> getAllUser() {
        ArrayList<User> list = new ArrayList<>();
        try {
            stm=cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String strSelect="select * from tblUser";
            rs=stm.executeQuery(strSelect);
            while (rs.next()) {  
                String account = rs.getString("account");
                String pass= rs.getString(2);
                String name=rs.getString(3);
                String address = rs.getString(5);
                SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                String dob = f.format(rs.getDate(6));
                String gender ="Male";
                if(rs.getBoolean(4)==false) gender = "Female";
                list.add(new User(account, pass, name, address, dob, gender));
            }
        } catch (Exception e) {
            System.out.println("Login Error:"+e.getMessage());
        }
        return list;
    }
    
    
}

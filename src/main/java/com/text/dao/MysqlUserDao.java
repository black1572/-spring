package com.text.dao;

import com.text.entity.User;
import com.text.spring.JDBCDataSource;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class MysqlUserDao implements UserDao {

    private JDBCDataSource dataSource;

    public MysqlUserDao(JDBCDataSource dataSource) {
        this.dataSource = dataSource;
    }





    @Override
    public User findByName(String name) {

        String sql = "SELECT * FROM user WHERE name = ?";
        Connection conn = null;

//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setString(1, username);
//            try (ResultSet resultSet = statement.executeQuery()) {
//                if (resultSet.next()) {
//                    int id = resultSet.getInt("id");
//                    String userName = resultSet.getString("user_name");
//                    String password = resultSet.getString("pwd");
//                    String phone = resultSet.getString("phone");
//                    user = new User(id, userName, password, phone);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        try{
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            ResultSet rs = ps.executeQuery();
            User user = null;
            while (rs.next()){
                user= new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPhone(rs.getString("phone"));
                user.setPassword(rs.getString("pwd"));
            }
            rs.close();
            ps.close();
            return user;
        }catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }
}

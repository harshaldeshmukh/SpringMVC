package com.mrsac.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mrsac.springmvc.model.Login;
import com.mrsac.springmvc.model.User;

public class UserDaoImpl implements UserDao {
	
	  @Autowired
	  DataSource datasource;
	
	  @Autowired
	  JdbcTemplate jdbcTemplate;

	@Override
	 public void register(User user) {
	    String sql = "insert into users values(?,?,?,?,?,?,?)";
	    System.out.println("SQL===" + sql);
	    jdbcTemplate.update(sql, new Object[] { 
	    		user.getUsername1(), user.getPassword(), user.getFirstname(),
	    user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() 
	    
	    });
	    }

	@Override
	public User login(Login login) {
		// TODO Auto-generated method stub
		System.out.println(" Login Username --- > " + login.getUsername());
		System.out.println(" Login GetPassword --- > " + login.getPassword());
		String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
	    + "'";
	    List<User> users = jdbcTemplate.query(sql, new UserMapper());
	    
	    return users.size() > 0 ? users.get(0) : null;
	}

}

class UserMapper implements RowMapper<User> {
	  public User mapRow(ResultSet rs, int arg1) throws SQLException {
	    User user = new User();
	    user.setUsername1(rs.getString("username"));
	    user.setPassword(rs.getString("password"));
	    user.setFirstname(rs.getString("firstname"));
	    user.setLastname(rs.getString("lastname"));
	    user.setEmail(rs.getString("email"));
	    user.setAddress(rs.getString("address"));
	    user.setPhone(rs.getInt("phone"));
	    return user;
	  }

	
}

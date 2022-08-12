package com.example.product.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.product.model.dto.Product;


public class ProductDao {
	public List<Product> findAll(){	
	
	ResultSet rs = null; // SELECT 후 결과값 받아올 객체
	
	String sql = "SELECT * FROM PRO_MANAGE";
	
		try(PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
			List<Product> list = new ArrayList<>();
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
//				Product pro = new Product();
//				pro.setpId(rs.getInt("p_id"));
//				pro.setpName(rs.getString("p_name"));
//				pro.setAmount(rs.getInt("amount"));
//				pro.setReceiveDate(rs.getDate("receive_date"));
				
				list.add(new Product(rs.getInt("p_id"), rs.getString("p_name"), rs.getInt("amount"), rs.getDate("receive_date")));
				
			}
			rs.close();
			return list;
			
		} catch (SQLException e) {
            throw new RuntimeException(e);
        }
		
	} // findAll 끝
	
	
	
	
	private Connection getConnection() throws SQLException {
		
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "HOSPITAL";
        String password = "HOSPITAL";

        return DriverManager.getConnection(url, username, password);
    }
}

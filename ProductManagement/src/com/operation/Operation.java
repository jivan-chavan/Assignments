package com.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.connection.MyConnection;
import com.entity.Hospital;

public class Operation {

	public void insertProduct(Hospital product) {
	    try {
	    	Connection connection = MyConnection.getMyConnection();
	        String sql = "INSERT INTO product (name, price) VALUES (?, ?)";
	        PreparedStatement preparedStatement = connection.prepareStatement(sql);
	        preparedStatement.setString(1, product.getName());
	        preparedStatement.setDouble(2, product.getPrice());
	        preparedStatement.executeUpdate();
	        System.out.println("Product added successfully.");
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Hospital getProductById(int id) {
	    try {
	    	Connection connection = MyConnection.getMyConnection();
	        String sql = "SELECT * FROM product WHERE id=?";
	        PreparedStatement preparedStatement = connection.prepareStatement(sql);
	        preparedStatement.setInt(1, id);
	        ResultSet resultSet = preparedStatement.executeQuery();

	        if (resultSet.next()) {
	            String name = resultSet.getString("name");
	            double price = resultSet.getDouble("price");
	           
	            return new Hospital(id, name, price);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return null;
	}
	public void updateProduct(Hospital product) {
	    try {	 
	    	Connection connection = MyConnection.getMyConnection();
	        String sql = "UPDATE product SET name=?, price=? WHERE id=?";
	        PreparedStatement preparedStatement = connection.prepareStatement(sql);
	        preparedStatement.setString(1, product.getName());
	        preparedStatement.setDouble(2, product.getPrice());
	        preparedStatement.setInt(3, product.getId());
	        preparedStatement.executeUpdate();
	        System.out.println("Product updated successfully.");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteProduct(int id) {
	    try {
	    	Connection connection = MyConnection.getMyConnection();
	        String sql = "DELETE FROM product WHERE id=?";
	        PreparedStatement preparedStatement = connection.prepareStatement(sql);
	        preparedStatement.setInt(1, id);
	        preparedStatement.executeUpdate();
	        System.out.println("Product deleted successfully.");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

    public List<Hospital> getAllProducts() {
        List<Hospital> productList = new ArrayList<>();

        try {
	    	Connection connection = MyConnection.getMyConnection();
            String sql = "SELECT * FROM product";
	        PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                Hospital product = new Hospital(id, name, price);
                productList.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return productList;
    }

	
	public void closeConnection() {
	    try {
	    	Connection connection = MyConnection.getMyConnection();
	        if (connection != null) {
	            connection.close();
	            System.out.println("Connection Closed successfully.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}

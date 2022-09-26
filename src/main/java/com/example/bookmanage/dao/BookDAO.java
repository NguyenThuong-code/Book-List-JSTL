package com.example.bookmanage.dao;

import com.example.bookmanage.dbconnect.DBConnect;
import com.example.bookmanage.entity.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    Connection connection;
    public BookDAO(){
        connection= DBConnect.getConnection();
    }
    public List<Book> getBookList(){
        List<Book> bookList =new ArrayList<>();

        try {
            String sql="SELECT *FROM book";
            PreparedStatement ps=connection.prepareStatement(sql);
            ResultSet resultSet=ps.executeQuery();
            while(resultSet.next()){
                int id=resultSet.getInt(1);
                String title =resultSet.getString(2);
                String author = resultSet.getString("author");
               Float price = resultSet.getFloat("price");
                Book book= new Book(id,title,author,price);
                bookList.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookList;
    }
}

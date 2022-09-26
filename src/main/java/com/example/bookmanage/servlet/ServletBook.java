package com.example.bookmanage.servlet;

import com.example.bookmanage.dao.BookDAO;
import com.example.bookmanage.entity.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet( value = "/")
public class ServletBook extends HttpServlet {
    private BookDAO bookDAO;
    @Override
    public void init() throws ServletException {
       bookDAO= new BookDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
showBookList(request,response);
    }
    private  void  showBookList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> bookList= bookDAO.getBookList();
        req.setAttribute("books",bookList);
        RequestDispatcher rd=req.getRequestDispatcher("viewbook.jsp");
        rd.forward(req,resp);
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}

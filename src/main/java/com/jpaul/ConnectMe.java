package com.jpaul;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ConnectMe extends HttpServlet{
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)throws ServletException, IOException{
        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();
        printWriter.println("<h1>Hello World</h1>");
    }



}

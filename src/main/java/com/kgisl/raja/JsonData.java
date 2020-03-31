package com.kgisl.raja;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/tee")
public class JsonData extends HttpServlet{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student s = new Student();
        s.setId(10);
        s.setName("lolo");
        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("appliucation/json");
        resp.setCharacterEncoding("UTF-8");
        String data = new Gson().toJson(s);
        resp.getWriter().print(data);
    }
}
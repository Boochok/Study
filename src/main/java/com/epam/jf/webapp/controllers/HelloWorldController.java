package com.epam.jf.webapp.controllers;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello",
        initParams = @WebInitParam(name = "param-name", value = "12345"))
public class HelloWorldController extends HttpServlet {

    private int initParameter;

    //final servlet's initialization
    @Override
    public void init(ServletConfig config) throws ServletException {
        initParameter = Integer.parseInt(config.getInitParameter("param-name"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest();
    }

    private void processRequest() {
        System.out.println("Hello, World! " + initParameter);
    }


    //shutdown.sh(bat)
    @Override
    public void destroy() {
        System.out.println("Пока!");
    }
}

package com.rakuten.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerView
 */
@WebServlet("/ControllerView")
public class ControllerView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String num1 = request.getParameter("num1");
String num2 = request.getParameter("num2");
try{
	int n1 = Integer.parseInt(num1);
	int n2 = Integer.parseInt(num2);
	System.out.println(n1/n2);
}

catch(NumberFormatException n){
	n.printStackTrace();
	System.out.println("Only numeric allowed");
}
catch(ArithmeticException a){
		a.printStackTrace();
		System.out.println("Please don't divied by 0");
	}
	
	}

}

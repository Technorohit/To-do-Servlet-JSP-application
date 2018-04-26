package com.in28min;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28min.todo.TodoService;
@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	
	
	}
	protected void doPost(HttpServletRequest request,	HttpServletResponse response) throws ServletException, IOException{
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		request.getSession().setAttribute("name", name);
		request.setAttribute("password", pass);
		
		LoginService userValidationservice= new LoginService();
		TodoService todoservice= new TodoService();
		
		boolean isUserValid=userValidationservice.isValidUser(name, pass);
		if(isUserValid)
		{
			response.sendRedirect("/list-todos.do");
			
		}
		else
		{
			request.setAttribute("ErrorMsg","InvalidCredential !!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		//request.setAttribute("password", request.getParameter("password"));
		
	
	
	}
	
}

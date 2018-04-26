package com.in28min.todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28min.todo.TodoService;
@WebServlet(urlPatterns="/list-todos.do")
public class ListTodoServlet extends HttpServlet{
	TodoService todoservice= new TodoService();
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException{
		//PrintWriter writer=response.getWriter();
		//writer.print("Something Funny");
		//writer.print("Something Funny2");
		//String name=(request.getParameter("name"));
		//request.setAttribute("name", request.getParameter("name"));
		//request.setAttribute("password", request.getParameter("password"));
		request.setAttribute("todos", todoservice.retrieveTodos());
		request.getRequestDispatcher("/WEB-INF/views/list-todos.jsp").forward(request, response);
	
	
	}
	
}

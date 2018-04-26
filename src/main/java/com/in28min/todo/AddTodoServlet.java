package com.in28min.todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28min.todo.TodoService;
@WebServlet(urlPatterns="/add-todo.do")
public class AddTodoServlet extends HttpServlet{
	TodoService todoservice= new TodoService();
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);
	
	}
	
	
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException{
		String newTodo= request.getParameter("todo");
		String category= request.getParameter("category");
		todoservice.addTodo(new todo(newTodo,category));
		response.sendRedirect("/list-todos.do");
	
	
	}
	
}

package com.in28min.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
private static List<todo> todos = new ArrayList<todo>();
static {
	todos.add(new todo("Java Lab Exam On Monday","Study"));
	todos.add(new todo("ADT EXam on Wednesday","Study"));
	todos.add(new todo("DAA Exam on Friday","Study"));
}

public List<todo> retrieveTodos() {
	// TODO Auto-generated method stub
	return todos;
}
public void addTodo(todo todo)
{
	todos.add(todo);
	}
public void deleteTodo(todo todo)
{
	todos.remove(todo);
	}
}

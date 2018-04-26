package com.in28min.todo;

public class todo {
private String name;
private String category;


public todo(String name, String category) {
	// TODO Auto-generated constructor stub
	super();
	this.name = name;
	this.category=category;
}
@Override
public String toString() {
	return String.format("todo [name=%s, category=%s]", name, category);
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}



public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	todo other = (todo) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}


}

package com.baeldung.reactive.model;

import java.io.Serializable;

public class Foo implements Serializable {

	private static final long serialVersionUID = 5197961903650259043L;

	private int id;
	
	private String name;
	
	public Foo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
    public String toString() {
        return "Foo [id=" + id + ", name=" + name + "]";
    }
}

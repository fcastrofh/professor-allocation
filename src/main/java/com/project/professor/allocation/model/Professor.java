package com.project.professor.allocation.model;

public class Professor {

	private long id;
	private String cpf;
	private String name;

	public Professor() {
		super();
	}

	public Professor(long id, String cpf, String name) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

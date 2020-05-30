package br.cin.ufpe.hcs3.models;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private String name;
	private String document;
	private String departament;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", document=" + document + ", departament=" + departament + "]";
	}

}

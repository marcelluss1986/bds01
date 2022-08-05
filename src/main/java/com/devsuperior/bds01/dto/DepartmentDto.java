package com.devsuperior.bds01.dto;

import java.io.Serializable;

import com.devsuperior.bds01.entities.Department;

public class DepartmentDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Long id;
	public String name;
	
	public DepartmentDto() {
		
	}

	public DepartmentDto(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public DepartmentDto(Department entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

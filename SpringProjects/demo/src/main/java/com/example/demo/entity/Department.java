package com.example.demo.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Entity
@Data
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long  id;
	@NotBlank(message = "Please add department name")
	private String name;
	private String addr;
	@Length(max = 5,min = 2)
	private String code;


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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Department(Long id, String name, String addr, String code) {
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.code = code;
	}
	public Department() {
		
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", addr=" + addr + ", code=" + code + "]";
	}
	
	
}

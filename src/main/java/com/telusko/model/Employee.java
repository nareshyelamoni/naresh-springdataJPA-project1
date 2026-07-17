package com.telusko.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="city")
	private String city;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee(Integer id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Employee() {
		System.out.println("Employe object is added to table");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}

package com.example.tutorial4.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {
	@NotNull
	@Size(min=1)
	private String npm;
	
	@NotNull
	@Size(min=1)
	private String name;
	
	private double gpa;

//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getNpm() {
//		return npm;
//	}
//
//	public void setNpm(String npm) {
//		this.npm = npm;
//	}
//
//	public double getGpa() {
//		return gpa;
//	}
//
//	public void setGpa(double gpa) {
//		this.gpa = gpa;
//	}
}

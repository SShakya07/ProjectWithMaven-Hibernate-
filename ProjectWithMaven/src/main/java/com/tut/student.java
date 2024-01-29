package com.tut;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myStudent")
public class student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String studentName;
	private String studentAddress;
	
	private Certificate certi;
	
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	public student(int id, String studentName, String studentAddress) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public student() {
		super();
	}
	@Override
	public String toString() {
		return this.id+ " : " + this.studentName + " : " + this.studentAddress;
	}
	
	
	
	

}

package com.test.ms.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP")
public class Employee {

    @Id
    Integer empCode;
    String firstName;
    String lastName;
    String email;
    @ElementCollection(targetClass=String.class)
    List<String> mobileNumbers;
    Date doj;
    Double monthSal;
    
    
	public Integer getEmpCode() {
		return empCode;
	}
	public void setEmpCode(Integer empCode) {
		this.empCode = empCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public List<String> getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(List<String> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Double getMonthSal() {
		return monthSal;
	}
	public void setMonthSal(Double monthSal) {
		this.monthSal = monthSal;
	}

    
}
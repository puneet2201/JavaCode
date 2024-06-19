package com.immutable.java8;

public class Employee {
	
	private String name;
	private long empId;
	private String dept;
	private String gender;
	private long salary;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", dept=" + dept + ", gender=" + gender + ", salary="
				+ salary + "]";
	}
	public Employee(String name, long empId, String dept, String gender, long salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.dept = dept;
		this.gender = gender;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public long getEmpId() {
		return empId;
	}
	public String getDept() {
		return dept;
	}
	public String getGender() {
		return gender;
	}
	public long getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	

}

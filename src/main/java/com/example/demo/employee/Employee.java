package com.example.demo.employee;


public class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	private int exp;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String name, int age, int exp) {
		super();
		this.name = name;
		this.age = age;
		this.exp = exp;
	}
	public Employee() {
		}
	
	@Override
    public int compareTo(Employee emp) {
    	//replace your comparator her
		return (this.getAge() - emp.getAge());

    }
    
	
	
}


package com.example.tinhluongnhanvien;

public abstract class Employee {
	private String id;
	private String name;
	
	public Employee()
	{
		
	}
	public Employee(String id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public abstract double TinhLuong();
	
	public String toString()
	{
		return this.id + " - " + this.name;
	}
}

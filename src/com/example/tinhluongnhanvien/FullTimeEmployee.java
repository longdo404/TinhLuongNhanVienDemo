package com.example.tinhluongnhanvien;

public class FullTimeEmployee extends Employee {
	@Override
	public double TinhLuong()
	{
		return 500;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " --> FullTime : " + TinhLuong();
	}
}

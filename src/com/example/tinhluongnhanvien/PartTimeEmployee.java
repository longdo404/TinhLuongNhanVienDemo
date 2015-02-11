package com.example.tinhluongnhanvien;

public class PartTimeEmployee extends Employee {

	@Override
	public double TinhLuong() {
		// TODO Auto-generated method stub
		return 150;
	}
	@Override
	public String toString()
	{
		return super.toString() + " --> PartTime : " + TinhLuong();
	}
	
}

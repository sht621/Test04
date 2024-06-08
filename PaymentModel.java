package com.example.demo.model;

public class PaymentModel {
	
	private int Id;
    private int Income;
    private int Spend;
    private int Day;
    private int Item_Id;

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    public int getIncome() {
        return Income;
    }
    public void setIncome(int Income) {
    	this.Income = Income;
    }

    public int getSpend() {
        return Spend;
    }
    public void setSpend(int Spend) {
        this.Spend = Spend;
    }
    
    public int getDay() {
        return Day;
    }
    public void setDay(int Day) {
        this.Day = Day;
    }
    
    public int getItem_Id() {
        return Item_Id;
    }
    public void setItem_Id(int Item_Id) {
        this.Item_Id = Item_Id;
    }
}

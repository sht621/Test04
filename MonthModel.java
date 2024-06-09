package com.example.demo.model;

public class MonthModel {
	private int Id;
    private int Target;
    private int Spend_Sum;
    private int Differ;
    private int Month;
    private int Item_Id;

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    public int getTarget() {
        return Target;
    }
    public void setTarget(int Target) {
    	this.Target = Target;
    }

    public int getSpend_Sum() {
        return Spend_Sum;
    }
    public void setSpend_Sum(int Spend_Sum) {
        this.Spend_Sum = Spend_Sum;
    }
    
    public int getDiffer() {
        return Differ;
    }
    public void setDiffer(int Differ) {
        this.Differ = Differ;
    }
    
    public int getMonth() {
        return Month;
    }
    public void setMonth(int Month) {
        this.Month = Month;
    }
    
    public int getItem_Id() {
        return Item_Id;
    }
    public void setItem_Id(int Item_Id) {
        this.Item_Id = Item_Id;
    }
}

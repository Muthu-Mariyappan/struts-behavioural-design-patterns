package com.gmm.action;

import com.gmm.designpatterns.VendingMachine;
import com.opensymphony.xwork2.ActionSupport;


//Action class obtaining input value and setting output for jsp page
public class VendingAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String foodMsg;

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFoodMsg() {
		return foodMsg;
	}

	public void setFoodMsg(String foodMsg) {
		this.foodMsg = foodMsg;
	}

	public String getFood() {
		VendingMachine vm = new VendingMachine();
		this.foodMsg = vm.getFood(price);
		return SUCCESS;
	}
}
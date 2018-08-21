package com.gmm.designpatterns;


//Class and package implementing chain of responsibility pattern
abstract class HandlerBase {
	HandlerBase moneyHandler;

	public abstract String handleMoney(int money);

	public void setSuccessor(HandlerBase moneyHandler) {
		this.moneyHandler = moneyHandler;
	}
}

class TenRupeeHandler extends HandlerBase {

	TenRupeeHandler() {
		setSuccessor(new FiftyRupeeHandler());
	}

	@Override
	public String handleMoney(int money) {
		if (money == 10)
			return  " Have a refreshing cold water! ";
		else
			return this.moneyHandler.handleMoney(money);
	}

}

class FiftyRupeeHandler extends HandlerBase {
	FiftyRupeeHandler() {
		setSuccessor(new HundredRupeeHandler());
	}

	@Override
	public String handleMoney(int money) {
		if (money == 50)
			return  " Have a fresh Apple juice ";
		else
			return this.moneyHandler.handleMoney(money);
	}

}

class HundredRupeeHandler extends HandlerBase {
	HundredRupeeHandler() {
		setSuccessor(new TwoHunRupeeHandler());
	}

	@Override
	public String handleMoney(int money) {
		if (money == 100)
			return  " Have a warm badam milkshake ";
		else
			return this.moneyHandler.handleMoney(money);
	}

}

class TwoHunRupeeHandler extends HandlerBase {
	@Override
	public String handleMoney(int money) {
		if (money == 200)
			return  " Have a delicious chocolate cake ";
		else
			return  " Fake rupee ";
	}

}

public class VendingMachine {
	public String getFood(int money) {
		HandlerBase handler = new TenRupeeHandler();
		return handler.handleMoney(money);
	}
}
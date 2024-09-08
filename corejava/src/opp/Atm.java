package opp;

public class Atm {
	private double money;
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money=money;
	}
	public void withdrawMoney() {
		System.out.println("total amount of money: "+getMoney());
	}
}

package state;

import model.IceCream;

public interface State {
	public void generateIceCream();
	public void turnMoney();
	public void dispenseMoney();
	public void pickingIceCream();
	public IceCream takeIceCream();
}

package statepattern.entity;

public class WatingAcceptState implements OrderState {

	@Override
	public void doAction() {
		System.out.println("Actiton: wating for accept order..........");		
	}

}

package statepattern.entity;

public class DeliveryState implements OrderState {

	@Override
	public void doAction() {
		System.out.println("Actiton: Delivery to Customer....");
		
	}

}

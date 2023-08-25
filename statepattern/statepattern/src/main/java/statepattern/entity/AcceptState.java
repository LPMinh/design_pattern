package statepattern.entity;

public class AcceptState implements OrderState  {

	@Override
	public void doAction() {
		System.out.println("Actiton: otify Accept order to customer....");
		
	}

}

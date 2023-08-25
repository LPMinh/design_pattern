package test;

import statepattern.entity.AcceptState;
import statepattern.entity.DeliveryState;
import statepattern.entity.OrderContext;
import statepattern.entity.OrderState;
import statepattern.entity.WatingAcceptState;

public class Test {
	public static void main(String[] args) {
		System.out.println("change to wating:");
		OrderContext orderContext=new OrderContext();
		OrderState orderWaitingstate =new WatingAcceptState();
		orderContext.setOrderState(orderWaitingstate);
		orderContext.doAction();
		System.out.println("change to accept:");
		OrderState orderAccept=new AcceptState();
		orderContext.setOrderState(orderAccept);
		orderContext.doAction();
		
		System.out.println("change to deleverystate");
		OrderState orderDelivery=new DeliveryState();
		orderContext.setOrderState(orderDelivery);
		orderContext.doAction();
		
		
		
	}
}

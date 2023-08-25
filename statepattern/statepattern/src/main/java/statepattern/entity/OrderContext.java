package statepattern.entity;

public class OrderContext implements OrderState{

	@Override
	public void doAction() {
		orderState.doAction();
		
	}
	private OrderState orderState;
	public OrderState getOrderState() {
		return orderState;
	}
	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}
	public OrderContext(OrderState orderState) {
		super();
		this.orderState = orderState;
	}
	public OrderContext() {
		// TODO Auto-generated constructor stub
	}
	

}

package entities.order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	
	List<OrderItem> listitem = new ArrayList<>();
	
	public Order () {
		
	}

	public Order(Client client, Date moment, OrderStatus status) {
		this.client = client;
		this.moment = moment;
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		
		listitem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		
		listitem.remove(item);
	}
	
	public double total() { // corrigido
		
		double sum = 0.0;
		for(OrderItem item : listitem) {
			
			sum =+ item.subTotal();
			
		}
		return sum;
			
	}
	
	@Override  // corrigido (adicionado)
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: "+sdf.format(moment) + "\n");
		
		sb.append("Order status: "+status + "\n");
		
		sb.append("Client: "+client + "\n");
		
		sb.append("Order items: \n");
		
		for(OrderItem items : listitem) {
			sb.append(items + "\n");
			
		}
		sb.append("Total price: $"+String.format("%.2f", total())); // Corrigido (adicionado)
		
		return sb.toString();
		
		
	}
	
	
}

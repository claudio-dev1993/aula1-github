package entities.order;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	
	private Product product;
	
	public OrderItem (Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal() {
		
		Double result = quantity * price;
		
		return result;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(product + ", ");
		sb.append("Quantity: " + quantity);
		sb.append("Subtotal: " + subTotal());
		
		return sb.toString();
	}
	
	
	
}

package entities.products;

public final class ImportedProduct extends Product {

	private Double customsFee;

	public ImportedProduct() {

	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.getName() 
				+ " $ "
				+ totalPrice() 
				+ " (Customs Fee: $ " 
				+ getCustomsFee() + ")");

		return sb.toString();
	}

	public Double totalPrice() {
		
		Double sum = getPrice() + getCustomsFee();

		return sum;
	}

}

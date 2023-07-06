package ex1;

public class Prod {
	long id;
	String name;
	String category;
	double price;

	public Prod(long id, String name, String category, double price) {
		this.setId(id);
		this.setName(name);
		this.setCategory(category);
		this.setPrice(price);
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(double price) {
		this.price = price;

	}

	public long getId() {
		return id;
	}

	public String name() {
		return name;
	}

	public String getCatedory() {
		return category;
	}

	public double getPrice() {
		return price;
	}
}
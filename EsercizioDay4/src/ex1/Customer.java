package ex1;

public class Customer {
	Integer tier;
	long id;
	String name;

	public Customer(Long _id, String _name, Integer _tier) {
		this.setId(id);
		this.setName(name);
		this.setTier(tier);

	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String name() {
		return name;
	}

	public Integer getTier() {
		return tier;
	}

	public void setTier(Integer tier) {
		this.tier = tier;
	}
}
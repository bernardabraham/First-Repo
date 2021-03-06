package qa.com.TddLibrary2;

public abstract class Item {

	private int pages;
	private double cost;
	private boolean available;
	private int id;

	public Item(int pages, double cost, boolean available, int id) {
		super();
		this.pages = pages;
		this.cost = cost;
		this.available = available;
		this.id = id;
	}	
	public Item(int pages, double cost, boolean available) {
		super();
		this.pages = pages;
		this.cost = cost;
		this.available = available;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean getAvailable() {
		return available;
	}

	public void setID(int id) {
		this.setId(id);
	}

	public int getID() {
		return this.getId();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}

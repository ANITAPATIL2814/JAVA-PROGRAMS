package DSA;
//implement class comparableEg
public class Product implements Comparable<Product> {
	int pid;
	String name;
	int price;

	public Product(int pid, String name, int price) {
	super();
	this.pid = pid;
	this.name = name;
	this.price = price;
}

	//compare based on price so that we take int
	@Override
	public int compareTo(Product p) {
		if(price == p.price)
			return 0;
		else if(price>p.price)
			return 1;
		else
			return -1;
	}	
}

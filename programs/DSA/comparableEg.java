package DSA;
import java.util.*;

/*
 * To sort object of user defined class 
 * used only for Single sorting
 * method : CompareTo(object)
 * It is an interface so we need to implement
 */
//Product - subclasss implement comparableEg
public class comparableEg {

	public static void main(String[] args) {
		//using treeset also we can do but remove 27 line Collections.sort(ap); becz it already sort
		//TreeSet<Product> ap= new TreeSet<>();

		ArrayList<Product> ap= new ArrayList<>();
		ap.add(new Product(70,"pencil",20));
		ap.add(new Product(71,"pen",50));
		ap.add(new Product(72,"bottle",25));
		ap.add(new Product(73,"marker",20));
		ap.add(new Product(74,"pencil",10));
		ap.add(new Product(75,"rubber",30));
		ap.add(new Product(76,"rubber",40));
		ap.add(new Product(77,"book",15));
		ap.add(new Product(73,"marker",20));
		Collections.sort(ap);
		for(Product pp : ap) {
			System.out.println(pp.price+" "+pp.name+" "+pp.pid);
		}
	}

}

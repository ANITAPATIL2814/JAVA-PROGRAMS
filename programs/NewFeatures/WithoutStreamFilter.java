package NewFeatures;
/*
 * main class :ProductLambda 
 * sub class : StreamFilter, WithoutStreamFilter
 */
import java.util.ArrayList;
public class WithoutStreamFilter {

	public static void main(String[] args) {
		ArrayList<ProductLambda> ap= new ArrayList<>();
		ap.add(new ProductLambda(70,"pencil",20));
		ap.add(new ProductLambda(71,"pen",50));
		ap.add(new ProductLambda(72,"bottle",25));
		ap.add(new ProductLambda(73,"marker",20));
		ap.add(new ProductLambda(74,"pencil",10));
		ap.add(new ProductLambda(75,"rubber",30));
		ap.add(new ProductLambda(76,"rubber",40));
		ap.add(new ProductLambda(77,"book",15));
		ap.add(new ProductLambda(73,"marker",20));
		
		ArrayList<Integer> pricelist=new ArrayList<>();
		for(ProductLambda product : ap) {
			//filtering data list
			if(product.price<30) {
				pricelist.add(product.price); //adding product to pricelist				
			}
		}
		System.out.println(pricelist); //display data 

	}

}

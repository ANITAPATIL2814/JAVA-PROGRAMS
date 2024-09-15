package NewFeatures;
/*
 * main class :ProductLambda 
 * sub class : StreamFilter, WithoutStreamFilter
 */
import java.util.*;
import java.util.stream.Collectors; //all the function come from this package - filter, map, collect

public class StreamFilter {

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
		
		//listobject.stream.filter(filtering data ).map(fetching price).collect(show collecting as list)
		List<Integer> pricelist=ap.stream().filter(pp->pp.price<30).map(pp->pp.price).collect(Collectors.toList());
		System.out.println(pricelist);
		
		List<Integer> pricelist1=ap.stream().filter(pp->pp.price>=30).map(pp->pp.price).collect(Collectors.toList());
		System.out.println(pricelist1);
	}

}

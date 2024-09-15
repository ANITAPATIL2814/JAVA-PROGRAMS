package NewFeatures;
/*
 * provide implementation to functional interface
 * less coding
 * It can use with paramter or without parameter
 * {argument} - >{ body}
 */
public class LambdaExpression {

	public static void main(String[] args) {
		//call directly with help of interface FunctionalInterfaceEg(class name)
		FunctionalInterfaceEg fi=(a,b) ->(a+b); 
		System.out.println(fi.calcAdd(10, 20));
	}

}

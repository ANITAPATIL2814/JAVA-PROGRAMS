package NewFeatures;
/*
 * sub class : WithoutLambda
 * main class :FunctionalInterfaceEg 
 */
public class WithoutLambda implements FunctionalInterfaceEg {
	@Override
	public int calcAdd(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		WithoutLambda w= new WithoutLambda();
		System.out.println(w.calcAdd(50,58));;
	}
}

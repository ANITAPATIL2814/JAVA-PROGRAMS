package Strings;
/*
 * non primitive data type - size not fixed or variable in size
 * collection or group of characters
 * example: mamta ma'aam or i am learning core java string topic
 *IMP : string constant(fixed) pool(store all thing) lies inside heap memory
//no modify / immutable

 */
public class string {

	public static void main(String[] args) {
		//string literal
		//both name and n1 will refer same memory
		String name="ItVedant";//checks in pool first if exist only adds reference to existing object
		String n1="ItVedant";//checks in pool first if doesn't exists  added new object
		System.out.println(name);
		//or
		char[]n2= {'I','t','v','e','d','n','t'};
		System.out.println(n2);
		//new keyword
		String name1= new String("ItVedant");
		System.out.println(name1);
		String name2= new String("ItVedant");
		System.out.println(name2);
		
		//== : check for *object* reference & equals():check for *value*
		System.out.println(name==n1); //true as both variable object reference is same
		System.out.println(name==name1);//false as both variable object reference is different
		System.out.println(name2.equals(name1));//true as both  object value is same
	}

}

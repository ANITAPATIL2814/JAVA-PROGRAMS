package OOPS;

/*
 * overriding : same method name, same datatype or no of paramter using inheritance
 * Animal.java
 * bird.java
 * WildAnimal.java
 */
public class Overriding {
	public static void main(String[] args) {
		Bird b=new Bird();
		b.makeSound();
		WildAnimal w=new WildAnimal();
		w.makeSound();
		Animal a=new Animal();
		a.makeSound();
	}

}

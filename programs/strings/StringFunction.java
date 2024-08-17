package Strings;
/*
 * 
 */
public class StringFunction {

	public static void main(String[] args) {
		String name="itvedantit";
		System.out.println(name.length()); //total character count
		System.out.println(name.replace("it", "IT")); //it will be replaced with IT
		System.out.println(name.contains("it"));//check it present in our string 
		System.out.println(name.concat(" vashi"));//append new word at end of current word
		System.out.println(name.substring(2,6));//piece from original word : start index, end index
		System.out.println(name.substring(2));//start index
		System.out.println(name);
	}

}

package Strings;

import java.util.*;

public class checkvowelConsonant {

	static void CheckVowelConsonant(String sentence) {
		int Vcount=0, Ccount=0;
		for(int i =0;i<sentence.length();i++) {
			if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u') {
				Vcount++;
			}else if(sentence.charAt(i)>'a' && sentence.charAt(i)<='z') {
				Ccount++;
			}
		}
		System.out.println("no of vowels : "+Vcount);
		System.out.println("No of consonants: "+Ccount);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String sentence=sc.next();
		sentence=sentence.toLowerCase();
		CheckVowelConsonant(sentence);
	}

}

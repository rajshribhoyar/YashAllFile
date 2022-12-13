package string.com;

import java.util.ArrayList;


public class JoinMethod {
	public static void main(String[] args) {
		// First Type:
		  String srt1="I"; String srt2="Love"; 
		  String srt3="Java"; String joined=
		  String.join(" ", srt1, srt2, srt3); 
		  System.out.println(joined);// output: I Lova Java
		 	
		//Secnod type:
		ArrayList<String> text =new ArrayList<>();
		text.add("I");
		text.add("Am");
		text.add("Java");
		String result;
		result=String.join("-", text);
		System.out.println(result);// output:I-Am-Java

		}
}

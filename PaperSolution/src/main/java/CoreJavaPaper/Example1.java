package CoreJavaPaper;

public class Example1 {
	public static void main(String[] args) {
		String word1="Willow";
		String word2="ow";
		
		System.out.println(word1=="Willow");
		System.out.println(word1==("Will"+"ow"));
		System.out.println(word1==("Will"+word2));
	}

}
